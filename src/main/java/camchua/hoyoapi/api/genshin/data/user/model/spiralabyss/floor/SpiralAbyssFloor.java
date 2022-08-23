package camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.floor;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class SpiralAbyssFloor {

	@Getter private List<Floor> floor = new ArrayList<>();

	public SpiralAbyssFloor(List<Floor> floors) {
		for (Floor f : floors)
			floor.add(f);
	}

	public static class Floor {

		@Getter private int star;
		@Getter private int maxStar;
		@Getter private int floor;
		@Getter private SpiralAbyssStage stage1;
		@Getter private SpiralAbyssStage stage2;
		@Getter private SpiralAbyssStage stage3;

		public Floor(int star, int maxStar, int floor, SpiralAbyssStage stage1, SpiralAbyssStage stage2,
				SpiralAbyssStage stage3) {
			this.star = star;
			this.maxStar = maxStar;
			this.floor = floor;
			this.stage1 = stage1;
			this.stage2 = stage2;
			this.stage3 = stage3;
		}

	}

}
