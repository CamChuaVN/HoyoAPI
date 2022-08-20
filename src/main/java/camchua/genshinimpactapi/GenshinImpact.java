package camchua.genshinimpactapi;

public class GenshinImpact {

	private static GenshinImpact inst;

	public static GenshinImpact inst() {
		if (inst == null)
			inst = new GenshinImpact();
		return inst;
	}

	private static GenshinImpactAPI api;

	public static GenshinImpactAPI getAPI() {
		if (api == null)
			api = new GenshinImpactAPI();
		return api;
	}

	public static void main(String[] args) {
		inst = new GenshinImpact();
		api = new GenshinImpactAPI();
	}

	private String ltoken;
	private String ltuid;
	private String cookie_token;

	private boolean debug;

	private GenshinImpact() {
		inst = this;
	}

	public void setCookie(String ltoken, String ltuid, String cookie_token) {
		this.ltoken = ltoken;
		this.ltuid = ltuid;
		this.cookie_token = cookie_token;
	}

	public String getCookie() {
		if(this.ltoken == null || this.ltuid == null || this.cookie_token == null)
			return "";
		return "ltoken=" + this.ltoken + "; ltuid=" + this.ltuid + "; account_id=" + this.ltuid + "; cookie_token=" + this.cookie_token;
	}

	public String getCookie(String ltoken, String ltuid, String cookie_token) {
		return "ltoken=" + ltoken + "; ltuid=" + ltuid + "; account_id=" + ltuid + "; cookie_token=" + cookie_token;
	}

	public void resetCookie() {
		this.ltuid = "";
		this.ltoken = "";
		this.cookie_token = "";
	}


	public boolean isDebug() {
		return this.debug;
	}

	public void setDebug(boolean enable) {
		this.debug = enable;
	}

}
