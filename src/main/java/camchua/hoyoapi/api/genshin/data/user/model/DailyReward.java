package camchua.hoyoapi.api.genshin.data.user.model;

import camchua.hoyoapi.HoyoAPI;
import camchua.hoyoapi.api.genshin.GenshinImpactAPI;
import lombok.Getter;
import org.json.JSONObject;

public class DailyReward {

	@Getter private int totalSignDay;
	@Getter private boolean sign;
	@Getter private String region;
	@Getter private boolean sub;
	@Getter private boolean firstBind;

	public DailyReward(int totalSignDay, boolean sign, String region, boolean sub, boolean firstBind) {
		this.totalSignDay = totalSignDay;
		this.sign = sign;
		this.region = region;
		this.sub = sub;
		this.firstBind = firstBind;
	}

	public String claimToday(boolean cn) {
		GenshinImpactAPI api = HoyoAPI.inst().genshin();
		String sign_str = api.getDailyRewardSign(cn);
		JSONObject sign = new JSONObject(sign_str);

		if (sign.getInt("retcode") != 0) {
			System.out.println("Daily Reward Sign status: " + sign.getString("message"));
			return sign.getString("message");
		}

		String home_str = api.getDailyRewardHome(cn);
		String info_str = api.getDailyRewardInfo(cn);
		JSONObject home = new JSONObject(home_str);
		JSONObject info = new JSONObject(info_str);

		int total_sign_day = info.getJSONObject("data").getInt("total_sign_day");
		boolean is_sign = info.getJSONObject("data").getBoolean("is_sign");

		int date = is_sign ? total_sign_day : total_sign_day + 1;
		String reward_name = home.getJSONObject("data").getJSONArray("awards").getJSONObject(date - 1).getString("name");
		int reward_amount = home.getJSONObject("data").getJSONArray("awards").getJSONObject(date - 1).getInt("cnt");

		System.out.println("Daily Reward Sign status: OK>" + reward_name + " x" + reward_amount);

		return "OK>" + reward_name + " x" + reward_amount;
	}

}
