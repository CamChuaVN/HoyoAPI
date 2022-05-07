package camchua.genshinimpactapi.data.user.model.spiralabyss;

public class SpiralAbyssAvatar {

	private int avatarId;
	private int level;
	private int rarity;

	public SpiralAbyssAvatar(int avatarId, int level, int rarity) {
		this.avatarId = avatarId;
		this.level = level;
		this.rarity = rarity;
	}

	public int getAvatarId() {
		return avatarId;
	}

	public int getLevel() {
		return level;
	}

	public int getRarity() {
		return rarity;
	}

}
