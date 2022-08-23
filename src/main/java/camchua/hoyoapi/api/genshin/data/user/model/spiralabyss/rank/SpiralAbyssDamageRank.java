package camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.rank;

import lombok.Getter;

public class SpiralAbyssDamageRank {

	@Getter private int avatarId;
	@Getter private int rarity;
	@Getter private int value;

	public SpiralAbyssDamageRank(int avatarId, int rarity, int value) {
		this.avatarId = avatarId;
		this.rarity = rarity;
		this.value = value;
	}

}
