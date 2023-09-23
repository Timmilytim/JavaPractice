package com.Playables;

public class MusicPlayer implements  Playable{

    @Override
    public void play() {
        System.out.println("Play the Music");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Music");
    }
}
