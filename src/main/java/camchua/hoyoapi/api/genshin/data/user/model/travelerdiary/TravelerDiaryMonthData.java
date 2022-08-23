package camchua.hoyoapi.api.genshin.data.user.model.travelerdiary;

import lombok.Getter;

public class TravelerDiaryMonthData {

	@Getter private int primogems;
	@Getter private int mora;

	public TravelerDiaryMonthData(int primogems, int mora) {
		this.primogems = primogems;
		this.mora = mora;
	}

}
