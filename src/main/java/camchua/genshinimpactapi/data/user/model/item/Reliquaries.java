package camchua.genshinimpactapi.data.user.model.item;

public class Reliquaries {

    private ReliquariesPosition position;
    private int level;
    private String name;
    private String iconUrl;
    private int id;
    private int rarity;

    public Reliquaries(ReliquariesPosition pos, int level, String name, String icon, int id, int rarity) {
        this.position = pos;
        this.level = level;
        this.name = name;
        this.iconUrl = icon;
        this.id = id;
        this.rarity = rarity;
    }

    public ReliquariesPosition getPosition() {
        return position;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public int getId() {
        return id;
    }

    public int getRarity() {
        return rarity;
    }



    public enum ReliquariesPosition {

        FLOWER_OF_LIFE, PLUME_OF_DEATH, SANDS_OF_EON, GOBLET_OF_EONOTHEM, CIRCLET_OF_LOGOS;

    }

}
