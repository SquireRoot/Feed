package com.bogus.evannewman.feed;

import java.util.Hashtable;

/**
 * Created by Evan Newman on 7/29/2017.
 */

public class DatabaseManager {
    private int chronend;
    private Hashtable<String, Post> database;

    public DatabaseManager() {
        database = new Hashtable<>();
    }

    public void getNewPosts(int chrondelta) {

    }

    public void unloadOldPosts(int chrondelta) {

    }

    public void setEnd(int endnum) {
        int diff = endnum - chronend;

        getNewPosts(diff);
        unloadOldPosts(diff);

        chronend = endnum;
    }

}
