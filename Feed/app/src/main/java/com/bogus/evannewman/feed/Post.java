package com.bogus.evannewman.feed;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.lang.Exception;
import java.lang.System;
import java.net.URL;

/**
 * Created by Evan Newman on 7/29/2017.
 */

public class Post {
    private int chronid;
    private String id;
    private String title;
    private URL imageURL;
    private Bitmap image;
    private URL error = new URL("http://www.freeiconspng.com/uploads/round-error-icon-16.jpg");
    // image


    public Post(String id, String title, String url) {
        this.imageURL = new URL(url);
        this.id = id;
        this.title = title;
    }

    public boolean loadData() {
        // load the image into cache
        try {
            image = BitmapFactory.decodeStream(imageURL.openStream().getInputStream);
            //use a network function
        }catch(Exception e){
            image = BitmapFactory.decodeStream(error.openStream().getInputStream);

            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    public boolean unloadData() {
        // delete image cache
        image = null;
        return true;
    }
}
