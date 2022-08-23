package camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.rank;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class SpiralAbyssRevealRank {

	@Getter private List<RevealRank> rank = new ArrayList<>();

	public SpiralAbyssRevealRank(List<RevealRank> reveal) {
		for (RevealRank r : reveal)
			rank.add(r);
	}

	public static class RevealRank {

		@Getter private int avatarId;
		@Getter private int rarity;
		@Getter private int value;

		public RevealRank(int avatarId, int rarity, int value) {
			this.avatarId = avatarId;
			this.rarity = rarity;
			this.value = value;
		}

	}

}
