package camchua.genshinimpactapi.data.user.model.travelerdiary;

import java.util.ArrayList;
import java.util.List;

public class TravelerDiaryMonthDetail {

	private List<MonthDetail> detail = new ArrayList<>();

	public TravelerDiaryMonthDetail(List<MonthDetail> details) {
		for (MonthDetail d : details)
			detail.add(d);
	}

	public List<MonthDetail> getDetail() {
		return detail;
	}

	public static class MonthDetail {

		private int actionId;
		private String action;
		private int primogems;
		private int percent;

		public MonthDetail(int actionId, String action, int primogems, int percent) {
			this.actionId = actionId;
			this.action = action;
			this.primogems = primogems;
			this.percent = percent;
		}

		public int getActionId() {
			return actionId;
		}

		public String getAction() {
			return action;
		}

		public int getPrimogems() {
			return primogems;
		}

		public int getPercent() {
			return percent;
		}

	}

}
