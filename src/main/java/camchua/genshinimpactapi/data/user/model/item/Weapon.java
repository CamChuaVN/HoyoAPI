package camchua.genshinimpactapi.data.user.model.item;

public class Weapon {

    private int promoteLevel;
    private int affixLevel;
    private String typeName;
    private int level;
    private String name;
    private String icon;
    private int id;
    private int type;
    private int rarity;
    private String desc;


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

    public int getPromoteLevel() {
        return promoteLevel;
    }

    public int getAffixLevel() {
        return affixLevel;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public int getRarity() {
        return rarity;
    }

    public String getDesc() {
        return desc;
    }
}
