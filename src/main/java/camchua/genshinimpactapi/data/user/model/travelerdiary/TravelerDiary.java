package camchua.genshinimpactapi.data.user.model.travelerdiary;

public class TravelerDiary {

	private int dataMonth;
	private String region;
	private TravelerDiaryDayData dayData;
	private TravelerDiaryMonthData monthData;
	private TravelerDiaryMonthDetail monthDetail;

	public TravelerDiary(int dataMonth, String region, TravelerDiaryDayData dayData, TravelerDiaryMonthData monthData,
			TravelerDiaryMonthDetail monthDetail) {
		this.dataMonth = dataMonth;
		this.region = region;
		this.dayData = dayData;
		this.monthData = monthData;
		this.monthDetail = monthDetail;
	}

	public int getDataMonth() {
		return dataMonth;
	}

	public String getRegion() {
		return region;
	}

	public TravelerDiaryDayData getDayData() {
		return dayData;
	}

	public TravelerDiaryMonthData getMonthData() {
		return monthData;
	}

	public TravelerDiaryMonthDetail getMonthDetail() {
		return monthDetail;
	}

}
