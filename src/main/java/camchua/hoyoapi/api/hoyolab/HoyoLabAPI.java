package camchua.hoyoapi.api.hoyolab;

import camchua.hoyoapi.HoyoAPI;
import camchua.hoyoapi.api.hoyolab.data.search.HoyoSearch;
import camchua.hoyoapi.enums.HoyoGame;
import camchua.hoyoapi.utils.HoyolabUtils;
import camchua.hoyoapi.utils.Utils;

public class HoyoLabAPI {

    private HoyoAPI hoyoAPI;

    public HoyoLabAPI(HoyoAPI hoyoAPI) {
        this.hoyoAPI = hoyoAPI;
    }


    public String getSearch(String keyword, HoyoGame hoyoGame, boolean cn) {
        String urlPath = "apihub/wapi/search" + "?gids=" + hoyoGame.getId() + "&size=20" + "&keyword=" + keyword;
        String url = cn ? "https://bbs-api.mihoyo.com/" + urlPath : HoyoAPI.OS_TAKUMI_URL + "community/" + urlPath;
        if(hoyoAPI.isDebug()) System.out.println("[HoyoLab] Search url: " + url);

        try {
            return Utils.getConnectionResult(url, "get", cn).toString();
        } catch (Exception e) {
            if(hoyoAPI.isDebug()) System.out.println("[HoyoLab] Search exception: " + e.getMessage());
        }

        return "";
    }


    public HoyoSearch search(String keyword, HoyoGame hoyoGame) {
        return HoyolabUtils.initHoyoSearch(keyword, hoyoGame, false);
    }

}
