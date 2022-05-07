package camchua.genshinimpactapi.data.user.model;

import java.util.List;

import camchua.genshinimpactapi.data.user.model.explorations.WorldExplorations;
import camchua.genshinimpactapi.data.user.model.spiralabyss.SpiralAbyss;
import camchua.genshinimpactapi.data.user.model.travelerdiary.TravelerDiary;

public class Player {

	private String uid;
	private List<Avatar> avatars;
	private Stat stat;
	private SpiralAbyss spiralAbyss;
	private WorldExplorations worldExplorations;
	private DailyReward dailyReward;
	private TravelerDiary travelerDiary;

	public Player(String uid, List<Avatar> avatars, Stat stat, SpiralAbyss spiralAbyss,
			WorldExplorations worldExplorations, DailyReward dailyReward, TravelerDiary travelerDiary) {
		this.uid = uid;
		this.avatars = avatars;
		this.stat = stat;
		this.spiralAbyss = spiralAbyss;
		this.worldExplorations = worldExplorations;
		this.dailyReward = dailyReward;
		this.travelerDiary = travelerDiary;
	}

	public String getUid() {
		return uid;
	}

	public List<Avatar> getAvatars() {
		return avatars;
	}

	public Stat getStat() {
		return stat;
	}

	public SpiralAbyss getSpiralAbyss() {
		return spiralAbyss;
	}

	public WorldExplorations getWorldExplorations() {
		return worldExplorations;
	}

	public DailyReward getDailyReward() {
		return dailyReward;
	}

	public TravelerDiary getTravelerDiary() {
		return travelerDiary;
	}

}
