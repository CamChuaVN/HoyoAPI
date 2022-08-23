package camchua.hoyoapi.api.genshin.data.cdkey;

import lombok.Getter;

public class CdkeyRedeem {

    @Getter private String code;
    @Getter private boolean success;
    @Getter private String message;
    @Getter private String uid;
    @Getter private String region;

    public CdkeyRedeem(String code, boolean success, String message, String uid, String region) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.uid = uid;
        this.region = region;
    }


}
