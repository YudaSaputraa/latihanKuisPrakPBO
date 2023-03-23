package com.interfacepackage;

public class Main {
    public static void main(String[] args) {
        Spotify spotify = new Spotify("Balonku");
        YoutubeMusic yt = new YoutubeMusic("Bintang kecil");
        spotify.pause();
        yt.play();

    }

}
