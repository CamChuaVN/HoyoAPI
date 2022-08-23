package camchua.hoyoapi.api.genshin.data.user.model.travelerdiary;

import lombok.Getter;

public class TravelerDiary {

	@Getter private int dataMonth;
	@Getter private String region;
	@Getter private TravelerDiaryDayData dayData;
	@Getter private TravelerDiaryMonthData monthData;
	@Getter private TravelerDiaryMonthDetail monthDetail;

	public TravelerDiary(int dataMonth, String region, TravelerDiaryDayData dayData, TravelerDiaryMonthData monthData,
			TravelerDiaryMonthDetail monthDetail) {
		this.dataMonth = dataMonth;
		this.region = region;
		this.dayData = dayData;
		this.monthData = monthData;
		this.monthDetail = monthDetail;
	}

}
