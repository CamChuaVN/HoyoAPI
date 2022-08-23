package camchua.hoyoapi.utils;

import camchua.hoyoapi.HoyoAPI;
import camchua.hoyoapi.api.genshin.GenshinImpactAPI;
import camchua.hoyoapi.api.genshin.data.cdkey.CdkeyRedeem;
import camchua.hoyoapi.api.genshin.data.user.Player;
import camchua.hoyoapi.api.genshin.data.user.model.Avatar;
import camchua.hoyoapi.api.genshin.data.user.model.DailyReward;
import camchua.hoyoapi.api.genshin.data.user.model.Stat;
import camchua.hoyoapi.api.genshin.data.user.model.dailynote.DailyNote;
import camchua.hoyoapi.api.genshin.data.user.model.dailynote.DailyNoteExpeditions;
import camchua.hoyoapi.api.genshin.data.user.model.dailynote.DailyNoteTransformer;
import camchua.hoyoapi.api.genshin.data.user.model.explorations.ExplorationsOfferings;
import camchua.hoyoapi.api.genshin.data.user.model.explorations.WorldExplorations;
import camchua.hoyoapi.api.genshin.data.user.model.gachalog.GachaLog;
import camchua.hoyoapi.api.genshin.data.user.model.gachalog.GachaLogItem;
import camchua.hoyoapi.api.genshin.data.user.model.item.Reliquaries;
import camchua.hoyoapi.api.genshin.data.user.model.item.Weapon;
import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.SpiralAbyss;
import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.SpiralAbyssAvatar;
import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.floor.SpiralAbyssFirstHalfBattle;
import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.floor.SpiralAbyssFloor;
import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.floor.SpiralAbyssSecondHalfBattle;
import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.floor.SpiralAbyssStage;
import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.rank.*;
import camchua.hoyoapi.api.genshin.data.user.model.travelerdiary.TravelerDiary;
import camchua.hoyoapi.api.genshin.data.user.model.travelerdiary.TravelerDiaryDayData;
import camchua.hoyoapi.api.genshin.data.user.model.travelerdiary.TravelerDiaryMonthData;
import camchua.hoyoapi.api.genshin.data.user.model.travelerdiary.TravelerDiaryMonthDetail;
import camchua.hoyoapi.api.genshin.enums.ElementType;
import camchua.hoyoapi.api.genshin.enums.GachaType;
import org.json.JSONArray;
import org.json.JSONObject;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;

public class GenshinUtils {

    public static String serverByUID(String uid) {
        char first = uid.charAt(0);
        String server = null;
        switch(first) {
            case '1':
            case '2': return "cn_gf01";
            case '5': return "cn_qd01";
            case '6': return "os_usa";
            case '7': return "os_euro";
            case '8': return "os_asia";
            case '9': return "os_cht";
            default:
                throw new IllegalArgumentException("Wrong UID: " + uid);
        }
    }
    
    public static boolean isCN(String uid) {
        char first = uid.charAt(0);
        switch(first) {
            case '1':
            case '2':
            case '5': return true;
        }
        return false;
    }


