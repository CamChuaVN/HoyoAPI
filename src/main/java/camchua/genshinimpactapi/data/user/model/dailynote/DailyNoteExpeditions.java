package camchua.genshinimpactapi.data.user.model.dailynote;

import java.util.ArrayList;
import java.util.List;

public class DailyNoteExpeditions {

	private List<Expeditions> expedition = new ArrayList<>();

	public DailyNoteExpeditions(List<Expeditions> expeditions) {
		for (Expeditions e : expeditions)
			expedition.add(e);
	}

	public List<Expeditions> getExpedition() {
		return expedition;
	}

	public static class Expeditions {

		private String remainedTime;
		private String status;

		public Expeditions(String remainedTime, String status) {
			this.remainedTime = remainedTime;
			this.status = status;
		}

		public String getRemainedTime() {
			return remainedTime;
		}

		public String getStatus() {
			return status;
		}

	}

}
