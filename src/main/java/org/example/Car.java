package org.example;

public class Car extends Vehicle {
    private int numberOfDoors;
    public Car(String manufacturer, String model, int yearOfManufacturer, int numberOfDoors){
        super(manufacturer,  model, yearOfManufacturer);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }
}
