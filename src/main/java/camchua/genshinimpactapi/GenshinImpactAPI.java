package camchua.genshinimpactapi;

import camchua.genshinimpactapi.data.cdkey.CdkeyRedeem;
import camchua.genshinimpactapi.data.user.model.Player;
import camchua.genshinimpactapi.data.user.model.gachalog.GachaLog;
import camchua.genshinimpactapi.enums.GachaType;
import camchua.genshinimpactapi.utils.Utils;

public class GenshinImpactAPI {

	private final String OS_DS_SALT = "6cqshh5dhw73bzxn20oexa9k516chk7s";
	private final String OS_TAKUMI_URL = "https://api-os-takumi.mihoyo.com/";
	private final String OS_HK4E_URL = "https://hk4e-api-os.hoyoverse.com/";
	private final String OS_SG_HK4E_URL = "https://sg-hk4e-api.hoyoverse.com/";
	private final String OS_GAME_RECORD_URL = "https://bbs-api-os.hoyoverse.com/";


	private final String CN_DS_SALT = "xV8v4Qu54lUKrEYFZkJhB8cuOh9Asafs";
	private final String CN_TAKUMI_URL = "https://api-takumi.mihoyo.com/";
	private final String CN_HK4E_URL = "https://hk4e-api.mihoyo.com/";
	private final String CN_SG_HK4E_URL = "https://sg-hk4e-api.mihoyo.com/";
	private final String CN_GAME_RECORD_URL = "https://api-takumi.mihoyo.com/";

	GenshinImpactAPI() {

	}

	public String getPlayerInfo(String uid, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/index" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Player Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", "", cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Player Info exception: " + e.getMessage());
		}

