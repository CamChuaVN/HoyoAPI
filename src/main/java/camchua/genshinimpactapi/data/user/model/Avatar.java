package camchua.genshinimpactapi.data.user.model;

import camchua.genshinimpactapi.data.user.model.item.Reliquaries;
import camchua.genshinimpactapi.data.user.model.item.Weapon;
import camchua.genshinimpactapi.enums.ElementType;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Avatar {

	private String ownedId;
	private String avatarId;
	private String name;
	private ElementType element;
	private int rarity;
	private int fetter;
	private int level;

	private int constellations;
	private Weapon weapon;
	private LinkedHashMap<Reliquaries.ReliquariesPosition, Reliquaries> reliquaries = new LinkedHashMap<>();
	private String icon;

	public Avatar(String ownedId, String avatarId, String name, ElementType element, int rarity, int fetter,
			int level, int constellations, LinkedHashMap<Reliquaries.ReliquariesPosition, Reliquaries> reliquaries,
			Weapon weapon, String icon) {
		this.ownedId = ownedId;
		this.avatarId = avatarId;
		this.name = name;
		this.element = element;
		this.rarity = rarity;
		this.fetter = fetter;
		this.level = level;
		this.constellations = constellations;
		this.reliquaries = reliquaries;
		this.weapon = weapon;
		this.icon = icon;
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

	public int getConstellations() {
		return constellations;
	}

	public LinkedHashMap<Reliquaries.ReliquariesPosition, Reliquaries> getReliquaries() {
		return reliquaries;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public String getIcon() {
		return icon;
	}

}
