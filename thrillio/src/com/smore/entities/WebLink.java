package com.smore.entities;

/**
 * Created by simore on 1/4/2017.
 */
public class WebLink extends Bookmark{

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    private String host;
    private String url;

}
