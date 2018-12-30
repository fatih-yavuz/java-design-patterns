package com.fatihpy.Strategy;

public class MP4Decoder implements Decoder {
    @Override
    public void decode(AudioFile file) {
        if(file instanceof MP4File) {
            System.out.println(file.getContent());
        } else {
            System.out.println("Cant play. Only MP4 is allowed");
        }

    }
}
