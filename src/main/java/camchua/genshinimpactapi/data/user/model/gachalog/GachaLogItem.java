package camchua.genshinimpactapi.data.user.model.gachalog;

import camchua.genshinimpactapi.enums.GachaType;
import lombok.Getter;

public class GachaLogItem {

	@Getter private String uid;
	@Getter private String itemId;
	@Getter private String itemType;
	@Getter private String count;
	@Getter private String name;
	@Getter private GachaType gachaType;
	@Getter private String time;
	@Getter private String id;
	@Getter private String rankType;

	public GachaLogItem(String u, String ii, String it, String c, String n, GachaType gt, String t, String i,
			String rt) {
		this.uid = u;
		this.itemId = ii;
		this.itemType = it;
		this.count = c;
		this.name = n;
		this.gachaType = gt;
		this.time = t;
		this.id = i;
		this.rankType = rt;
	}

	@Override
	public String toString() {
		return "{\"name\": " + name + ",\"count\": " + count + "}";
	}

}
