package camchua.hoyoapi.api.genshin.data.user.model.travelerdiary;

import lombok.Getter;

public class TravelerDiaryDayData {

	@Getter private int primogems;
	@Getter private int mora;

	public TravelerDiaryDayData(int primogems, int mora) {
		this.primogems = primogems;
		this.mora = mora;
	}

}
