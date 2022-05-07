package camchua.genshinimpactapi.data.user.model.spiralabyss.rank;

import java.util.ArrayList;
import java.util.List;

public class SpiralAbyssRevealRank {

	private List<RevealRank> rank = new ArrayList<>();

	public SpiralAbyssRevealRank(List<RevealRank> reveal) {
		for (RevealRank r : reveal)
			rank.add(r);
	}

	public List<RevealRank> getRank() {
		return rank;
	}

	public static class RevealRank {

		private int avatarId;
		private int rarity;
		private int value;

		public RevealRank(int avatarId, int rarity, int value) {
			this.avatarId = avatarId;
			this.rarity = rarity;
			this.value = value;
		}

		public int getAvatarId() {
			return avatarId;
		}

		public int getRarity() {
			return rarity;
		}

		public int getValue() {
			return value;
		}

	}

}
