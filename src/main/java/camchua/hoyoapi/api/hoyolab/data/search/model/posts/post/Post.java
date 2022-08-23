package camchua.hoyoapi.api.hoyolab.data.search.model.posts.post;

import lombok.Getter;

public class Post {

    @Getter private int isOriginal;
    @Getter private String subject;
    @Getter private String replyTime;
    @Getter private boolean interactive;
    @Getter private int viewType;
    @Getter private long createdAt;
    @Getter private String content;
    @Getter private String cover;
    @Getter private String uid;
    @Getter private int fForumId;
    @Getter private int isDeleted;
    @Getter private String postId;
    @Getter private PostStatus postStatus;
    @Getter private int republishAuthorization;
    @Getter private int maxFloor;
    @Getter private int gameId;
    @Getter private int viewStatus;

    public Post(int isOriginal, String subject, String replyTime, boolean isInteractive, int viewType, long createdAt,
                String content, String cover, String uid, int fForumId, int isDeleted, String postId, PostStatus postStatus,
                int republishAuthorization, int maxFloor, int gameId, int viewStatus) {

        this.isOriginal = isOriginal;
        this.subject = subject;
        this.replyTime = replyTime;
        this.interactive = isInteractive;
        this.viewType = viewType;
        this.createdAt = createdAt;
        this.content = content;
        this.cover = cover;
        this.uid = uid;
        this.fForumId = fForumId;
        this.isDeleted = isDeleted;
        this.postId = postId;
        this.postStatus = postStatus;
        this.republishAuthorization = republishAuthorization;
        this.maxFloor = maxFloor;
        this.gameId = gameId;
        this.viewStatus = viewStatus;
    }

    public String getPostUrl() {
        return "https://hoyolab.com/article/" + this.postId;
    }


    public static class PostStatus {

        @Getter private boolean official;
        @Getter private boolean good;
        @Getter private boolean top;

        public PostStatus(boolean isOfficial, boolean isGood, boolean isTop) {
            this.official = isOfficial;
            this.good = isGood;
            this.top = isTop;
        }

    }

}
