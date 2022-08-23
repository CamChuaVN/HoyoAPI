package camchua.hoyoapi.api.hoyolab.data.search.model.posts.post;

import lombok.Getter;

public class Forum {

    @Getter private String name;
    @Getter private int id;

    public Forum(String name, int id) {
        this.name = name;
        this.id = id;
    }

}
