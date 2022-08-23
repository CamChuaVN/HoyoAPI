package camchua.hoyoapi.api.genshin.data.user.model.dailynote;

import lombok.Getter;

public class DailyNote {
	
	@Getter private int maxExpeditionNum;
	@Getter private int resinDiscountNumLimit;
	@Getter private int remainResinDiscountNum;
	@Getter private int totalTaskNum;
	@Getter private int currentResin;
	@Getter private int maxHomeCoin;
	@Getter private int finishedTaskNum;
	@Getter private int currentExpeditionNum;
	@Getter private int maxResin;
	@Getter private int currentHomeCoin;
	@Getter private String resinRecoveryTime;
	@Getter private String homeCoinRecoveryTime;
	@Getter private boolean extraTaskRewardReceived;
	@Getter private DailyNoteExpeditions expeditions;
	@Getter private DailyNoteTransformer transformer;
	
	public DailyNote(int men, int rdnl, int rrdn, int ttn, int cr, int mhc, int ftn, int cen, int mr, int chc, String rrt, String hcrt, boolean etrr, DailyNoteExpeditions e, DailyNoteTransformer t) {
		this.maxExpeditionNum = men;
		this.resinDiscountNumLimit = rdnl;
		this.remainResinDiscountNum = rrdn;
		this.totalTaskNum = ttn;
		this.currentResin = cr;
		this.maxHomeCoin = mhc;
		this.finishedTaskNum = ftn;
		this.currentExpeditionNum = cen;
		this.maxResin = mr;
		this.currentHomeCoin = chc;
		this.resinRecoveryTime = rrt;
		this.homeCoinRecoveryTime = hcrt;
		this.extraTaskRewardReceived = etrr;
		this.expeditions = e;
		this.transformer = t;
	}

}
