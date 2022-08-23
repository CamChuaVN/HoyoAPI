package camchua.hoyoapi.api.hoyolab.data.search.model.posts.post;

import lombok.Getter;

public class Cover {

    @Getter private String size;
    @Getter private int width;
    @Getter private String format;
    @Getter private String url;
    @Getter private int height;

    public Cover(String size, int width, String format, String url, int height) {
        this.size = size;
        this.width = width;
        this.format = format;
        this.url = url;
        this.height = height;
    }

}
