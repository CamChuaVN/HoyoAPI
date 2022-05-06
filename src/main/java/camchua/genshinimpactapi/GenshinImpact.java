package camchua.genshinimpactapi;

public class GenshinImpact {
	
	private static GenshinImpact inst;
	
	public static GenshinImpact inst() {
		if(inst == null) inst = new GenshinImpact();
		return inst;
	}
	
	private static GenshinImpactAPI api;
	
	public static GenshinImpactAPI getAPI() {
		if(api == null) api = new GenshinImpactAPI();
		return api;
	}
	
	
	public static void main(String[] args) {
		inst = new GenshinImpact();
		api = new GenshinImpactAPI();
	}
	
	
	
	private String ltoken;
	private String ltuid;
	
	
	private GenshinImpact() {
		inst = this;
	}
	
	
	public void setCookie(String ltoken, String ltuid) {
		this.ltoken = ltoken;
		this.ltuid = ltuid;
	}
	
	
	public String getCookie() {
		if(this.ltoken == null || this.ltuid == null) return "";
		return "ltoken=" + this.ltoken + "; ltuid=" + this.ltuid;
	}

}
