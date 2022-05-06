package camchua.genshinimpactapi.model;

import java.util.List;

public class Player {

	private String uid;
	private List<Avatar> avatars;
	private Stat stat;

	public Player(String uid, List<Avatar> avatars, Stat stat) {
		this.uid = uid;
		this.avatars = avatars;
		this.stat = stat;
	}

	public String getUid() {
		return this.uid;
	}

	public List<Avatar> getAvatars() {
		return this.avatars;
	}

	public Stat getStat() {
		return this.stat;
	}

}
