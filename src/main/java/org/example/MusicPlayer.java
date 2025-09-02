package org.example;

public class MusicPlayer implements Playable {
    public MusicPlayer() {}

    @Override
    public String play(){
        return "this song";
    }
}
