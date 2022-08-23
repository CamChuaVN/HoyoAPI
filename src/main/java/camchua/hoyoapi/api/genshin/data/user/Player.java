package camchua.hoyoapi.api.genshin.data.user;

import camchua.hoyoapi.api.genshin.data.user.model.Avatar;
import camchua.hoyoapi.api.genshin.data.user.model.DailyReward;
import camchua.hoyoapi.api.genshin.data.user.model.Stat;
import camchua.hoyoapi.api.genshin.data.user.model.dailynote.DailyNote;
import camchua.hoyoapi.api.genshin.data.user.model.explorations.WorldExplorations;
import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.SpiralAbyss;
import camchua.hoyoapi.api.genshin.data.user.model.travelerdiary.TravelerDiary;
import lombok.Getter;

import java.util.List;

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
