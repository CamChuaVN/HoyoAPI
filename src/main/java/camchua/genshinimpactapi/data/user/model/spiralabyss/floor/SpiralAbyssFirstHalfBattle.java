package camchua.genshinimpactapi.data.user.model.spiralabyss.floor;

import java.util.ArrayList;
import java.util.List;

import camchua.genshinimpactapi.data.user.model.spiralabyss.SpiralAbyssAvatar;
import lombok.Getter;

public class SpiralAbyssFirstHalfBattle {

	@Getter private List<SpiralAbyssAvatar> avatars = new ArrayList<>();

	public SpiralAbyssFirstHalfBattle(List<SpiralAbyssAvatar> avatar) {
		for (SpiralAbyssAvatar a : avatar)
			avatars.add(a);
	}

}
