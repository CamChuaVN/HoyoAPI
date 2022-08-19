package camchua.genshinimpactapi.data.user.model;

import java.util.List;

import camchua.genshinimpactapi.data.user.model.dailynote.DailyNote;
import camchua.genshinimpactapi.data.user.model.explorations.WorldExplorations;
import camchua.genshinimpactapi.data.user.model.spiralabyss.SpiralAbyss;
import camchua.genshinimpactapi.data.user.model.travelerdiary.TravelerDiary;
import lombok.Getter;

public class Player {

	@Getter private String uid;
	@Getter private List<Avatar> avatars;
	@Getter private Stat stat;
	@Getter private SpiralAbyss spiralAbyss;
	@Getter private WorldExplorations worldExplorations;
	@Getter private DailyReward dailyReward;
	@Getter private TravelerDiary travelerDiary;
	@Getter private DailyNote dailyNote;
	@Getter private String name;
	@Getter private int level;
	@Getter private String region;

	public Player(String uid, List<Avatar> avatars, Stat stat, SpiralAbyss spiralAbyss,
			WorldExplorations worldExplorations, DailyReward dailyReward, TravelerDiary travelerDiary, DailyNote dailyNote,
			String name, int level, String region) {
		this.uid = uid;
		this.avatars = avatars;
		this.stat = stat;
		this.spiralAbyss = spiralAbyss;
		this.worldExplorations = worldExplorations;
		this.dailyReward = dailyReward;
		this.travelerDiary = travelerDiary;
		this.dailyNote = dailyNote;
		this.name = name;
		this.level = level;
		this.region = region;
	}

}