    public static Player initPlayer(String uid, boolean cn) {
        GenshinImpactAPI api = HoyoAPI.inst().genshin();
        String info_str = api.getPlayerInfo(uid, cn);
        JSONObject info = new JSONObject(info_str);
        if(info.getInt("retcode") != 0) {
            System.out.println("Init Player error: " + info.getString("message"));
            return new Player("", new ArrayList<>(), null, null, null, null, null, null, "", 0, "");
        }

        String avt_str = api.getCharacterInfo(uid, cn);
        JSONObject avt = new JSONObject(avt_str);

        JSONObject stats = info.getJSONObject("data").getJSONObject("stats");

        String spiralAbyss_str = api.getAbyssInfo(uid, 1, cn);
        JSONObject spiralAbyss = new JSONObject(spiralAbyss_str);

        List<Avatar> avt_list = new ArrayList<>();
        int avatarNumber = stats.getInt("avatar_number");
        for(int i = 0; i < avatarNumber; i++) {
            JSONObject avts = avt.getJSONObject("data").getJSONArray("avatars").getJSONObject(i);

            String avatarId = String.valueOf(avts.getInt("id"));
            String name = avts.getString("name");
            ElementType element = ElementType.valueOf(avts.getString("element").toUpperCase());
            int rarity = avts.getInt("rarity");
            int fetter = avts.getInt("fetter");
            int level = avts.getInt("level");
            int constellations = avts.getInt("actived_constellation_num");
            String icon = avts.getString("icon");

            Weapon weapon = null;
            if(true) {
                JSONObject wps = avts.getJSONObject("weapon");
                int promoteLevel = wps.getInt("promote_level");
                int affixLevel = wps.getInt("affix_level");
                String typeName = wps.getString("type_name");
                int weaponLevel = wps.getInt("level");
                String weaponNname = wps.getString("name");
                String weaponIcon = wps.getString("icon");
                int id = wps.getInt("id");
                int type = wps.getInt("type");
                int weaponRarity = wps.getInt("rarity");
                String desc = wps.getString("desc");
                weapon = new Weapon(promoteLevel, affixLevel, typeName, weaponLevel, weaponNname, weaponIcon, id, type, weaponRarity, desc);
            }

            LinkedHashMap<Reliquaries.ReliquariesPosition, Reliquaries> reliquaries = new LinkedHashMap<>();
            if(true) {
                JSONArray rlqs = avts.getJSONArray("reliquaries");
                for(int ii = 0; ii < rlqs.length(); ii++) {
                    JSONObject rlq = rlqs.getJSONObject(ii);
                    Reliquaries.ReliquariesPosition position = Reliquaries.ReliquariesPosition.valueOf(rlq.getString("pos_name").replace(" ", "_").toUpperCase());
                    int reliquariesLevel = rlq.getInt("level");
                    String reliquariesName = rlq.getString("name");
                    String reliquariesIcon = rlq.getString("icon");
                    int id = rlq.getInt("id");
                    int reliquariesRarity = rlq.getInt("rarity");
                    reliquaries.put(position, new Reliquaries(position, reliquariesLevel, reliquariesName, reliquariesIcon, id, reliquariesRarity));
                }
            }

            Avatar avtss = new Avatar(uid, avatarId, name, element, rarity, fetter, level, constellations, reliquaries, weapon, icon);
            avt_list.add(avtss);
        }

        Stat stat = null;
        if(true) {
            int activeDayNumber = stats.getInt("active_day_number");
            int achievementNumber = stats.getInt("achievement_number");

            int anemoculusNumber = stats.getInt("anemoculus_number");
            int geoculusNumber = stats.getInt("geoculus_number");
            int electroculusNumber = stats.getInt("electroculus_number");

            int wayPointNumber = stats.getInt("way_point_number");
            int domainNumber = stats.getInt("domain_number");

            int preciousChestNumber = stats.getInt("precious_chest_number");
            int luxuriousChestNumber = stats.getInt("luxurious_chest_number");
            int exquisiteChestNumber = stats.getInt("exquisite_chest_number");
            int commonChestNumber = stats.getInt("common_chest_number");
            int magicChestNumber = stats.getInt("magic_chest_number");

            String spiralAbysss = stats.getString("spiral_abyss");

            stat = new Stat(uid, activeDayNumber, achievementNumber, anemoculusNumber, geoculusNumber,
                    electroculusNumber, avatarNumber, wayPointNumber, domainNumber, preciousChestNumber,
                    luxuriousChestNumber, exquisiteChestNumber, commonChestNumber, magicChestNumber, spiralAbysss);
        }

        SpiralAbyss sa = null;
        if(true) {
            JSONObject data = spiralAbyss.getJSONObject("data");

            SpiralAbyssDamageRank damageRank = new SpiralAbyssDamageRank(data.getJSONArray("damage_rank").getJSONObject(0).getInt("avatar_id"), data.getJSONArray("damage_rank").getJSONObject(0).getInt("rarity"), data.getJSONArray("damage_rank").getJSONObject(0).getInt("value"));
            SpiralAbyssDefeatRank defeatRank = new SpiralAbyssDefeatRank(data.getJSONArray("defeat_rank").getJSONObject(0).getInt("avatar_id"), data.getJSONArray("damage_rank").getJSONObject(0).getInt("rarity"), data.getJSONArray("damage_rank").getJSONObject(0).getInt("value"));
            SpiralAbyssEnergySkillRank energySkillRank = new SpiralAbyssEnergySkillRank(data.getJSONArray("energy_skill_rank").getJSONObject(0).getInt("avatar_id"), data.getJSONArray("damage_rank").getJSONObject(0).getInt("rarity"), data.getJSONArray("damage_rank").getJSONObject(0).getInt("value"));
            SpiralAbyssNormalSkillRank normalSkillRank = new SpiralAbyssNormalSkillRank(data.getJSONArray("normal_skill_rank").getJSONObject(0).getInt("avatar_id"), data.getJSONArray("damage_rank").getJSONObject(0).getInt("rarity"), data.getJSONArray("damage_rank").getJSONObject(0).getInt("value"));
            SpiralAbyssTakeDamageRank takeDamageRank = new SpiralAbyssTakeDamageRank(data.getJSONArray("take_damage_rank").getJSONObject(0).getInt("avatar_id"), data.getJSONArray("damage_rank").getJSONObject(0).getInt("rarity"), data.getJSONArray("damage_rank").getJSONObject(0).getInt("value"));

            SpiralAbyssRevealRank revealRank = null;
            List<SpiralAbyssRevealRank.RevealRank> rank = new ArrayList<>();
            JSONArray reveal = data.getJSONArray("reveal_rank");
            for(int i = 0; i < 4; i++) {
                if(reveal.isNull(i)) continue;

                JSONObject value = reveal.getJSONObject(i);
                rank.add(new SpiralAbyssRevealRank.RevealRank(value.getInt("avatar_id"), value.getInt("rarity"), value.getInt("value")));
            }
            revealRank = new SpiralAbyssRevealRank(rank);

            SpiralAbyssFloor spiralAbyssFloor = null;
            List<SpiralAbyssFloor.Floor> floor = new ArrayList<>();
            JSONArray floors = data.getJSONArray("floors");
            for(int i = 0; i < floors.length(); i++) {
                int star = floors.getJSONObject(i).getInt("star");
                int maxStar = floors.getJSONObject(i).getInt("max_star");
                int f = floors.getJSONObject(i).getInt("index");

                SpiralAbyssStage stage1 = new SpiralAbyssStage(0, 3, 1, new SpiralAbyssFirstHalfBattle(new ArrayList<>()), new SpiralAbyssSecondHalfBattle(new ArrayList<>()));
                SpiralAbyssStage stage2 = new SpiralAbyssStage(0, 3, 2, new SpiralAbyssFirstHalfBattle(new ArrayList<>()), new SpiralAbyssSecondHalfBattle(new ArrayList<>()));
                SpiralAbyssStage stage3 = new SpiralAbyssStage(0, 3, 3, new SpiralAbyssFirstHalfBattle(new ArrayList<>()), new SpiralAbyssSecondHalfBattle(new ArrayList<>()));
                for(int stage = 0; stage < 3; stage++) {
                    if(floors.getJSONObject(i).getJSONArray("levels").isNull(stage)) continue;

                    int stageStar = floors.getJSONObject(i).getJSONArray("levels").getJSONObject(stage).getInt("star");
                    int stageMaxStar = floors.getJSONObject(i).getJSONArray("levels").getJSONObject(stage).getInt("max_star");
                    int s = floors.getJSONObject(i).getJSONArray("levels").getJSONObject(stage).getInt("index");

                    JSONArray firstAvatar = floors.getJSONObject(i).getJSONArray("levels").getJSONObject(stage).getJSONArray("battles").getJSONObject(0).getJSONArray("avatars");
                    List<SpiralAbyssAvatar> firstAvatars = new ArrayList<>();
                    for(int a = 0; a < firstAvatar.length(); a++) {
                        firstAvatars.add(new SpiralAbyssAvatar(firstAvatar.getJSONObject(a).getInt("id"), firstAvatar.getJSONObject(a).getInt("level"), firstAvatar.getJSONObject(a).getInt("rarity")));
                    }
                    SpiralAbyssFirstHalfBattle firstHalf = new SpiralAbyssFirstHalfBattle(firstAvatars);

                    JSONArray secondAvatar = floors.getJSONObject(i).getJSONArray("levels").getJSONObject(stage).getJSONArray("battles").getJSONObject(1).getJSONArray("avatars");
                    List<SpiralAbyssAvatar> secondAvatars = new ArrayList<>();
                    for(int a = 0; a < secondAvatar.length(); a++) {
                        secondAvatars.add(new SpiralAbyssAvatar(secondAvatar.getJSONObject(a).getInt("id"), secondAvatar.getJSONObject(a).getInt("level"), secondAvatar.getJSONObject(a).getInt("rarity")));
                    }
                    SpiralAbyssSecondHalfBattle secondHalf = new SpiralAbyssSecondHalfBattle(secondAvatars);

                    if(stage == 0) stage1 = new SpiralAbyssStage(stageStar, stageMaxStar, s, firstHalf, secondHalf);
                    if(stage == 1) stage2 = new SpiralAbyssStage(stageStar, stageMaxStar, s, firstHalf, secondHalf);
                    if(stage == 2) stage3 = new SpiralAbyssStage(stageStar, stageMaxStar, s, firstHalf, secondHalf);
                }

                floor.add(new SpiralAbyssFloor.Floor(star, maxStar, f, stage1, stage2, stage3));
            }
            spiralAbyssFloor = new SpiralAbyssFloor(floor);

            int totalWinTimes = data.getInt("total_win_times");
            int totalStar = data.getInt("total_star");
            int totalBattleTimes = data.getInt("total_battle_times");
            String maxFloor = data.getString("max_floor");

            sa = new SpiralAbyss(totalWinTimes, totalStar, totalBattleTimes, maxFloor,
                    spiralAbyssFloor,
                    damageRank, defeatRank, energySkillRank, normalSkillRank, revealRank, takeDamageRank);
        }

        WorldExplorations we = null;
        List<WorldExplorations.Explorations> explorations = new ArrayList<>();
        if(true) {
            JSONArray e = info.getJSONObject("data").getJSONArray("world_explorations");
            for(int i = 0; i < e.length(); i++) {
                ExplorationsOfferings eo = null;
                if(e.getJSONObject(i).getJSONArray("offerings").isNull(0)) {
                    eo = new ExplorationsOfferings("", 0);
                } else {
                    String offeringName = e.getJSONObject(i).getJSONArray("offerings").getJSONObject(0).getString("name");
                    int offeringLevel = e.getJSONObject(i).getJSONArray("offerings").getJSONObject(0).getInt("level");
                    eo = new ExplorationsOfferings(offeringName, offeringLevel);
                }

                String name = e.getJSONObject(i).getString("name");
                String type = e.getJSONObject(i).getString("type");
                int level = e.getJSONObject(i).getInt("level");
                double explorationPercentage = Double.parseDouble(new DecimalFormat("#.#").format(Double.parseDouble(String.valueOf(e.getJSONObject(i).getInt("exploration_percentage"))) / 10D));
                int id = e.getJSONObject(i).getInt("id");
                int parentId = e.getJSONObject(i).getInt("parent_id");

                explorations.add(new WorldExplorations.Explorations(name, type, level, explorationPercentage, id, parentId, eo));
            }
            we = new WorldExplorations(explorations);
        }

        DailyReward dr = null;
        if(true) {
            String dailyRewardInfo_str = api.getDailyRewardInfo(cn);
            JSONObject dailyRewardInfo = new JSONObject(dailyRewardInfo_str).getJSONObject("data");

            int totalSignDay = dailyRewardInfo.getInt("total_sign_day");
            boolean sign = dailyRewardInfo.getBoolean("is_sign");
            String region = dailyRewardInfo.getString("region");
            boolean sub = dailyRewardInfo.getBoolean("is_sub");
            boolean firstBind = dailyRewardInfo.getBoolean("first_bind");

            dr = new DailyReward(totalSignDay, sign, region, sub, firstBind);
        }

        TravelerDiary td = null;
        if(true) {
            String diary_str = api.getTravelerDiaryInfo(uid, Calendar.getInstance().get(Calendar.MONTH) + 1, cn);
            JSONObject diary = new JSONObject(diary_str);

            int dayPrimogems = diary.getJSONObject("data").getJSONObject("day_data").getInt("current_primogems");
            int dayMora = diary.getJSONObject("data").getJSONObject("day_data").getInt("current_mora");
            TravelerDiaryDayData dayData = new TravelerDiaryDayData(dayPrimogems, dayMora);

            int monthPrimogems = diary.getJSONObject("data").getJSONObject("month_data").getInt("current_primogems");
            int monthMora = diary.getJSONObject("data").getJSONObject("month_data").getInt("current_mora");
            TravelerDiaryMonthData monthData = new TravelerDiaryMonthData(monthPrimogems, monthMora);

            JSONArray detail = diary.getJSONObject("data").getJSONObject("month_data").getJSONArray("group_by");
            List<TravelerDiaryMonthDetail.MonthDetail> details = new ArrayList<>();
            for(int i = 0; i < detail.length(); i++) {
                int actionId = detail.getJSONObject(i).getInt("action_id");
                String action = detail.getJSONObject(i).getString("action");
                int primogems = detail.getJSONObject(i).getInt("num");
                int percent = detail.getJSONObject(i).getInt("percent");

                details.add(new TravelerDiaryMonthDetail.MonthDetail(actionId, action, primogems, percent));
            }
            TravelerDiaryMonthDetail monthDetail = new TravelerDiaryMonthDetail(details);

            int dataMonth = diary.getJSONObject("data").getInt("data_month");
            String region = diary.getJSONObject("data").getString("region");
            td = new TravelerDiary(dataMonth, region, dayData, monthData, monthDetail);
        }

        DailyNote dn = null;
        if(true) {
            String note_str = api.getDailyNoteInfo(uid, cn);
            JSONObject note = new JSONObject(note_str);

            boolean to = note.getJSONObject("data").getJSONObject("transformer").getBoolean("obtained");
            int trs = note.getJSONObject("data").getJSONObject("transformer").getJSONObject("recovery_time").getInt("Second");
            int trm = note.getJSONObject("data").getJSONObject("transformer").getJSONObject("recovery_time").getInt("Minute");
            int trh = note.getJSONObject("data").getJSONObject("transformer").getJSONObject("recovery_time").getInt("Hour");
            int trd = note.getJSONObject("data").getJSONObject("transformer").getJSONObject("recovery_time").getInt("Day");
            boolean trr = note.getJSONObject("data").getJSONObject("transformer").getJSONObject("recovery_time").getBoolean("reached");
            DailyNoteTransformer t = new DailyNoteTransformer(to, trs, trm, trh, trd, trr);

            JSONArray expeditions = note.getJSONObject("data").getJSONArray("expeditions");
            List<DailyNoteExpeditions.Expeditions> expedition = new ArrayList<>();
            for(int i = 0; i < expeditions.length(); i++) {
                String rt = expeditions.getJSONObject(i).getString("remained_time");
                String s = expeditions.getJSONObject(i).getString("status");
                expedition.add(new DailyNoteExpeditions.Expeditions(rt, s));
            }
            DailyNoteExpeditions e = new DailyNoteExpeditions(expedition);

            int men = note.getJSONObject("data").getInt("max_expedition_num");
            int rdnl = note.getJSONObject("data").getInt("resin_discount_num_limit");
            int rrdn = note.getJSONObject("data").getInt("remain_resin_discount_num");
            int ttn = note.getJSONObject("data").getInt("total_task_num");
            int cr = note.getJSONObject("data").getInt("current_resin");
            int mhc = note.getJSONObject("data").getInt("max_home_coin");
            int ftn = note.getJSONObject("data").getInt("finished_task_num");
            int cen = note.getJSONObject("data").getInt("current_expedition_num");
            int mr = note.getJSONObject("data").getInt("max_resin");
            int chc = note.getJSONObject("data").getInt("current_home_coin");
            String rrt = note.getJSONObject("data").getString("resin_recovery_time");
            String hcrt = note.getJSONObject("data").getString("home_coin_recovery_time");
            boolean etrr = note.getJSONObject("data").getBoolean("is_extra_task_reward_received");
            dn = new DailyNote(men, rdnl, rrdn, ttn, cr, mhc, ftn, cen, mr, chc, rrt, hcrt, etrr, e, t);
        }

        JSONObject role = info.getJSONObject("data").getJSONObject("role");
        String name = role.getString("nickname");
        int level = role.getInt("level");
        String region = role.getString("region");
        return new Player(uid, avt_list, stat, sa, we, dr, td, dn, name, level, region);
    }

