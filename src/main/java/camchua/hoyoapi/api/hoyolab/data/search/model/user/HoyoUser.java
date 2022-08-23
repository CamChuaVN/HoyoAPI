package camchua.hoyoapi.api.hoyolab.data.search.model.user;

import lombok.Getter;

public class HoyoUser {

    @Getter private String uid;
    @Getter private int gender;
    @Getter private String avatarUrl;
    @Getter private String introduce;
    @Getter private String nickname;
    @Getter private boolean followed;
    @Getter private String avatar;
    @Getter private boolean following;

    public HoyoUser(String uid, int gender, String avatarUrl, String introduce, String nickname, boolean isFollowed, String avatar, boolean isFollowing) {
        this.uid = uid;
        this.gender = gender;
        this.introduce = introduce;
        this.nickname = nickname;
        this.followed = isFollowed;
        this.avatar = avatar;
        this.following = isFollowing;
    }

}