		return "";
	}

	public String getPlayerInfo(String uid, String ltuid, String ltoken, String cookie_token, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/index" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Player Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", "", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Player Info exception: " + e.getMessage());
		}

		return "";
	}

	public String getCharacterInfo(String uid, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/character" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Character Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "post", "", cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Character Info exception: " + e.getMessage());
		}

		return "";
	}

	public String getCharacterInfo(String uid, String ltuid, String ltoken, String cookie_token, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/character" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Character Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "post", "", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Character Info exception: " + e.getMessage());
		}

		return "";
	}

	public String getAbyssInfo(String uid, int scheduleType, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/spiralAbyss" + "?server=" + server + "&role_id=" + uid
				+ "&schedule_type=" + scheduleType;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Abyss Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", "", cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Abyss Info exception: " + e.getMessage());
		}

		return "";
	}

	public String getAbyssInfo(String uid, int scheduleType, String ltuid, String ltoken, String cookie_token, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/spiralAbyss" + "?server=" + server + "&role_id=" + uid
				+ "&schedule_type=" + scheduleType;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Abyss Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", "", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Abyss Info exception: " + e.getMessage());
		}

		return "";
	}
	
	public String getDailyRewardInfo(boolean cn) {
		String urlPath = "event/sol/info?lang=en-us&act_id=e202102251931481";
		String url = cn ? this.CN_HK4E_URL + urlPath : this.OS_HK4E_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Daily Reward Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", "", cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Daily Reward Info exception: " + e.getMessage());
		}
		
		return "";
	}

	public String getDailyRewardInfo(String ltuid, String ltoken, String cookie_token, boolean cn) {
		String urlPath = "event/sol/info?lang=en-us&act_id=e202102251931481";
		String url = cn ? this.CN_HK4E_URL + urlPath : this.OS_HK4E_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Daily Reward Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", "", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Daily Reward Info exception: " + e.getMessage());
		}

		return "";
	}
	
	public String getTravelerDiaryInfo(String uid, int month, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "event/ysledgeros/month_info" + "?month=" + month + "&lang=en-us" + "&uid=" + uid + "&region=" + server;
		String url = cn ? this.CN_HK4E_URL + urlPath : this.OS_HK4E_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Traveler Diary Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", "", cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Traveler Diary Info exception: " + e.getMessage());
		}
		
		return "";
	}

	public String getTravelerDiaryInfo(String uid, int month, String ltuid, String ltoken, String cookie_token, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "event/ysledgeros/month_info" + "?month=" + month + "&lang=en-us" + "&uid=" + uid + "&region=" + server;
		String url = cn ? this.CN_HK4E_URL + urlPath : this.OS_HK4E_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Traveler Diary Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", "", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Traveler Diary Info exception: " + e.getMessage());
		}

		return "";
	}
	
	public String getDailyNoteInfo(String uid, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/dailyNote" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Daily Note Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", "", cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Daily Note Info exception: " + e.getMessage());
		}
		
		return "";
	}

	public String getDailyNoteInfo(String uid, String ltuid, String ltoken, String cookie_token, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/dailyNote" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Daily Note Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", "", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Daily Note Info exception: " + e.getMessage());
		}

		return "";
	}
	
	public String getGachaLogInfo(String authKey, GachaType gachaType, String endId, boolean cn) {
		String urlPath = "event/gacha_info/api/getGachaLog" + "?authkey_ver=1" + "&sign_type=2" + "&auth_appid=webview_gacha" + "&init_type=" + gachaType.getGachaType() + "&lang=en" + "&authkey=" + authKey + "&gacha_type=" + gachaType.getGachaType() + "&page=1" + "&size=20" + ((endId == null || endId.isEmpty()) ? "" : "&end_id=" + endId);
		String url = cn ? this.CN_HK4E_URL + urlPath : this.OS_HK4E_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Gacha Log Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", "", cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Gacha Log Info exception: " + e.getMessage());
		}
		
		return "";
	}
	
	
	public String getDailyRewardHome(boolean cn) {
		String urlPath = "event/sol/home?lang=en-us&act_id=e202102251931481";
		String url = cn ? this.CN_HK4E_URL + urlPath : this.OS_HK4E_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Daily Reward Home url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", "", cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Daily Reward Home exception: " + e.getMessage());
		}
		
		return "";
	}
	
	
	public String getDailyRewardSign(boolean cn) {
		String urlPath = "event/sol/sign?lang=en-us&act_id=e202102251931481";
		String url = cn ? this.CN_HK4E_URL + urlPath : this.OS_HK4E_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Daily Reward Sign url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "post", "", cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Daily Reward Sign exception: " + e.getMessage());
		}
		
		return "";
	}

	public String getDailyRewardSign(String ltuid, String ltoken, String cookie_token, boolean cn) {
		String urlPath = "event/sol/sign?lang=en-us&act_id=e202102251931481";
		String url = cn ? this.CN_HK4E_URL + urlPath : this.OS_HK4E_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Daily Reward Sign url: " + url);

		try {
			return Utils.getConnectionResult(url, "post", "", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Daily Reward Sign exception: " + e.getMessage());
		}

		return "";
	}


	public String getWebExchangeCdkey(String uid, String cdkey, boolean cn) {
		String urlPath = "common/apicdkey/api/webExchangeCdkey" + "?lang=en" + "&game_biz=hk4e_global" + "&uid=" + uid + "&region=" + Utils.getServerByUid(uid) + "&cdkey=" + cdkey;
		String url = cn ? this.CN_SG_HK4E_URL + urlPath : this.OS_SG_HK4E_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Web Exchange Cdkey url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", "", cn).toString();
		} catch(Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Web Exchange Cdkey exception: " + e.getMessage());
		}

		return "";
	}

	public String getWebExchangeCdkey(String uid, String ltuid, String ltoken, String cookie_token, String cdkey, boolean cn) {
		String urlPath = "common/apicdkey/api/webExchangeCdkey" + "?lang=en" + "&game_biz=hk4e_global" + "&uid=" + uid + "&region=" + Utils.getServerByUid(uid) + "&cdkey=" + cdkey;
		String url = cn ? this.CN_SG_HK4E_URL + urlPath : this.OS_SG_HK4E_URL + urlPath;
		if(GenshinImpact.inst().isDebug()) System.out.println("Web Exchange Cdkey url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", "", ltuid, ltoken, cookie_token, cn).toString();
		} catch(Exception e) {
			if(GenshinImpact.inst().isDebug()) System.out.println("Web Exchange Cdkey exception: " + e.getMessage());
		}

		return "";
	}
	
	

	public Player getPlayer(String uid, boolean cn) {
		return Utils.initPlayer(uid, cn);
	}
	
	public GachaLog getGachaLog(String autkKey, GachaType gachaType, boolean cn) {
		return Utils.initGachaLog(autkKey, gachaType, cn);
	}

	public CdkeyRedeem redeemCode(String uid, String code, boolean cn) {
		return Utils.initCdkeyRedeem(uid, code, cn);
	}

}
