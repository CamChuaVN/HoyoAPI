package camchua.genshinimpactapi.data.user.model.spiralabyss.floor;

import java.util.ArrayList;
import java.util.List;

public class SpiralAbyssFloor {

	private List<Floor> floor = new ArrayList<>();

	public SpiralAbyssFloor(List<Floor> floors) {
		for (Floor f : floors)
			floor.add(f);
	}

	public List<Floor> getFloor() {
		return floor;
	}

	public static class Floor {

		private int star;
		private int maxStar;
		private int floor;
		private SpiralAbyssStage stage1;
		private SpiralAbyssStage stage2;
		private SpiralAbyssStage stage3;

		public Floor(int star, int maxStar, int floor, SpiralAbyssStage stage1, SpiralAbyssStage stage2,
				SpiralAbyssStage stage3) {
			this.star = star;
			this.maxStar = maxStar;
			this.floor = floor;
			this.stage1 = stage1;
			this.stage2 = stage2;
			this.stage3 = stage3;
		}

		public int getStar() {
			return star;
		}

		public int getMaxStar() {
			return maxStar;
		}

		public int getFloor() {
			return floor;
		}

		public SpiralAbyssStage getStage1() {
			return stage1;
		}

		public SpiralAbyssStage getStage2() {
			return stage2;
		}

		public SpiralAbyssStage getStage3() {
			return stage3;
		}

	}

}
