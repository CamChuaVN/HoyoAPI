package camchua.genshinimpactapi.model;

public class Stat {
	
	private String playerId;
    private int activeDayNumber;
    private int achievementNumber;
    private int winRate;
    private int anemoculusNumber;
    private int geoculusNumber;
    private int electroculusNumber;
    private int avatarNumber;
    private int wayPointNumber;
    private int domainNumber;
    private int preciousChestNumber;
    private int luxuriousChestNumber;
    private int exquisiteChestNumber;
    private int commonChestNumber;
    private int magicChestNumber;
    private String spiralAbyss;
    
    public Stat(String playerId, int activeDayNumber, int achievementNumber, int winRate, 
    		int anemoculusNumber, int geoculusNumber, int electroculusNumber, 
    		int avatarNumber, int wayPointNumber, int domainNumber, 
    		int preciousChestNumber, int luxuriousChestNumber, int exquisiteChestNumber, int commonChestNumber, int magicChestNumber, 
    		String spiralAbyss) {
    	
    	this.playerId = playerId;
    	this.activeDayNumber = activeDayNumber;
    	this.achievementNumber = achievementNumber;
    	this.winRate = winRate;
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

	public String getPlayerId() {
		return playerId;
	}

	public int getActiveDayNumber() {
		return activeDayNumber;
	}

	public int getAchievementNumber() {
		return achievementNumber;
	}

	public int getWinRate() {
		return winRate;
	}

	public int getAnemoculusNumber() {
		return anemoculusNumber;
	}

	public int getGeoculusNumber() {
		return geoculusNumber;
	}

	public int getElectroculusNumber() {
		return electroculusNumber;
	}

	public int getAvatarNumber() {
		return avatarNumber;
	}

	public int getWayPointNumber() {
		return wayPointNumber;
	}

	public int getDomainNumber() {
		return domainNumber;
	}

	public int getPreciousChestNumber() {
		return preciousChestNumber;
	}

	public int getLuxuriousChestNumber() {
		return luxuriousChestNumber;
	}

	public int getExquisiteChestNumber() {
		return exquisiteChestNumber;
	}

	public int getCommonChestNumber() {
		return commonChestNumber;
	}

	public int getMagicChestNumber() {
		return magicChestNumber;
	}

	public String getSpiralAbyss() {
		return spiralAbyss;
	}

}
