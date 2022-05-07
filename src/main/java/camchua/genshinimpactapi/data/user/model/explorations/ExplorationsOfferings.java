package camchua.genshinimpactapi.data.user.model.explorations;

public class ExplorationsOfferings {

	private String name;
	private int level;

	public ExplorationsOfferings(String name, int level) {
		this.name = name;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

}
