package camchua.hoyoapi.api.hoyolab.data.search.model.posts.post;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class ImageList {

    @Getter private List<Image> image = new ArrayList<>();

    public ImageList(List<Image> images) {
        for(Image i : images)
            image.add(i);
    }


    public static class Image {

        @Getter private String size;
        @Getter private int width;
        @Getter private String format;
        @Getter private String url;
        @Getter private int height;

        public Image(String size, int width, String format, String url, int height) {
            this.size = size;
            this.width = width;
            this.format = format;
            this.url = url;
            this.height = height;
        }

    }

}
