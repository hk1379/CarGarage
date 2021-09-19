package com.cargarage;

public class Customer {

    //attributes
    private static int counter = 0;
    private int id;
    private String gender;
    private String name;
    private int age;
    private double height;
    private double weight;
    private String owner;

    //constructor
    Customer(String gender, String name, int age, double height, double weight){
        this.id = this.counter;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.owner = "No";
        counter ++;
    }

    //setters and getters
    public void setId(int id) {this.id = id;}

    public int getId() {return id; }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
