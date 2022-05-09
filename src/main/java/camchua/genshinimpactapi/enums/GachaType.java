package camchua.genshinimpactapi.enums;

public enum GachaType {

	NOVICE_WISHES(100, "Novice Wishes"), PERMANENT_WISH(200, "Permanent Wish"),
	CHARACTER_EVENT_WISH(301, "Character Event Wish"), WEAPON_EVENT_WISH(302, "Weapon Event Wish");

	private int gachaType;
	private String name;

	GachaType(int gachaType, String name) {
		this.gachaType = gachaType;
		this.name = name;
	}

	public int getGachaType() {
		return gachaType;
	}

	public String getName() {
		return name;
	}

	public static GachaType getGachaType(int gachaType) {
		for (GachaType gt : GachaType.values()) {
			if (gt.getGachaType() == gachaType)
				return gt;
		}
		return null;
	}

}
