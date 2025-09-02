package org.example;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Opel", "X1", 2000);
        Car car = new Car("BMW", "Y1", 2005, 5);
        Motorcycle motorcycle = new Motorcycle("BMW", "Z1", 1999, "Chopper");

        System.out.println(vehicle.toString());
        System.out.println(car.toString());
        System.out.println(motorcycle.getType());

        //static
        StaticExcercise staticEx = new StaticExcercise();

        System.out.println("instance:" + staticEx.incrementInstanceCount());
        System.out.println("static count" + StaticExcercise.incrementTotalCount());

        System.out.println(Calculator.add(2, 3));

        //interface
        VideoPlayer video = new VideoPlayer();
        MusicPlayer music = new MusicPlayer();
        MediaController mediaCtlr = new MediaController();
        System.out.println("video: " + mediaCtlr.playMedia(video));
        System.out.println("music: " + mediaCtlr.playMedia(music));
    }
}