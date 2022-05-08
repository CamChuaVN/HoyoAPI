import camchua.genshinimpactapi.GenshinImpact;
import camchua.genshinimpactapi.GenshinImpactAPI;
import camchua.genshinimpactapi.data.user.model.Player;

public class Test {

	public static void main(String[] args) {
		String ltoken = "7m6f2OueopwDHw8iL3feezO5XBPl4H1T5fmaVJSP";
		String ltuid = "87015517";
		GenshinImpact.inst().setCookie(ltoken, ltuid);

		GenshinImpactAPI api = GenshinImpact.getAPI();
		
		Player player = api.getPlayer("815849215", false);
		
		System.out.println(player.getDailyNote().getCurrentResin());
	}

}
