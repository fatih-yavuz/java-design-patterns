package com.fatihpy.Strategy;

public class AudioPlayer {
    private Decoder decoder;

    public AudioPlayer(Decoder decoder) {
        this.decoder = decoder;
    }

    public Decoder getDecoder() {
        return decoder;
    }

    public void setDecoder(Decoder decoder) {
        this.decoder = decoder;
    }

    public void performDecode(AudioFile file) {
        decoder.decode(file);
    }
}
