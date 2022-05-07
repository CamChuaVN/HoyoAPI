package camchua.genshinimpactapi.data.user.model.spiralabyss.floor;

import java.util.ArrayList;
import java.util.List;

import camchua.genshinimpactapi.data.user.model.spiralabyss.SpiralAbyssAvatar;

public class SpiralAbyssSecondHalfBattle {

	private List<SpiralAbyssAvatar> avatars = new ArrayList<>();

	public SpiralAbyssSecondHalfBattle(List<SpiralAbyssAvatar> avatar) {
		for (SpiralAbyssAvatar a : avatar)
			avatars.add(a);
	}

	public List<SpiralAbyssAvatar> getAvatars() {
		return avatars;
	}

}
