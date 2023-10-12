package com.edubridgeindia.MiniProject;

import java.util.ArrayList;
import java.util.List;



public class RentalSystem {

	private List<Laptop> laptops = new ArrayList<>();
    private int nextId = 1;

    
    
    
    public void addLaptop(String brand, String model) {
        Laptop laptop = new Laptop(nextId++, brand, model);
        laptops.add(laptop);
    }
    
    
    
    public boolean rentLaptop(int id) {
        Laptop laptop = findLaptopById(id);

        if (laptop != null && laptop.isAvailable()) {
            laptop.rent();
            return true; // Rental successful
        }

        return false; // Laptop not found or already rented
    }
    

    public boolean returnLaptop(int id) {
        Laptop laptop = findLaptopById(id);

        if (laptop != null && !laptop.isAvailable()) {
            laptop.returnLaptop();
            return true; // Return successful
        }

        return false; // Laptop not found or not rented
    }
    
    
  // public List<laptop> getAlllaptops() {
       // return laptops;
   //}
    
    
    public List<Laptop> getAllAvailableLaptops() {
        List<Laptop> availableLaptops = new ArrayList<>();
        
        for (Laptop laptop : laptops) {
            if (laptop.isAvailable()) {
                availableLaptops.add(laptop);
            }
        }
        
        return availableLaptops;
    }
   
    
    
    public Laptop findLaptopById(int id) {
        for (Laptop Laptop : laptops) {
            if (Laptop.getId() == id) {
                return Laptop;
            }
        }
        return null;
    }

    public List<Laptop> getAllLaptops() {
        return laptops;
    }
    
    
    public boolean updatelaptop(int id, String newBrand, String newModel) {
        Laptop laptop = findLaptopById(id);

        if (laptop != null) {
            laptop.setBrand(newBrand);
            laptop.setModel(newModel);
            return true; // Update successful
        }

        return false; // Laptop not found
    }
    
    

    

    public void deleteLaptop(int id) {
        Laptop laptop = findLaptopById(id);
        if (laptop != null) {
            laptops.remove(laptop);
        }
    }
    

    public boolean laptopExists(int id) {
        for (Laptop laptop : laptops) {
            if (laptop.getId() == id) {
                return true; // Laptop with the specified ID exists
            }
        }
        return false; // Laptop with the specified ID doesn't exist
    }



	
    
    

  


   

        	    
   

}


	
	
	

