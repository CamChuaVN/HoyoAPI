package camchua.hoyoapi.api.hoyolab.data.search.model.posts.post;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Topics {

    @Getter private List<Topic> topic = new ArrayList<>();

    public Topics(List<Topic> topics) {
        for(Topic t : topics)
            topic.add(t);
    }


    public static class Topic {

        @Getter private String cover;
        @Getter private String name;
        @Getter private int id;

        public Topic(String cover, String name, int id) {
            this.cover = cover;
            this.name = name;
            this.id = id;
        }

    }

}
