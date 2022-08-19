package camchua.genshinimpactapi.data.user.model.travelerdiary;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class TravelerDiaryMonthDetail {

	@Getter private List<MonthDetail> detail = new ArrayList<>();

	public TravelerDiaryMonthDetail(List<MonthDetail> details) {
		for (MonthDetail d : details)
			detail.add(d);
	}

	public static class MonthDetail {

		@Getter private int actionId;
		@Getter private String action;
		@Getter private int primogems;
		@Getter private int percent;

		public MonthDetail(int actionId, String action, int primogems, int percent) {
			this.actionId = actionId;
			this.action = action;
			this.primogems = primogems;
			this.percent = percent;
		}

	}

}
