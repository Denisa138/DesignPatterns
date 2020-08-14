package com.command;

public class Video {
    private String video;

    public Video(String video) {
        this.video = video;
    }

    public void changeContrast(){
        video = "changed contrast";
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
