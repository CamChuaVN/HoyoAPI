package camchua.genshinimpactapi.data.user.model.gachalog;

import java.util.ArrayList;
import java.util.List;

public class GachaLog {

	private List<GachaLogItem> item = new ArrayList<>();
	private String region;

	public GachaLog(List<GachaLogItem> items, String region) {
		for (GachaLogItem i : items)
			item.add(i);
		this.region = region;
	}

	public List<GachaLogItem> getItem() {
		return item;
	}

	public String getRegion() {
		return region;
	}

}
