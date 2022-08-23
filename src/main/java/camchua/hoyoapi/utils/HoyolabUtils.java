package camchua.hoyoapi.utils;

import camchua.hoyoapi.HoyoAPI;
import camchua.hoyoapi.api.hoyolab.HoyoLabAPI;
import camchua.hoyoapi.api.hoyolab.data.search.HoyoSearch;
import camchua.hoyoapi.api.hoyolab.data.search.model.posts.HoyoPosts;
import camchua.hoyoapi.api.hoyolab.data.search.model.posts.post.*;
import camchua.hoyoapi.api.hoyolab.data.search.model.user.HoyoUser;
import camchua.hoyoapi.enums.HoyoGame;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class HoyolabUtils {

    public static HoyoSearch initHoyoSearch(String keyword, HoyoGame hoyoGame, boolean cn) {
        HoyoLabAPI api = HoyoAPI.inst().hoyolab();
        String searchStr = api.getSearch(keyword, hoyoGame, cn);
        JSONObject search = new JSONObject(searchStr);
        if(search.getInt("retcode") != 0) {
            System.out.println("Init Hoyo Search error: " + search.getString("message"));
            return new HoyoSearch(null, null);
        }

        List<HoyoPosts> hoyoPosts = new ArrayList<>();
        if(true) {
            JSONArray postsArray = search.getJSONObject("data").getJSONArray("posts");
            for(int i = 0; i < postsArray.length(); i++) {
                JSONObject postsData = postsArray.getJSONObject(i);

                JSONObject forumObject = postsData.getJSONObject("forum");
                Forum forum = new Forum(forumObject.getString("name"), forumObject.getInt("id"));

                JSONObject coverObject = postsData.getJSONObject("cover");
                Cover cover = new Cover(coverObject.getString("size"), coverObject.getInt("width"), coverObject.getString("format"), coverObject.getString("url"), coverObject.getInt("height"));

                JSONObject statObject = postsData.getJSONObject("stat");
                Stat stat = new Stat(statObject.getInt("view_num"), statObject.getInt("like_num"), statObject.getInt("reply_num"), statObject.getInt("bookmark_num"));

                boolean isOfficialMaster = postsData.getBoolean("is_official_master");

                JSONObject postObject = postsData.getJSONObject("post");
                JSONObject postStatusObject = postObject.getJSONObject("post_status");
                Post post = new Post(postObject.getInt("is_original"), postObject.getString("subject"), postObject.getString("reply_time"), postObject.getBoolean("is_interactive"), postObject.getInt("view_type"), postObject.getInt("created_at"), postObject.getString("content"), postObject.getString("cover"), postObject.getString("uid"), postObject.getInt("f_forum_id"), postObject.getInt("is_deleted"), postObject.getString("post_id"), new Post.PostStatus(postStatusObject.getBoolean("is_official"), postStatusObject.getBoolean("is_good"), postStatusObject.getBoolean("is_top")), postObject.getInt("republish_authorization"), postObject.getInt("max_floor"), postObject.getInt("game_id"), postObject.getInt("view_status"));

                JSONArray topicsArray = postsData.getJSONArray("topics");
                List<Topics.Topic> topicsList = new ArrayList<>();
                Topics topics = null;
                for (int ii = 0; ii < topicsArray.length(); ii++) {
                    JSONObject topicObject = topicsArray.getJSONObject(ii);
                    topicsList.add(new Topics.Topic(topicObject.getString("cover"), topicObject.getString("name"), topicObject.getInt("id")));
                }
                topics = new Topics(topicsList);

                boolean isUserMaster = postsData.getBoolean("is_user_master");

                JSONObject selfOperationObject = postsData.getJSONObject("self_operation");
                SelfOperation selfOperation = new SelfOperation(selfOperationObject.getInt("attitude"));

                JSONObject userObject = postsData.getJSONObject("user");
                User user = new User(userObject.getString("uid"), userObject.getInt("gender"), userObject.getString("introduce"), userObject.getString("nickname"), userObject.getString("avatar"));

                JSONArray imageListArray = postsData.getJSONArray("image_list");
                List<ImageList.Image> imageLists = new ArrayList<>();
                ImageList imageList = null;
                for (int ii = 0; ii < imageListArray.length(); ii++) {
                    JSONObject imageObject = imageListArray.getJSONObject(ii);
                    imageLists.add(new ImageList.Image(imageObject.getString("size"), imageObject.getInt("width"), imageObject.getString("format"), imageObject.getString("url"), imageObject.getInt("height")));
                }
                imageList = new ImageList(imageLists);

                hoyoPosts.add(new HoyoPosts(forum, cover, stat, isOfficialMaster, post, topics, isUserMaster, selfOperation, user, imageList));
            }
        }

        List<HoyoUser> hoyoUsers = new ArrayList<>();
        if(true) {
            JSONArray usersArray = search.getJSONObject("data").getJSONArray("users");
            for(int i = 0; i < usersArray.length(); i++) {
                JSONObject userObject = usersArray.getJSONObject(i);
                hoyoUsers.add(new HoyoUser(userObject.getString("uid"), userObject.getInt("gender"), userObject.getString("avatar_url"), userObject.getString("introduce"), userObject.getString("nickname"), userObject.getBoolean("is_followed"), userObject.getString("avatar"), userObject.getBoolean("is_following")));
            }
        }

        return new HoyoSearch(hoyoPosts, hoyoUsers);
    }

}
