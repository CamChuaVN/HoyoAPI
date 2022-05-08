package camchua.genshinimpactapi.data.user.model.dailynote;

public class DailyNoteTransformer {
	
	private boolean obtained;
	private int recoverySecond;
	private int recoveryMinute;
	private int recoveryHour;
	private int recoveryDay;
	private boolean recoveryReached;
	
	public DailyNoteTransformer(boolean obtained, int rs, int rm, int rh, int rd, boolean rr) {
		this.obtained = obtained;
		this.recoverySecond = rs;
		this.recoveryMinute = rm;
		this.recoveryHour = rh;
		this.recoveryDay = rd;
		this.recoveryReached = rr;
	}

	public boolean isObtained() {
		return obtained;
	}

	public int getRecoverySecond() {
		return recoverySecond;
	}

	public int getRecoveryMinute() {
		return recoveryMinute;
	}

	public int getRecoveryHour() {
		return recoveryHour;
	}

	public int getRecoveryDay() {
		return recoveryDay;
	}

	public boolean isRecoveryReached() {
		return recoveryReached;
	}

}
