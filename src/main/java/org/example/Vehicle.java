package org.example;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int yearOfManufacture;

    public Vehicle(String manufacturer, String model, int yearOfManufacturer) {
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacturer;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
