package com.cargarage;

import java.util.HashMap;

public class Admin {

    //attributes
    private static HashMap<Customer, Car> ownersHashMap = new HashMap<Customer, Car>();

    //constructor
    Admin(){};

    //methods
    public void addCustomerCar(Customer customer, Car car) {
        ownersHashMap.put(customer, car);
    }

    public void printOwners() {
        for (Customer i: ownersHashMap.keySet()) {
            System.out.println("Owner ID: " + i.getId() + ", Owner Name: " + i.getName() + ", Car ID: " + ownersHashMap.get(i).getId() + ", Car Colour: " + ownersHashMap.get(i).getColour() + ", Car Model: " + ownersHashMap.get(i).getModel());
        }
    }

    public void printCustomerInfo(Customer customer) {
        System.out.println("Customer ID: " + customer.getId() + "\nCustomer Name: " + customer.getName()
                + "\nCustomer Age: " + customer.getAge() + "\nCustomer Gender: " + customer.getGender());
    }

    public void printCarInfo(Car car) {
        System.out.println("Car ID: " + car.getId() + "\nCar Colour: " +car.getColour() + "\nCar Transmission: " + car.getTransmission()
        + "\nDoor Number: " + car.getDoors() + "\nSeat Number: " + car.getSeatNumber() + "\nEngine Size: " + car.getEngineSize()
        + "\nCar Model: " +car.getModel());
    }

    public void ownerCheck(Customer customer) {
        int counter = 0;

        //iterating through the hashmap
        for (Customer i: ownersHashMap.keySet()) {
            //counting number of comparisons performed with hashmap where customer and i were not equal
            if (customer != i) {
                counter ++;
            }

            //comparing customer and i
            if (customer == i) {
                System.out.println(i.getName() + " is an owner and owns car with id = " + ownersHashMap.get(i).getId());
            }
            //checking to see if all keys in the hashmap were not matches. If so then i is not an owner
            else if (counter == ownersHashMap.size()){
                System.out.println(customer.getName() + " is not an owner");
            }
        }
    }

    public void carAvailability(Car car) {
        int counter = 0;

        //iterating through the hashmap
        for (Car i: ownersHashMap.values()) {
            if (car != i) {
                counter++;
            }

            if (car == i) {
                System.out.println("Car ID "+car.getId() + " has been bought by a Customer");
            }
            else if (counter == ownersHashMap.size()) {
                System.out.println("Car ID "+car.getId() + " is available to buy");
            }
        }
    }
}
