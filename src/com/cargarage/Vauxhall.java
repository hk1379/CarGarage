package com.cargarage;

public class Vauxhall extends Car{
    //attributes
    private String model;

    //constructor
    Vauxhall(String model, int doors, String colour, double engineSize, String transmission, int seatNumber) {
        super(doors, colour, engineSize, transmission, seatNumber);
        this.model = model;
    }

    //setters and getters
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
