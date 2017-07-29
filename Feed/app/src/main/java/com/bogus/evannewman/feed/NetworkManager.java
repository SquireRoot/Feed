package com.bogus.evannewman.feed;

import java.net.URL;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Evan Newman on 7/29/2017.
 */

public class NetworkManager {
    private Downloader downloader;
    private Thread downloadthread;
    private LinkedBlockingQueue<Bucket> queue = new LinkedBlockingQueue<>();

    public NetworkManager() {
        downloadthread = new Thread(downloader);
        downloadthread.start();
    }

    public Post getPost(int chronid) {

    }

    public void loadPost(Post p) {

    }

    class Downloader implements Runnable {

        @Override
        public void run() {
            while (true) {
                Bucket command = queue.poll();
                switch (command.downloadtype) {
                    case "JSON":
                        // download json
                    case "IMG":

                }
            }
        }
    }

    class Bucket {
        // download json files
        // download images from urls
        public String downloadtype;
        public URL url;
        public Post post;

        public Bucket(String downtype, URL url) {
            this.downloadtype = downtype;
            this.url = url;
        }
    }
}
