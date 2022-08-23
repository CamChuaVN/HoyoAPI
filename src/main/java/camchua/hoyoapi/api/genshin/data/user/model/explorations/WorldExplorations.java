package camchua.hoyoapi.api.genshin.data.user.model.explorations;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class WorldExplorations {

	@Getter private List<Explorations> exploration = new ArrayList<>();

	public WorldExplorations(List<Explorations> explorations) {
		for(Explorations e : explorations)
			exploration.add(e);
	}

	public static class Explorations {

		@Getter private String name;
		@Getter private String type;
		@Getter private int level;
		@Getter private double explorationPercentage;
		@Getter private int id;
		@Getter private int parentId;
		@Getter private ExplorationsOfferings explorationsOffertings;

		public Explorations(String name, String type, int level, double explorationPercentage, int id, int parentId,
				ExplorationsOfferings explorationsOfferings) {
			this.name = name;
			this.type = type;
			this.level = level;
			this.explorationPercentage = explorationPercentage;
			this.id = id;
			this.parentId = parentId;
			this.explorationsOffertings = explorationsOfferings;
		}

	}

}
