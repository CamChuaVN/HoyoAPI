package camchua.genshinimpactapi.data.user.model.spiralabyss;

import lombok.Getter;

public class SpiralAbyssAvatar {

	@Getter private int avatarId;
	@Getter private int level;
	@Getter private int rarity;

	public SpiralAbyssAvatar(int avatarId, int level, int rarity) {
		this.avatarId = avatarId;
		this.level = level;
		this.rarity = rarity;
	}

}
