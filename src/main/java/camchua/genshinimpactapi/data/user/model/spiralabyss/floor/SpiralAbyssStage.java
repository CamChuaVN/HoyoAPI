package camchua.genshinimpactapi.data.user.model.spiralabyss.floor;

import lombok.Getter;

public class SpiralAbyssStage {

	@Getter private int star;
	@Getter private int maxStar;
	@Getter private int stage;
	@Getter private SpiralAbyssFirstHalfBattle firstHalf;
	@Getter private SpiralAbyssSecondHalfBattle secondHalf;

	public SpiralAbyssStage(int star, int maxStar, int stage, SpiralAbyssFirstHalfBattle firstHalf,
			SpiralAbyssSecondHalfBattle secondHalf) {
		this.star = star;
		this.maxStar = maxStar;
		this.stage = stage;
		this.firstHalf = firstHalf;
		this.secondHalf = secondHalf;
	}

}
