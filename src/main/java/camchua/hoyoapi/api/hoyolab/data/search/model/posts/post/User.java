package camchua.hoyoapi.api.hoyolab.data.search.model.posts.post;

import lombok.Getter;

public class User {

    @Getter private String uid;
    @Getter private int gender;
    @Getter private String introduce;
    @Getter private String nickname;
    @Getter private String avatar;

    public User(String uid, int gender, String introduce, String nickname, String avatar) {
        this.uid = uid;
        this.gender = gender;
        this.introduce = introduce;
        this.nickname = nickname;
        this.avatar = avatar;
    }

}
