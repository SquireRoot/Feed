package com.bogus.evannewman.feed;

import java.net.URL;

/**
 * Created by Evan Newman on 7/29/2017.
 */

public class Post {
    private int chronid;
    private String id;
    private String title;
    private URL imageURL;
    private URL thumbnailURL;
    // image


    public Post() {

    }

    public boolean loadData() {
        // load the image into cache
    }

    public boolean unloadData() {
        // delete image cache
    }
}
