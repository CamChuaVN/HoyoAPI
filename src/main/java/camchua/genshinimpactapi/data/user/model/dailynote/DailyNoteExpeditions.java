package camchua.genshinimpactapi.data.user.model.dailynote;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DailyNoteExpeditions {

	@Getter private List<Expeditions> expedition = new ArrayList<>();

	public DailyNoteExpeditions(List<Expeditions> expeditions) {
		for (Expeditions e : expeditions)
			expedition.add(e);
	}


	public static class Expeditions {

		@Getter private String remainedTime;
		@Getter private String status;

		public Expeditions(String remainedTime, String status) {
			this.remainedTime = remainedTime;
			this.status = status;
		}

	}

}
