package camchua.hoyoapi;

import camchua.hoyoapi.api.genshin.GenshinImpactAPI;
import camchua.hoyoapi.api.hoyolab.HoyoLabAPI;
import lombok.Getter;
import lombok.Setter;

public class HoyoAPI {

    public static final String OS_DS_SALT = "6cqshh5dhw73bzxn20oexa9k516chk7s";
    public static final String OS_TAKUMI_URL = "https://api-os-takumi.mihoyo.com/";
    public static final String OS_HK4E_URL = "https://hk4e-api-os.hoyoverse.com/";
    public static final String OS_SG_HK4E_URL = "https://sg-hk4e-api.hoyoverse.com/";
    public static final String OS_GAME_RECORD_URL = "https://bbs-api-os.hoyoverse.com/";


    public static final String CN_DS_SALT = "xV8v4Qu54lUKrEYFZkJhB8cuOh9Asafs";
    public static final String CN_TAKUMI_URL = "https://api-takumi.mihoyo.com/";
    public static final String CN_HK4E_URL = "https://hk4e-api.mihoyo.com/";
    public static final String CN_SG_HK4E_URL = "https://sg-hk4e-api.mihoyo.com/";
    public static final String CN_GAME_RECORD_URL = "https://api-takumi.mihoyo.com/";


    private static HoyoAPI inst;

    public static HoyoAPI inst() {
        if(inst == null) inst = new HoyoAPI();
        return inst;
    }


    private String ltoken;
    private String ltuid;
    private String cookie_token;
    @Getter @Setter String authKey;

    private boolean debug;

    public HoyoAPI() {
        this.genshinImpactAPI = new GenshinImpactAPI(this);
        this.hoyoLabAPI = new HoyoLabAPI(this);
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


    private GenshinImpactAPI genshinImpactAPI;

    public GenshinImpactAPI genshin() {
        return this.genshinImpactAPI;
    }


    private HoyoLabAPI hoyoLabAPI;

    public HoyoLabAPI hoyolab() {
        return this.hoyoLabAPI;
    }

}
