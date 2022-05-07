package camchua.genshinimpactapi.data.user.model.spiralabyss.floor;

public class SpiralAbyssStage {

	private int star;
	private int maxStar;
	private int stage;
	private SpiralAbyssFirstHalfBattle firstHalf;
	private SpiralAbyssSecondHalfBattle secondHalf;

	public SpiralAbyssStage(int star, int maxStar, int stage, SpiralAbyssFirstHalfBattle firstHalf,
			SpiralAbyssSecondHalfBattle secondHalf) {
		this.star = star;
		this.maxStar = maxStar;
		this.stage = stage;
		this.firstHalf = firstHalf;
		this.secondHalf = secondHalf;
	}

	public int getStar() {
		return star;
	}

	public int getMaxStar() {
		return maxStar;
	}

	public int getStage() {
		return stage;
	}

	public SpiralAbyssFirstHalfBattle getFirstHalf() {
		return firstHalf;
	}

	public SpiralAbyssSecondHalfBattle getSecondHalf() {
		return secondHalf;
	}

}
