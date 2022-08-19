package camchua.genshinimpactapi.data.user.model.item;

import lombok.Getter;

public class Reliquaries {

    @Getter private ReliquariesPosition position;
    @Getter private int level;
    @Getter private String name;
    @Getter private String iconUrl;
    @Getter private int id;
    @Getter private int rarity;

    public Reliquaries(ReliquariesPosition pos, int level, String name, String icon, int id, int rarity) {
        this.position = pos;
        this.level = level;
        this.name = name;
        this.iconUrl = icon;
        this.id = id;
        this.rarity = rarity;
    }


    public enum ReliquariesPosition {

        FLOWER_OF_LIFE, PLUME_OF_DEATH, SANDS_OF_EON, GOBLET_OF_EONOTHEM, CIRCLET_OF_LOGOS;

    }

}
