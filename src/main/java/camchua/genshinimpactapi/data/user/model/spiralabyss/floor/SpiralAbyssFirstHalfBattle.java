package camchua.genshinimpactapi.data.user.model.spiralabyss.floor;

import java.util.ArrayList;
import java.util.List;

import camchua.genshinimpactapi.data.user.model.spiralabyss.SpiralAbyssAvatar;

public class SpiralAbyssFirstHalfBattle {

	private List<SpiralAbyssAvatar> avatars = new ArrayList<>();

	public SpiralAbyssFirstHalfBattle(List<SpiralAbyssAvatar> avatar) {
		for (SpiralAbyssAvatar a : avatar)
			avatars.add(a);
	}

	public List<SpiralAbyssAvatar> getAvatars() {
		return avatars;
	}

}
