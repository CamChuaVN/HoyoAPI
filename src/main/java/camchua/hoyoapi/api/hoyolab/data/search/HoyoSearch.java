package camchua.hoyoapi.api.hoyolab.data.search;

import camchua.hoyoapi.api.hoyolab.data.search.model.posts.HoyoPosts;
import camchua.hoyoapi.api.hoyolab.data.search.model.user.HoyoUser;
import lombok.Getter;

import java.util.List;

public class HoyoSearch {

    @Getter private List<HoyoPosts> posts;
    @Getter private List<HoyoUser> users;

    public HoyoSearch(List<HoyoPosts> posts, List<HoyoUser> users) {
        this.posts = posts;
        this.users = users;
    }

}
