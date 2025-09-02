package org.example;

public class VideoPlayer implements Playable{
    public VideoPlayer(){}

    @Override
    public String play(){
        return "this video";
    }
}
