package com.bogus.evannewman.feed;

import java.util.ArrayList;

/**
 * Created by Evan Newman on 7/29/2017.
 */

public class DatabaseManager {
    private int chronend;
    private final int maxloadedposts = 100;
    private ArrayList<Post> database;

    public DatabaseManager() {
        database = new ArrayList<>();
    }

    public Post getPost(int chronnum) {
        if (chronnum >= database.size()) {
            for (int i = 0; i < (chronnum - database.size() - 2); i++) {
                //get a new post

                database.add()
            }
            // load new post and add it
        } else {
            synchronized (database) {
                return database.get(chronnum);
            }
        }
    }

}
