package camchua.genshinimpactapi.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import camchua.genshinimpactapi.GenshinImpact;
import camchua.genshinimpactapi.enums.ElementEnum;
import camchua.genshinimpactapi.model.Avatar;
import camchua.genshinimpactapi.model.Player;
import camchua.genshinimpactapi.model.Stat;

public class Utils {
	
	public static String generateDS() {
		PythonInterpreter python = new PythonInterpreter();
		python.set("salt", "6cqshh5dhw73bzxn20oexa9k516chk7s");
		python.set("r", "ABCDEF");
		python.exec("import time, hashlib");
		python.exec("t = int(time.time())");
		python.exec("e = 'salt=' + salt + '&t=' + str(t) + '&r=' + r");
		python.exec("h = hashlib.md5(e.encode()).hexdigest()");
		python.exec("result = str(t) + ',' + r + ',' + h");
		PyObject result = python.get("result");
		python.close();
		return result.asString();
	}
	
	public static String getServerByUid(String uid) {
		char first = uid.charAt(0);
		String server = null;
		switch(first) {
		case '1': 
        	server = "cn_gf01"; 
        	break;
		case '2': 
			server = "cn_gf01"; 
			break;
		case '5': 
			server = "cn_qd01"; 
			break;
		case '6': 
			server = "os_usa"; 
			break;
		case '7': 
			server = "os_euro"; 
			break;
		case '8': 
			server = "os_asia"; 
			break;
		case '9': 
			server = "os_cht"; 
			break;
		default:
			System.out.println("Wrong UID: " + uid);
			throw new IllegalArgumentException("Wrong uid");
		}
		return server;
	}
	
	public static JSONObject getConnectionResult(String url, String method, String reqBody) {
		try {
			CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
			HttpURLConnection connection = null;
			try {
				connection = (HttpURLConnection) new URL(url + reqBody).openConnection();
			} catch(Exception e) {
				e.printStackTrace();
				return null;
			}
			connection.setRequestMethod(method.toUpperCase());
			connection.setRequestProperty("User-Agent", "miHoYoBBS/2.5.1");
			connection.setRequestProperty("x-rpc-language", "en-us");
			connection.setRequestProperty("x-rpc-app_version", "2.2.1");
			connection.setRequestProperty("x-rpc-client_type", "4");
			connection.setRequestProperty("x-requested-with", "com.mihoyo.hyperion");
			connection.setRequestProperty("referer", "https://webstatic.mihoyo.com/");
			connection.setRequestProperty("origin", "https://webstatic.mihoyo.com");
			connection.setRequestProperty("ds", Utils.generateDS());
			connection.setRequestProperty("cookie", GenshinImpact.inst().getCookie());
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			final BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			final String response = reader.lines().collect(Collectors.joining());
			return new JSONObject(response);
		} catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Player initPlayer(String uid, boolean cn) {
		String info_str = GenshinImpact.getAPI().getPlayerInfo(uid, cn);
		JSONObject info = new JSONObject(info_str);
		if(info.getInt("retcode") != 0) {
			System.out.println("Init Player error: " + info.getString("message"));
			return new Player("", new ArrayList<>(), null);
		}
		
		String avt_str = GenshinImpact.getAPI().getCharacterInfo(uid, cn);
		JSONObject avt = new JSONObject(avt_str);
		
		JSONObject stats = info.getJSONObject("data").getJSONObject("stats");
		
		List<Avatar> avt_list = new ArrayList<>();
		int avatarNumber = stats.getInt("avatar_number");
		for(int i = 0; i < avatarNumber; i++) {
			JSONObject avts = avt.getJSONObject("data").getJSONArray("avatars").getJSONObject(i);
			
			String avatarId = String.valueOf(avts.getInt("id"));
			String name = avts.getString("name");
			ElementEnum element = ElementEnum.valueOf(avts.getString("element").toUpperCase());
			int rarity = avts.getInt("rarity");
			int fetter = avts.getInt("fetter");
			int level = avts.getInt("level");
			
			Avatar avtss = new Avatar(uid, avatarId, name, element, rarity, fetter, level);
			avt_list.add(avtss);
		}
		
		Stat stat = null;
		if(true) {
			int activeDayNumber = stats.getInt("active_day_number");
			int achievementNumber = stats.getInt("achievement_number");
			int winRate = stats.getInt("win_rate");
			
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
			
			String spiralAbyss = stats.getString("spiral_abyss");
			
			stat = new Stat(uid, activeDayNumber, achievementNumber, winRate, 
					anemoculusNumber, geoculusNumber, electroculusNumber, 
					avatarNumber, wayPointNumber, domainNumber, 
					preciousChestNumber, luxuriousChestNumber, exquisiteChestNumber, commonChestNumber, magicChestNumber, 
					spiralAbyss);
		}
		
		return new Player(uid, avt_list, stat);
	}

}
