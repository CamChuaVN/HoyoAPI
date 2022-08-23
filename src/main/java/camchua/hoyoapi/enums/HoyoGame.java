package camchua.hoyoapi.enums;

import lombok.Getter;

public enum HoyoGame {

    HONKAI_IMPACT(1),
    GENSHIN_IMPACT(2),
    TEARS_OF_THEMIS(4),
    HOYOLAB(5),
    HONKAI_STAR_RAIL(6),
    ZENLESS_ZONE_ZERO(8),
    ;


    @Getter private int id;

    HoyoGame(int id) {
        this.id = id;
    }



    public static HoyoGame getById(int id) {
        for(HoyoGame hoyoGame : HoyoGame.values()) {
            if(hoyoGame.getId() == id) return hoyoGame;
        }
        return null;
    }

}
