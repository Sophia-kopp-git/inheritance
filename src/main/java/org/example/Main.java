package org.example;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Opel", "X1", 2000);
        Car car = new Car("BMW", "Y1", 2005, 5);
        Motorcycle motorcycle = new Motorcycle("BMW", "Z1", 1999, "Chopper");

        System.out.println(vehicle.toString());
        System.out.println(car.toString());
        System.out.println(motorcycle.getType());
    }
}