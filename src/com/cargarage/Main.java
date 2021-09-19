package com.cargarage;

public class Main {

    public static void main(String[] args) {

    //creating a practice car
    Landrover car1 = new Landrover("RangeRover",4, "green",2.2,"Manual",5);
    Landrover car2 = new Landrover("Discovery",4, "red",2.4,"Automatic",5);
    Vauxhall car3 = new Vauxhall("Astra", 2, "blue",3.0,"Automatic",5);
    Volkswagen car4 = new Volkswagen("Golf",4, "green",1.2,"Manual",5);
    Volkswagen car5 = new Volkswagen("Touran", 2, "red",3.0,"Automatic",5);
    Ford car6 = new Ford("Focus",4, "blue",1.4,"Manual",5);
    Bmw car7 = new Bmw("1 series",2, "green",2.0,"Automatic",5);
    //System.out.println(car1);

    //creating a practice customer
    Customer customer1 = new Customer("Male", "Bob", 24, 174, 74);
    Customer customer2 = new Customer("Male", "Chris", 25, 190, 78);
    Customer customer3 = new Customer("Male", "Charles", 40, 180, 80);
    Customer customer4 = new Customer("Male", "Rob", 50, 170, 100);
    Customer customer5 = new Customer("Male", "Robert", 34, 180, 61);
    Customer customer6 = new Customer("Male", "Hogan", 45, 190, 120);
    Customer customer7 = new Customer("Male", "Philip", 40, 200, 140);
    Customer customer8 = new Customer("Male", "Harry", 41, 200, 65);
    //System.out.println(customer1);

    //instantiate admin and link car to customer
    Admin admin1 = new Admin();
    admin1.addCustomerCar(customer1, car1);
    admin1.addCustomerCar(customer2, car2);
    admin1.addCustomerCar(customer3, car3);
    admin1.addCustomerCar(customer4, car4);
    admin1.addCustomerCar(customer5, car5);

    //printing all car owners and their car information
    System.out.println("Owners Information:");
    admin1.printOwners();
    System.out.println("");

    //printing a specific customers information
    System.out.println("Customer Information:");
    admin1.printCustomerInfo(customer8);
    System.out.println("");

    //checking to see if a specific customer is an owner or not
    System.out.println("Owner Check:");
    admin1.ownerCheck(customer2);
    admin1.ownerCheck(customer8);
    System.out.println("");

    //checking to see if a specific car is available or has already been bought
    System.out.println("Car Availability Check:");
    admin1.carAvailability(car3);
    admin1.carAvailability(car6);
    System.out.println("");

    //printing out a specific cars information
    System.out.println("Printing out specific cars information:");
    admin1.printCarInfo(car1);
    }
}
