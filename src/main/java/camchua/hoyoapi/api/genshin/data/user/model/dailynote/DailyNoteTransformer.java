package camchua.hoyoapi.api.genshin.data.user.model.dailynote;

import lombok.Getter;

public class DailyNoteTransformer {
	
	@Getter private boolean obtained;
	@Getter private int recoverySecond;
	@Getter private int recoveryMinute;
	@Getter private int recoveryHour;
	@Getter private int recoveryDay;
	@Getter private boolean recoveryReached;
	
	public DailyNoteTransformer(boolean obtained, int rs, int rm, int rh, int rd, boolean rr) {
		this.obtained = obtained;
		this.recoverySecond = rs;
		this.recoveryMinute = rm;
		this.recoveryHour = rh;
		this.recoveryDay = rd;
		this.recoveryReached = rr;
	}

}
