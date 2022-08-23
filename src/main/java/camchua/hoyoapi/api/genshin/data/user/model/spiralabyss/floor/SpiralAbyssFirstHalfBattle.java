package camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.floor;

import camchua.hoyoapi.api.genshin.data.user.model.spiralabyss.SpiralAbyssAvatar;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class SpiralAbyssFirstHalfBattle {

	@Getter private List<SpiralAbyssAvatar> avatars = new ArrayList<>();

	public SpiralAbyssFirstHalfBattle(List<SpiralAbyssAvatar> avatar) {
		for (SpiralAbyssAvatar a : avatar)
			avatars.add(a);
	}

}
