package camchua.genshinimpactapi.data.user.model.spiralabyss.rank;

import lombok.Getter;

public class SpiralAbyssTakeDamageRank {

	@Getter private int avatarId;
	@Getter private int rarity;
	@Getter private int value;

	public SpiralAbyssTakeDamageRank(int avatarId, int rarity, int value) {
		this.avatarId = avatarId;
		this.rarity = rarity;
		this.value = value;
	}

}
