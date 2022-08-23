package camchua.hoyoapi.utils;

import camchua.hoyoapi.HoyoAPI;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Random;
import java.util.stream.Collectors;

public class Utils {

	public static String generateDS() {
		String md5Version = HoyoAPI.OS_DS_SALT;
		String t = Long.toString(System.currentTimeMillis() / 1000);
		String r = random(6);
		String c = DigestUtils.md5DigestAsHex(("salt=" + md5Version + "&t=" + t + "&r=" + r).getBytes());
		return t + "," + r + "," + c;
	}
	
	public static String generateDS_CN() {
		String md5Version = "cx2y9z9a29tfqvr1qsq6c7yz99b5jsqt";
		String t = Long.toString(System.currentTimeMillis() / 1000);
		String r = random(6);
		String c = DigestUtils.md5DigestAsHex(("salt=" + md5Version + "&t=" + t + "&r=" + r).getBytes());
		return t + "," + r + "," + c;
	}

	public static String random(int len) {
    	Random rd = new Random();
        char[] x = "1234567890abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] str = new char[len];
        for (int i = 0; i < len; i++) {
        	str[i] = x[rd.nextInt(x.length)];
        }
        return new String(str);
	}


	public static JSONObject getConnectionResult(String url, String method, boolean cn) {
		try {
			CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
			HttpURLConnection connection = null;
			try {
				connection = (HttpURLConnection) new URL(url).openConnection();
			} catch (Exception e) {
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
			connection.setRequestProperty("sec-fetch-site", "same-site");
			connection.setRequestProperty("sec-fetch-mode", "cors");
			connection.setRequestProperty("sec-fetch-dest", "empty");
			connection.setRequestProperty("ds", cn ? Utils.generateDS_CN() : Utils.generateDS());
			connection.setRequestProperty("cookie", HoyoAPI.inst().getCookie());
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			final BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			final String response = reader.lines().collect(Collectors.joining());
			return new JSONObject(response);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static JSONObject getConnectionResult(String url, String method, String ltuid, String ltoken, String cookie_token, boolean cn) {
		HoyoAPI hoyo = HoyoAPI.inst();
		try {
			CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
			HttpURLConnection connection = null;
			try {
				connection = (HttpURLConnection) new URL(url).openConnection();
			} catch (Exception e) {
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
			connection.setRequestProperty("sec-fetch-site", "same-site");
			connection.setRequestProperty("sec-fetch-mode", "cors");
			connection.setRequestProperty("sec-fetch-dest", "empty");
			connection.setRequestProperty("ds", cn ? Utils.generateDS_CN() : Utils.generateDS());
			connection.setRequestProperty("cookie", (!ltuid.isEmpty() && !ltoken.isEmpty()) ? hoyo.getCookie(ltoken, ltuid, cookie_token) : hoyo.getCookie());
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			final BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			final String response = reader.lines().collect(Collectors.joining());
			return new JSONObject(response);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
