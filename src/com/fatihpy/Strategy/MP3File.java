package com.fatihpy.Strategy;

public class MP3File implements AudioFile{

    private String mp3Content;

    public MP3File(String mp3Content) {
        this.mp3Content = mp3Content;
    }

    public String getMp3Content() {
        return mp3Content;
    }

    public void setMp3Content(String mp3Content) {
        this.mp3Content = mp3Content;
    }

    @Override
    public String getContent() {
        return this .getMp3Content();
    }
}
