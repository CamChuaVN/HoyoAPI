package camchua.hoyoapi.api.hoyolab.data.search.model.posts.post;

import lombok.Getter;

public class SelfOperation {

    @Getter private int attitude;

    public SelfOperation(int attitude) {
        this.attitude = attitude;
    }

}
