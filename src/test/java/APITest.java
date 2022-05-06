import camchua.genshinimpactapi.GenshinImpact;
import camchua.genshinimpactapi.GenshinImpactAPI;
import camchua.genshinimpactapi.model.Avatar;
import camchua.genshinimpactapi.model.Player;

public class APITest {
	
	public static void main(String[] args) {
		// Setup your cookie
		String ltoken = "";
		String ltuid = "";
		GenshinImpact.inst().setCookie(ltoken, ltuid);
		
		// Access to API
		GenshinImpactAPI api = GenshinImpact.getAPI();
		
		Player player = api.getPlayer("put your uid here", false);
		
		Avatar avt = player.getAvatars().get(0);
		System.out.println("Best character");
		System.out.println(" Name: " + avt.getName());
		System.out.println(" Level: " + avt.getLevel());
		System.out.println(" Fetter: " + avt.getFetter());
		System.out.println(" Element: " + avt.getElement().getKey());
		
		System.out.println("");
		
		System.out.println("Active Day Number: " + player.getStat().getActiveDayNumber());
	}

}
