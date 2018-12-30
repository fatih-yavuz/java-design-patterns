package com.fatihpy.Strategy;

public class MP3Decoder implements Decoder {

    @Override
    public void decode(AudioFile file) {
        if(file instanceof MP3File) {
            System.out.println(file.getContent());
        } else {
            System.out.println("Cant play. Only MP3 is allowed");
        }
    }
}
