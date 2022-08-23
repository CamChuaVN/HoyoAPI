import camchua.hoyoapi.HoyoAPI;
import camchua.hoyoapi.api.genshin.GenshinImpactAPI;
import camchua.hoyoapi.api.genshin.data.user.Player;
import camchua.hoyoapi.api.genshin.data.user.model.Avatar;

public class GenshinTest {

	public static void main(String[] args) {
		// Setup your cookie
		String ltoken = "";
		String ltuid = "";
		String cookie_token = "";
		String uid = "";
		HoyoAPI.inst().setCookie(ltoken, ltuid, cookie_token);

		// Access to API
		GenshinImpactAPI api = HoyoAPI.inst().genshin();
		Player player = api.getPlayer(uid);

		System.out.println("List Character:");
		for(Avatar avt : player.getAvatars()) {
			System.out.println(" Name: " + avt.getName());
			System.out.println(" Level: " + avt.getLevel());
			System.out.println(" Fetter: " + avt.getFetter());
			System.out.println(" Element: " + avt.getElement().getKey());
		}

		System.out.println(" ");

		System.out.println("Active Day Number: " + player.getStat().getActiveDayNumber());
	}

}
