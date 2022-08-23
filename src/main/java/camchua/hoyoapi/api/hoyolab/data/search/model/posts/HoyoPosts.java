package camchua.hoyoapi.api.hoyolab.data.search.model.posts;

import camchua.hoyoapi.api.hoyolab.data.search.model.posts.post.*;
import lombok.Getter;

public class HoyoPosts {

    @Getter private Forum forum;
    @Getter private Cover cover;
    @Getter private Stat stat;
    @Getter private boolean officialMaster;
    @Getter private Post post;
    @Getter private Topics topics;
    @Getter private boolean userMaster;
    @Getter private SelfOperation selfOperation;
    @Getter private User user;
    @Getter private ImageList imageList;

    public HoyoPosts(Forum forum, Cover cover, Stat stat, boolean isOfficialMaster, Post post,
                     Topics topics, boolean isUserMaster, SelfOperation selfOperation, User user, ImageList imageList) {

        this.forum = forum;
        this.cover = cover;
        this.stat = stat;
        this.officialMaster = isOfficialMaster;
        this.post = post;
        this.topics = topics;
        this.user = user;
        this.selfOperation = selfOperation;
        this.user = user;
        this.imageList = imageList;
    }

}
