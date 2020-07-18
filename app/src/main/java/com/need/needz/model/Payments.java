package com.need.needz.model;

public class Payments {
    private String name;
    private String location;
    private String url;

    public Payments(String name, String location, String url) {
        this.name = name;
        this.location = location;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
