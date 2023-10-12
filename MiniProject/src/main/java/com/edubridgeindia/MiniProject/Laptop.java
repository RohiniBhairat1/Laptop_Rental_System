package com.edubridgeindia.MiniProject;

public class Laptop {

	
	private int id;
    private String brand;
    private String model;
    private boolean available;

    public Laptop(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rent() {
        available = false;
    }

    public void returnLaptop() {
        available = true;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Brand: " + brand + ", Model: " + model + ", Available: " + available;
    }
}





	
	

