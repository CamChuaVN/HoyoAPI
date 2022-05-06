package camchua.genshinimpactapi;

import camchua.genshinimpactapi.model.Player;
import camchua.genshinimpactapi.utils.Utils;

public class GenshinImpactAPI {
	
	private String OS_DS_SALT = "6cqshh5dhw73bzxn20oexa9k516chk7s";
	private String OS_TAKUMI_URL = "https://api-os-takumi.mihoyo.com/";
	private String OS_GAME_RECORD_URL = "https://bbs-api-os.hoyoverse.com/";
	
	private String CN_DS_SALT = "xV8v4Qu54lUKrEYFZkJhB8cuOh9Asafs";
	private String CN_TAKUMI_URL = "https://api-takumi.mihoyo.com/";
	private String CN_GAME_RECORD_URL = "https://api-takumi.mihoyo.com/";
	
	
	GenshinImpactAPI() {
		
	}
	
	
	public String getPlayerInfo(String uid, boolean cn) {
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/index" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		System.out.println("Player Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", "").toString();
		} catch(Exception e) {
			System.out.println("Player Info exception: " + e.getMessage());
		}
		
		return "";
	}
	
	public String getCharacterInfo(String uid, boolean cn){
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/character" + "?server=" + server + "&role_id=" + uid;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		System.out.println("Character Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "post", "").toString();
		} catch(Exception e) {
			System.out.println("Character Info exception: " + e.getMessage());
		}
		
		return "";
	}
	
	public String getAbyssInfo(String uid, int scheduleType, boolean cn){
		String server = Utils.getServerByUid(uid);
		String urlPath = "game_record/genshin/api/spiralAbyss" + "?server=" + server + "&role_id=" + uid + "&schedule_type=" + scheduleType;
		String url = cn ? this.CN_GAME_RECORD_URL + urlPath : this.OS_GAME_RECORD_URL + urlPath;
		System.out.println("Abyss Info url: " + url);
		
		try {
			return Utils.getConnectionResult(url, "get", "").toString();
		} catch(Exception e) {
			System.out.println("Abyss Info exception: " + e.getMessage());
		}
		
		return "";
	}
	
	
	
	public Player getPlayer(String uid, boolean cn) {
		return Utils.initPlayer(uid, cn);
	}

}
