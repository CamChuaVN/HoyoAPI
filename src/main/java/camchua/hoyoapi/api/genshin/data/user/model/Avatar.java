package camchua.hoyoapi.api.genshin.data.user.model;

import camchua.hoyoapi.api.genshin.data.user.model.item.Reliquaries;
import camchua.hoyoapi.api.genshin.data.user.model.item.Weapon;
import camchua.hoyoapi.api.genshin.enums.ElementType;
import lombok.Getter;

import java.util.LinkedHashMap;

public class Avatar {

	@Getter private String ownedId;
	@Getter private String avatarId;
	@Getter private String name;
	@Getter private ElementType element;
	@Getter private int rarity;
	@Getter private int fetter;
	@Getter private int level;

	@Getter private int constellations;
	@Getter private Weapon weapon;
	@Getter private LinkedHashMap<Reliquaries.ReliquariesPosition, Reliquaries> reliquaries = new LinkedHashMap<>();
	@Getter private String icon;

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

}
