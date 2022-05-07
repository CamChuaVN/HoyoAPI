package camchua.genshinimpactapi.data.user.model.spiralabyss;

import camchua.genshinimpactapi.data.user.model.spiralabyss.floor.SpiralAbyssFloor;
import camchua.genshinimpactapi.data.user.model.spiralabyss.rank.SpiralAbyssDamageRank;
import camchua.genshinimpactapi.data.user.model.spiralabyss.rank.SpiralAbyssDefeatRank;
import camchua.genshinimpactapi.data.user.model.spiralabyss.rank.SpiralAbyssEnergySkillRank;
import camchua.genshinimpactapi.data.user.model.spiralabyss.rank.SpiralAbyssNormalSkillRank;
import camchua.genshinimpactapi.data.user.model.spiralabyss.rank.SpiralAbyssRevealRank;
import camchua.genshinimpactapi.data.user.model.spiralabyss.rank.SpiralAbyssTakeDamageRank;

public class SpiralAbyss {

	private int totalWinTimes;
	private int totalStar;
	private int totalBattleTimes;
	private String maxFloor;

	private SpiralAbyssFloor spiralAbyssFloor;

	private SpiralAbyssDamageRank spiralAbyssDamageRank;
	private SpiralAbyssDefeatRank spiralAbyssDefeatRank;
	private SpiralAbyssEnergySkillRank spiralAbyssEnergySkillRank;
	private SpiralAbyssNormalSkillRank spiralAbyssNormalSkillRank;
	private SpiralAbyssRevealRank spiralAbyssRevealRank;
	private SpiralAbyssTakeDamageRank spiralAbyssTakeDamageRank;

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

	public int getTotalWinTimes() {
		return totalWinTimes;
	}

	public int getTotalStar() {
		return totalStar;
	}

	public int getTotalBattleTimes() {
		return totalBattleTimes;
	}

	public String getMaxFloor() {
		return maxFloor;
	}

	public SpiralAbyssFloor getSpiralAbyssFloor() {
		return spiralAbyssFloor;
	}

	public SpiralAbyssDamageRank getSpiralAbyssDamageRank() {
		return spiralAbyssDamageRank;
	}

	public SpiralAbyssDefeatRank getSpiralAbyssDefeatRank() {
		return spiralAbyssDefeatRank;
	}

	public SpiralAbyssEnergySkillRank getSpiralAbyssEnergySkillRank() {
		return spiralAbyssEnergySkillRank;
	}

	public SpiralAbyssNormalSkillRank getSpiralAbyssNormalSkillRank() {
		return spiralAbyssNormalSkillRank;
	}

	public SpiralAbyssRevealRank getSpiralAbyssRevealRank() {
		return spiralAbyssRevealRank;
	}

	public SpiralAbyssTakeDamageRank getSpiralAbyssTakeDamageRank() {
		return spiralAbyssTakeDamageRank;
	}

}
