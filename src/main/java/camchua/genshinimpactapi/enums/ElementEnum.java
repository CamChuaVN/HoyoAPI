package camchua.genshinimpactapi.enums;

public enum ElementEnum {
	
	ANEMO("Anemo"), 
	CRYO("Cryo"), 
	DENDRO("Dendro"), 
	ELECTRO("Electro"), 
	GEO("Geo"), 
	HYDRO("Hydro"), 
	PYRO("Pyro");
	
	
	private String key;
	
	ElementEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return this.key;
	}

}
