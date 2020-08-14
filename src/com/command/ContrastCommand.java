package com.command;

public class ContrastCommand implements UndoableCommand{
    private String prevVideo;
    private Video video;
    private History videoModifies;

    public ContrastCommand(Video video, History history) {
        this.video = video;
        this.videoModifies = history;
    }

    @Override
    public void unexecute() {
        video.setVideo(prevVideo);
        //videoModifies.pop();
    }

    @Override
    public void execute() {
       prevVideo = video.getVideo();
       video.changeContrast();
       videoModifies.push(this);
    }
}
