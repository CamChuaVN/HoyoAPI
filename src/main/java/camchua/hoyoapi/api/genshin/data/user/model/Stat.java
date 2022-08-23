package camchua.hoyoapi.api.genshin.data.user.model;

import lombok.Getter;

public class Stat {

	@Getter private String playerId;
	@Getter private int activeDayNumber;
	@Getter private int achievementNumber;
	@Getter private int anemoculusNumber;
	@Getter private int geoculusNumber;
	@Getter private int electroculusNumber;
	@Getter private int avatarNumber;
	@Getter private int wayPointNumber;
	@Getter private int domainNumber;
	@Getter private int preciousChestNumber;
	@Getter private int luxuriousChestNumber;
	@Getter private int exquisiteChestNumber;
	@Getter private int commonChestNumber;
	@Getter private int magicChestNumber;
	@Getter private String spiralAbyss;

	public Stat(String playerId, int activeDayNumber, int achievementNumber, int anemoculusNumber,
			int geoculusNumber, int electroculusNumber, int avatarNumber, int wayPointNumber, int domainNumber,
			int preciousChestNumber, int luxuriousChestNumber, int exquisiteChestNumber, int commonChestNumber,
			int magicChestNumber, String spiralAbyss) {

		this.playerId = playerId;
		this.activeDayNumber = activeDayNumber;
		this.achievementNumber = achievementNumber;
		this.anemoculusNumber = anemoculusNumber;
		this.geoculusNumber = geoculusNumber;
		this.electroculusNumber = electroculusNumber;
		this.avatarNumber = avatarNumber;
		this.wayPointNumber = wayPointNumber;
		this.domainNumber = domainNumber;
		this.preciousChestNumber = preciousChestNumber;
		this.luxuriousChestNumber = luxuriousChestNumber;
		this.exquisiteChestNumber = exquisiteChestNumber;
		this.commonChestNumber = commonChestNumber;
		this.magicChestNumber = magicChestNumber;
		this.spiralAbyss = spiralAbyss;
	}

}
