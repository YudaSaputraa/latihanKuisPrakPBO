package com.interfacepackage;

public class Spotify implements MediaPlayer {
    String title;

    public Spotify(String title) {
        this.title = title;
    }

    @Override
    public void pause() {
        System.out.println("Pause musik " + title);
    }

    @Override
    public void play() {
        System.out.println("Play musik " + title);
    }

    @Override
    public void resume() {
        System.out.println("Resume musik " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stop musik " + title);
    }

}
