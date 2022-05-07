package camchua.genshinimpactapi.data.user.model.explorations;

import java.util.ArrayList;
import java.util.List;

public class WorldExplorations {

	private List<Explorations> exploration = new ArrayList<>();

	public WorldExplorations(List<Explorations> explorations) {
		for (Explorations e : explorations)
			exploration.add(e);
	}

	public List<Explorations> getExploration() {
		return exploration;
	}

	public static class Explorations {

		private String name;
		private String type;
		private int level;
		private double explorationPercentage;
		private int id;
		private int parentId;
		private ExplorationsOfferings explorationsOffertings;

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

		public String getName() {
			return name;
		}

		public String getType() {
			return type;
		}

		public int getLevel() {
			return level;
		}

		public double getExplorationPercentage() {
			return explorationPercentage;
		}

		public int getId() {
			return id;
		}

		public int getParentId() {
			return parentId;
		}

		public ExplorationsOfferings getExplorationsOffertings() {
			return explorationsOffertings;
		}

	}

}
