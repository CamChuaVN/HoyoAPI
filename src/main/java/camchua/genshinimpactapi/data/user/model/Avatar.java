package camchua.genshinimpactapi.data.user.model;

import camchua.genshinimpactapi.enums.ElementType;

public class Avatar {

	private String ownedId;
	private String avatarId;
	private String name;
	private ElementType element;
	private int rarity;
	private int fetter;
	private int level;

	public Avatar(String ownedId, String avatarId, String name, ElementType element, int rarity, int fetter,
			int level) {
		this.ownedId = ownedId;
		this.avatarId = avatarId;
		this.name = name;
		this.element = element;
		this.rarity = rarity;
		this.fetter = fetter;
		this.level = level;
	}

	public String getOwnedId() {
		return ownedId;
	}

	public String getAvatarId() {
		return avatarId;
	}

	public String getName() {
		return name;
	}

	public ElementType getElement() {
		return element;
	}

	public int getRarity() {
		return rarity;
	}

	public int getFetter() {
		return fetter;
	}

	public int getLevel() {
		return level;
	}

}
