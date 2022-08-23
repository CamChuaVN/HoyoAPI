import camchua.hoyoapi.HoyoAPI;
import camchua.hoyoapi.api.hoyolab.data.search.HoyoSearch;
import camchua.hoyoapi.api.hoyolab.data.search.model.posts.HoyoPosts;
import camchua.hoyoapi.api.hoyolab.data.search.model.user.HoyoUser;
import camchua.hoyoapi.enums.HoyoGame;

public class HoyoSearchTest {

    public static void main(String[] args) {
        String keyword = "diona";
        HoyoGame hoyoGame = HoyoGame.GENSHIN_IMPACT;
        HoyoSearch search = HoyoAPI.inst().hoyolab().search(keyword, hoyoGame);
        for(HoyoPosts post : search.getPosts()) {
            System.out.println("Post name: " + post.getPost().getSubject());
            System.out.println("Post content: " + post.getPost().getContent());
            System.out.println("View: " + post.getStat().getViewNum());
            System.out.println("Like: " + post.getStat().getLikeNum());
            System.out.println("Link: " + post.getPost().getPostUrl());
            System.out.println(" ");
        }

        System.out.println(" ");
        for(HoyoUser user : search.getUsers()) {
            System.out.println("Username: " + user.getNickname());
            System.out.println("ID: " + user.getUid());
        }
    }

}
