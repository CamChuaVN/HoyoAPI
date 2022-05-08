package camchua.genshinimpactapi.data.user.model.dailynote;

public class DailyNote {
	
	private int maxExpeditionNum;
	private int resinDiscountNumLimit;
	private int remainResinDiscountNum;
	private int totalTaskNum;
	private int currentResin;
	private int maxHomeCoin;
	private int finishedTaskNum;
	private int currentExpeditionNum;
	private int maxResin;
	private int currentHomeCoin;
	private String resinRecoveryTime;
	private String homeCoinRecoveryTime;
	private boolean extraTaskRewardReceived;
	private DailyNoteExpeditions expeditions;
	private DailyNoteTransformer transformer;
	
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

	public int getMaxExpeditionNum() {
		return maxExpeditionNum;
	}

	public int getResinDiscountNumLimit() {
		return resinDiscountNumLimit;
	}

	public int getRemainResinDiscountNum() {
		return remainResinDiscountNum;
	}

	public int getTotalTaskNum() {
		return totalTaskNum;
	}

	public int getCurrentResin() {
		return currentResin;
	}

	public int getMaxHomeCoin() {
		return maxHomeCoin;
	}

	public int getFinishedTaskNum() {
		return finishedTaskNum;
	}

	public int getCurrentExpeditionNum() {
		return currentExpeditionNum;
	}

	public int getMaxResin() {
		return maxResin;
	}

	public int getCurrentHomeCoin() {
		return currentHomeCoin;
	}

	public String getResinRecoveryTime() {
		return resinRecoveryTime;
	}

	public String getHomeCoinRecoveryTime() {
		return homeCoinRecoveryTime;
	}

	public boolean isExtraTaskRewardReceived() {
		return extraTaskRewardReceived;
	}

	public DailyNoteExpeditions getExpeditions() {
		return expeditions;
	}

	public DailyNoteTransformer getTransformer() {
		return transformer;
	}

}
