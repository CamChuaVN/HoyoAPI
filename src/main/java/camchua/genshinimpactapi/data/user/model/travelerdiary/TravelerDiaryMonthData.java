package camchua.genshinimpactapi.data.user.model.travelerdiary;

public class TravelerDiaryMonthData {

	private int primogems;
	private int mora;

	public TravelerDiaryMonthData(int primogems, int mora) {
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
