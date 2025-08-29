package org.example;

public class Motorcycle extends Vehicle{
    private String type;
    public Motorcycle(String manufacturer, String model, int yearOfManufacturer, String type){
        super(manufacturer, model, yearOfManufacturer);
        this.type = type;
    }
    //getter
    public String getType(){
        return type;
    }


}
