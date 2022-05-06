package camchua.genshinimpactapi.model;

import camchua.genshinimpactapi.enums.ElementEnum;

public class Avatar {
	
	private String ownedId;
	private String avatarId;
	private String name;
    private ElementEnum element;
    private int rarity;
    private int fetter;
    private int level;
    
    public Avatar(String ownedId, String avatarId, String name, ElementEnum element, int rarity, int fetter, int level) {
    	this.ownedId = ownedId;
    	this.avatarId = avatarId;
    	this.name = name;
    	this.element = element;
    	this.rarity = rarity;
    	this.fetter = fetter;
    	this.level = level;
    }
    
    public String getOwnedId() {
    	return this.ownedId;
    }
    
    public String getAvatarId() {
    	return this.avatarId;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public ElementEnum getElement() {
    	return this.element;
    }
    
    public int getRarity() {
    	return this.rarity;
    }
    
    public int getFetter() {
    	return this.fetter;
    }
    
    public int getLevel() {
    	return this.level;
    }

}
