package camchua.hoyoapi.api.genshin.data.user.model.spiralabyss;

import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.floor.SpiralAbyssFloor;
import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.rank.*;
import lombok.Getter;

public class SpiralAbyss {

	@Getter private int totalWinTimes;
	@Getter private int totalStar;
	@Getter private int totalBattleTimes;
	@Getter private String maxFloor;

	@Getter private SpiralAbyssFloor spiralAbyssFloor;

	@Getter private SpiralAbyssDamageRank spiralAbyssDamageRank;
	@Getter private SpiralAbyssDefeatRank spiralAbyssDefeatRank;
	@Getter private SpiralAbyssEnergySkillRank spiralAbyssEnergySkillRank;
	@Getter private SpiralAbyssNormalSkillRank spiralAbyssNormalSkillRank;
	@Getter private SpiralAbyssRevealRank spiralAbyssRevealRank;
	@Getter private SpiralAbyssTakeDamageRank spiralAbyssTakeDamageRank;

	public SpiralAbyss(int totalWinTimes, int totalStar, int totalBattleTimes, String maxFloor,
			SpiralAbyssFloor spiralAbyssFloor, 
			SpiralAbyssDamageRank damageRank, SpiralAbyssDefeatRank defeatRank, SpiralAbyssEnergySkillRank energySkillRank, SpiralAbyssNormalSkillRank normalSkillRank, SpiralAbyssRevealRank revealRank, SpiralAbyssTakeDamageRank takeDamageRank) {
		this.totalWinTimes = totalWinTimes;
		this.totalStar = totalStar;
		this.totalBattleTimes = totalBattleTimes;
		this.maxFloor = maxFloor;
		this.spiralAbyssFloor = spiralAbyssFloor;
		this.spiralAbyssDamageRank = damageRank;
		this.spiralAbyssDefeatRank = defeatRank;
		this.spiralAbyssEnergySkillRank = energySkillRank;
		this.spiralAbyssNormalSkillRank = normalSkillRank;
		this.spiralAbyssRevealRank = revealRank;
		this.spiralAbyssTakeDamageRank = takeDamageRank;
	}

}
