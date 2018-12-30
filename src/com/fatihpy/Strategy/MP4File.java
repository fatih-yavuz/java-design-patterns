package com.fatihpy.Strategy;

public class MP4File implements AudioFile{

    private String mp4Content;

    public MP4File(String mp4Content) {
        this.mp4Content = mp4Content;
    }

    public String getMp4Content() {
        return mp4Content;
    }

    public void setMp4Content(String mp4Content) {
        this.mp4Content = mp4Content;
    }

    @Override
    public String getContent() {
        return this.getMp4Content();
    }
}
