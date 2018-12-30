package com.fatihpy.Strategy;

public class Main {

    public static void main(String[] args) {

        AudioPlayer player1 = new AudioPlayer(new MP3Decoder());
        AudioPlayer player2 = new AudioPlayer(new MP4Decoder());

        AudioFile mp3 = new MP3File("This is a mp3 file.");
        AudioFile mp4 = new MP4File("This is a mp4 file");


        player1.performDecode(mp3);
        player2.performDecode(mp4);

        // Cant play
        player2.performDecode(mp3);

        // We are going to make player2 play mp3...
        player2.setDecoder(new MP3Decoder());
        player2.performDecode(mp3);

    }
}
