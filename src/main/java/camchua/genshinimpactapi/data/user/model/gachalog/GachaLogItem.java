package camchua.genshinimpactapi.data.user.model.gachalog;

import camchua.genshinimpactapi.enums.GachaType;

public class GachaLogItem {

	private String uid;
	private String itemId;
	private String itemType;
	private String count;
	private String name;
	private GachaType gachaType;
	private String time;
	private String id;
	private String rankType;

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

	public String getUid() {
		return uid;
	}

	public String getItemId() {
		return itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public String getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public GachaType getGachaType() {
		return gachaType;
	}

	public String getTime() {
		return time;
	}

	public String getId() {
		return id;
	}

	public String getRankType() {
		return rankType;
	}
	
	public String toString() {
		return "{\"name\": " + name + ",\"count\": " + count + "}";
	}

}
