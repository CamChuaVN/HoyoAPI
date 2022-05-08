import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

import org.json.JSONObject;

import camchua.genshinimpactapi.GenshinImpact;
import camchua.genshinimpactapi.utils.Utils;

public class TestTool {
	
	public static void main(String[] args) {
		System.out.println(TestTool.getConnectionResult("https://webapi-os.account.mihoyo.com/Api/regist_by_account?is_crypto=false&not_login=0&username=anlun0107@gmail.com&password=camchua@123", "post", "", false));
	}
	
	
	
	public static JSONObject getConnectionResult(String url, String method, String reqBody, boolean cn) {
		try {
			CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
			HttpURLConnection connection = null;
			try {
				connection = (HttpURLConnection) new URL(url + reqBody).openConnection();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			connection.setRequestMethod(method.toUpperCase());
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
