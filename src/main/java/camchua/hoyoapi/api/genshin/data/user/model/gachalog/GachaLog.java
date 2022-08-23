package camchua.hoyoapi.api.genshin.data.user.model.gachalog;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class GachaLog {

	@Getter private List<GachaLogItem> item = new ArrayList<>();
	@Getter private String region;

	public GachaLog(List<GachaLogItem> items, String region) {
		for (GachaLogItem i : items)
			item.add(i);
		this.region = region;
	}

}