    public static GachaLog initGachaLog(String authKey, GachaType gachaType, boolean cn) {
        GenshinImpactAPI api = HoyoAPI.inst().genshin();
        String end_id = null;
        String region = "";
        List<GachaLogItem> item = new ArrayList<GachaLogItem>();
        while(true) {
            String log_str = api.getGachaLogInfo(authKey, gachaType, end_id, cn);
            JSONObject log = new JSONObject(log_str);

            region = log.getJSONObject("data").getString("region");
            JSONArray list = log.getJSONObject("data").getJSONArray("list");
            if(list.length() <= 0) {
                break;
            }

            for(int i = 0; i < list.length(); i++) {
                JSONObject data = log.getJSONObject("data").getJSONArray("list").getJSONObject(i);

                String u = data.getString("uid");
                String ii = data.getString("item_id");
                String it = data.getString("item_type");
                String c = data.getString("count");
                String n = data.getString("name");
                GachaType gt = GachaType.getGachaType(Integer.parseInt(data.getString("gacha_type")));
                String t = data.getString("time");
                String id = data.getString("id");
                String rt = data.getString("rank_type");

                item.add(new GachaLogItem(u, ii, it, c, n, gt, t, id, rt));

                if(i == list.length() - 1) end_id = id;
            }

            try {
                Thread.sleep(500);
            } catch(Exception e) {

            }
        }

        return new GachaLog(item, region);
    }

    public static CdkeyRedeem initCdkeyRedeem(String uid, String cdkey, boolean cn) {
        GenshinImpactAPI api = HoyoAPI.inst().genshin();
        String code_str = api.getWebExchangeCdkey(uid, cdkey, cn);
        JSONObject code = new JSONObject(code_str);
        return new CdkeyRedeem(cdkey, code.getInt("retcode") == 0, code.getString("message"), uid, GenshinUtils.serverByUID(uid));
    }
    
}
