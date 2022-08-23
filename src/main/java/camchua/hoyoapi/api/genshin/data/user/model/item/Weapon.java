package camchua.hoyoapi.api.genshin.data.user.model.item;

import lombok.Getter;

public class Weapon {

    @Getter private int promoteLevel;
    @Getter private int affixLevel;
    @Getter private String typeName;
    @Getter private int level;
    @Getter private String name;
    @Getter private String icon;
    @Getter private int id;
    @Getter private int type;
    @Getter private int rarity;
    @Getter private String desc;


    public Weapon(int promoteLevel, int affixLevel, String typeName, int level, String name, String icon, int id, int type, int rarity, String desc) {
        this.promoteLevel = promoteLevel;
        this.affixLevel = affixLevel;
        this.typeName = typeName;
        this.level = level;
        this.name = name;
        this.icon = icon;
        this.id = id;
        this.type = type;
        this.rarity = rarity;
        this.desc = desc;
    }

}
