package camchua.genshinimpactapi.data.user.model.travelerdiary;

public class TravelerDiaryDayData {

	private int primogems;
	private int mora;

	public TravelerDiaryDayData(int primogems, int mora) {
		this.primogems = primogems;
		this.mora = mora;
	}

	public int getPrimogems() {
		return primogems;
	}

	public int getMora() {
		return mora;
	}

}
