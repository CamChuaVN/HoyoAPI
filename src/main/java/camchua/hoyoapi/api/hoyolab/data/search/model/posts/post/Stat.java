package camchua.hoyoapi.api.hoyolab.data.search.model.posts.post;

import lombok.Getter;

public class Stat {

    @Getter private int viewNum;
    @Getter private int likeNum;
    @Getter private int replyNum;
    @Getter private int bookmarkNum;

    public Stat(int viewNum, int likeNum, int replyNum, int bookmarkNum) {
        this.viewNum = viewNum;
        this.likeNum = likeNum;
        this.replyNum = replyNum;
        this.bookmarkNum = bookmarkNum;
    }

}
