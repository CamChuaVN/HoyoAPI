package camchua.genshinimpactapi.data.user.model;

import org.json.JSONObject;

import camchua.genshinimpactapi.GenshinImpact;

public class DailyReward {

	private int totalSignDay;
	private boolean sign;
	private String region;
	private boolean sub;
	private boolean firstBind;

	public DailyReward(int totalSignDay, boolean sign, String region, boolean sub, boolean firstBind) {
		this.totalSignDay = totalSignDay;
		this.sign = sign;
		this.region = region;
		this.sub = sub;
		this.firstBind = firstBind;
	}

	public int getTotalSignDay() {
		return totalSignDay;
	}

	public boolean isSign() {
		return sign;
	}

	public String getRegion() {
		return region;
	}

	public boolean isSub() {
		return sub;
	}

	public boolean isFirstBind() {
		return firstBind;
	}

	public String claimToday(boolean cn) {
		String sign_str = GenshinImpact.getAPI().getDailyRewardSign(cn);
		JSONObject sign = new JSONObject(sign_str);

		if (sign.getInt("retcode") != 0) {
			System.out.println("Daily Reward Sign status: " + sign.getString("message"));
			return sign.getString("message");
		}

		String home_str = GenshinImpact.getAPI().getDailyRewardHome(cn);
		String info_str = GenshinImpact.getAPI().getDailyRewardInfo(cn);
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
