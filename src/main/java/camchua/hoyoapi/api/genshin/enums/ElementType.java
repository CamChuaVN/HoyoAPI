package camchua.hoyoapi.api.genshin.enums;

public enum ElementType {

	ANEMO("Anemo"), CRYO("Cryo"), DENDRO("Dendro"), ELECTRO("Electro"), GEO("Geo"), HYDRO("Hydro"), PYRO("Pyro");

	private String key;

	ElementType(String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}

}
