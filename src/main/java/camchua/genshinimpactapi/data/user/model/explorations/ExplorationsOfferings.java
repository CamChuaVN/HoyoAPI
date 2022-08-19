package camchua.genshinimpactapi.data.user.model.explorations;

import lombok.Getter;

public class ExplorationsOfferings {

	@Getter private String name;
	@Getter private int level;

	public ExplorationsOfferings(String name, int level) {
		this.name = name;
		this.level = level;
	}

}
