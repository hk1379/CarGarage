package com.cargarage;

public class Car {

    //attributes
    //id needs to be primary key
    private static int counter = 0;
    private int id;
    private int doors;
    private String colour;
    private double engineSize;
    private String transmission;
    private int seatNumber;
    private String model;

    //constructor
    Car (int doors, String colour, double engineSize, String transmission, int seatNumber) {
        this.id = this.counter;
        this.doors = doors;
        this.colour = colour;
        this.engineSize = engineSize;
        this.transmission = transmission;
        this.seatNumber = seatNumber;
        counter ++;
    }

    //getters and setters
    public void setId(int id) {this.id = id;}

    public int getId() {return id; }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getModel() {return null; }
}
