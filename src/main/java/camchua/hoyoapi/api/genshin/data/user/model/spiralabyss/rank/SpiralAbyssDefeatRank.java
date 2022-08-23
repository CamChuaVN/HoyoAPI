package camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.rank;

import lombok.Getter;

public class SpiralAbyssDefeatRank {

	@Getter private int avatarId;
	@Getter private int rarity;
	@Getter private int value;

	public SpiralAbyssDefeatRank(int avatarId, int rarity, int value) {
		this.avatarId = avatarId;
		this.rarity = rarity;
		this.value = value;
	}

}
