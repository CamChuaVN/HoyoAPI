package camchua.hoyoapi.api.genshin;

import camchua.hoyoapi.HoyoAPI;
import camchua.hoyoapi.api.genshin.data.cdkey.CdkeyRedeem;
import camchua.hoyoapi.api.genshin.data.user.Player;
import camchua.hoyoapi.api.genshin.data.user.model.gachalog.GachaLog;
import camchua.hoyoapi.api.genshin.enums.GachaType;
import camchua.hoyoapi.utils.GenshinUtils;
import camchua.hoyoapi.utils.Utils;

public class GenshinImpactAPI {
	
	private HoyoAPI hoyoAPI;
	
	public GenshinImpactAPI(HoyoAPI hoyoAPI) {
		this.hoyoAPI = hoyoAPI;
	}
	

	public String getPlayerInfo(String uid, boolean cn) {
		String server = GenshinUtils.serverByUID(uid);
		String urlPath = "game_record/genshin/api/index" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? HoyoAPI.CN_GAME_RECORD_URL + urlPath : HoyoAPI.OS_GAME_RECORD_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Player Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Player Info exception: " + e.getMessage());
		}

		return "";
	}

	public String getPlayerInfo(String uid, String ltuid, String ltoken, String cookie_token, boolean cn) {
		String server = GenshinUtils.serverByUID(uid);
		String urlPath = "game_record/genshin/api/index" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? HoyoAPI.CN_GAME_RECORD_URL + urlPath : HoyoAPI.OS_GAME_RECORD_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Player Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Player Info exception: " + e.getMessage());
		}

		return "";
	}

	public String getCharacterInfo(String uid, boolean cn) {
		String server = GenshinUtils.serverByUID(uid);
		String urlPath = "game_record/genshin/api/character" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? HoyoAPI.CN_GAME_RECORD_URL + urlPath : HoyoAPI.OS_GAME_RECORD_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Character Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "post", cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Character Info exception: " + e.getMessage());
		}

		return "";
	}

	public String getCharacterInfo(String uid, String ltuid, String ltoken, String cookie_token, boolean cn) {
		String server = GenshinUtils.serverByUID(uid);
		String urlPath = "game_record/genshin/api/character" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? HoyoAPI.CN_GAME_RECORD_URL + urlPath : HoyoAPI.OS_GAME_RECORD_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Character Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "post", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Character Info exception: " + e.getMessage());
		}

		return "";
	}

	public String getAbyssInfo(String uid, int scheduleType, boolean cn) {
		String server = GenshinUtils.serverByUID(uid);
		String urlPath = "game_record/genshin/api/spiralAbyss" + "?server=" + server + "&role_id=" + uid
				+ "&schedule_type=" + scheduleType;
		String url = cn ? HoyoAPI.CN_GAME_RECORD_URL + urlPath : HoyoAPI.OS_GAME_RECORD_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Abyss Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Abyss Info exception: " + e.getMessage());
		}

		return "";
	}

	public String getAbyssInfo(String uid, int scheduleType, String ltuid, String ltoken, String cookie_token, boolean cn) {
		String server = GenshinUtils.serverByUID(uid);
		String urlPath = "game_record/genshin/api/spiralAbyss" + "?server=" + server + "&role_id=" + uid
				+ "&schedule_type=" + scheduleType;
		String url = cn ? HoyoAPI.CN_GAME_RECORD_URL + urlPath : HoyoAPI.OS_GAME_RECORD_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Abyss Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Abyss Info exception: " + e.getMessage());
		}

		return "";
	}
	
	public String getDailyRewardInfo(boolean cn) {
		String urlPath = "event/sol/info?lang=en-us&act_id=e202102251931481";
		String url = cn ? HoyoAPI.CN_HK4E_URL + urlPath : HoyoAPI.OS_HK4E_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Reward Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Reward Info exception: " + e.getMessage());
		}
		
		return "";
	}

	public String getDailyRewardInfo(String ltuid, String ltoken, String cookie_token, boolean cn) {
		String urlPath = "event/sol/info?lang=en-us&act_id=e202102251931481";
		String url = cn ? HoyoAPI.CN_HK4E_URL + urlPath : HoyoAPI.OS_HK4E_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Reward Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Reward Info exception: " + e.getMessage());
		}

		return "";
	}
	
	public String getTravelerDiaryInfo(String uid, int month, boolean cn) {
		String server = GenshinUtils.serverByUID(uid);
		String urlPath = "event/ysledgeros/month_info" + "?month=" + month + "&lang=en-us" + "&uid=" + uid + "&region=" + server;
		String url = cn ? HoyoAPI.CN_HK4E_URL + urlPath : HoyoAPI.OS_HK4E_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Traveler Diary Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Traveler Diary Info exception: " + e.getMessage());
		}
		
		return "";
	}

	public String getTravelerDiaryInfo(String uid, int month, String ltuid, String ltoken, String cookie_token, boolean cn) {
		String server = GenshinUtils.serverByUID(uid);
		String urlPath = "event/ysledgeros/month_info" + "?month=" + month + "&lang=en-us" + "&uid=" + uid + "&region=" + server;
		String url = cn ? HoyoAPI.CN_HK4E_URL + urlPath : HoyoAPI.OS_HK4E_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Traveler Diary Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Traveler Diary Info exception: " + e.getMessage());
		}

		return "";
	}
	
	public String getDailyNoteInfo(String uid, boolean cn) {
		String server = GenshinUtils.serverByUID(uid);
		String urlPath = "game_record/genshin/api/dailyNote" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? HoyoAPI.CN_GAME_RECORD_URL + urlPath : HoyoAPI.OS_GAME_RECORD_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Note Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Note Info exception: " + e.getMessage());
		}
		
		return "";
	}

	public String getDailyNoteInfo(String uid, String ltuid, String ltoken, String cookie_token, boolean cn) {
		String server = GenshinUtils.serverByUID(uid);
		String urlPath = "game_record/genshin/api/dailyNote" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? HoyoAPI.CN_GAME_RECORD_URL + urlPath : HoyoAPI.OS_GAME_RECORD_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Note Info url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Note Info exception: " + e.getMessage());
		}

		return "";
	}
	
	public String getGachaLogInfo(String authKey, GachaType gachaType, String endId, boolean cn) {
		String urlPath = "event/gacha_info/api/getGachaLog" + "?authkey_ver=1" + "&sign_type=2" + "&auth_appid=webview_gacha" + "&init_type=" + gachaType.getGachaType() + "&lang=en" + "&authkey=" + authKey + "&gacha_type=" + gachaType.getGachaType() + "&page=1" + "&size=20" + ((endId == null || endId.isEmpty()) ? "" : "&end_id=" + endId);
		String url = cn ? HoyoAPI.CN_HK4E_URL + urlPath : HoyoAPI.OS_HK4E_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Gacha Log Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Gacha Log Info exception: " + e.getMessage());
		}
		
		return "";
	}
	
	
	public String getDailyRewardHome(boolean cn) {
		String urlPath = "event/sol/home?lang=en-us&act_id=e202102251931481";
		String url = cn ? HoyoAPI.CN_HK4E_URL + urlPath : HoyoAPI.OS_HK4E_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Reward Home url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Reward Home exception: " + e.getMessage());
		}
		
		return "";
	}
	
	
	public String getDailyRewardSign(boolean cn) {
		String urlPath = "event/sol/sign?lang=en-us&act_id=e202102251931481";
		String url = cn ? HoyoAPI.CN_HK4E_URL + urlPath : HoyoAPI.OS_HK4E_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Reward Sign url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "post", cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Reward Sign exception: " + e.getMessage());
		}
		
		return "";
	}

	public String getDailyRewardSign(String ltuid, String ltoken, String cookie_token, boolean cn) {
		String urlPath = "event/sol/sign?lang=en-us&act_id=e202102251931481";
		String url = cn ? HoyoAPI.CN_HK4E_URL + urlPath : HoyoAPI.OS_HK4E_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Reward Sign url: " + url);

		try {
			return Utils.getConnectionResult(url, "post", ltuid, ltoken, cookie_token, cn).toString();
		} catch (Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Daily Reward Sign exception: " + e.getMessage());
		}

		return "";
	}


	public String getWebExchangeCdkey(String uid, String cdkey, boolean cn) {
		String urlPath = "common/apicdkey/api/webExchangeCdkey" + "?lang=en" + "&game_biz=hk4e_global" + "&uid=" + uid + "&region=" + GenshinUtils.serverByUID(uid) + "&cdkey=" + cdkey;
		String url = cn ? HoyoAPI.CN_SG_HK4E_URL + urlPath : HoyoAPI.OS_SG_HK4E_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Web Exchange Cdkey url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", cn).toString();
		} catch(Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Web Exchange Cdkey exception: " + e.getMessage());
		}

		return "";
	}

	public String getWebExchangeCdkey(String uid, String ltuid, String ltoken, String cookie_token, String cdkey, boolean cn) {
		String urlPath = "common/apicdkey/api/webExchangeCdkey" + "?lang=en" + "&game_biz=hk4e_global" + "&uid=" + uid + "&region=" + GenshinUtils.serverByUID(uid) + "&cdkey=" + cdkey;
		String url = cn ? HoyoAPI.CN_SG_HK4E_URL + urlPath : HoyoAPI.OS_SG_HK4E_URL + urlPath;
		if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Web Exchange Cdkey url: " + url);

		try {
			return Utils.getConnectionResult(url, "get", ltuid, ltoken, cookie_token, cn).toString();
		} catch(Exception e) {
			if(hoyoAPI.isDebug()) System.out.println("[Genshin Impact] Web Exchange Cdkey exception: " + e.getMessage());
		}

		return "";
	}
	
	

	public Player getPlayer(String uid) {
		boolean cn = GenshinUtils.isCN(uid);
		return GenshinUtils.initPlayer(uid, cn);
	}
	
	public GachaLog getGachaLog(String autkKey, GachaType gachaType) {
		return GenshinUtils.initGachaLog(autkKey, gachaType, false);
	}

	public CdkeyRedeem redeemCode(String uid, String code) {
		boolean cn = GenshinUtils.isCN(uid);
		return GenshinUtils.initCdkeyRedeem(uid, code, cn);
	}

}
