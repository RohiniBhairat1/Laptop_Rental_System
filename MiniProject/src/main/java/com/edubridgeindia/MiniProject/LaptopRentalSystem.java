package com.edubridgeindia.MiniProject;

import java.util.List;
import java.util.Scanner;


public class LaptopRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			
			        RentalSystem rentalSystem = new RentalSystem();
			        Scanner scanner = new Scanner(System.in);

			        
			        
			        while (true) {
			            System.out.println("==== Laptop Rental System ====");
			            System.out.println("1. Add Laptop");
			            System.out.println("2. Rent Laptop");
			            System.out.println("3. Return Laptop");
			            System.out.println("4. View All Laptops");
			            System.out.println("5. Update Laptop");
			            System.out.println("6. Delete Laptop");
			            System.out.println("7. Exit");
			            System.out.print("Enter your choice: ");

			            
			            
			            
			            int choice = scanner.nextInt();
			            scanner.nextLine(); // Consume the newline character

			            
			            
			            
			            switch (choice) {
			                case 1:
			                    System.out.print("Enter brand: ");
			                    String brand = scanner.nextLine();
			                    System.out.print("Enter model: ");
			                    String model = scanner.nextLine();
			                    rentalSystem.addLaptop(brand, model);
			                    System.out.println("Laptop added successfully.");
			                    break;
			                    
			                    
			                    
			                    
			                case 2:
			                
			                    //  renting laptop
			                
			                    System.out.print("Enter the ID of the laptop to rent: ");
			                    int idToRent = scanner.nextInt();
			                    Laptop laptopToRent = rentalSystem.findLaptopById(idToRent);
			                    
			                    if (laptopToRent != null) {
			                        if (laptopToRent.isAvailable()) {
			                            laptopToRent.rent();
			                            System.out.println("Laptop with ID " + idToRent + " has been rented.");
			                        } else {
			                            System.out.println("Laptop with ID " + idToRent + " is already rented.");
			                        }
			                    } else {
			                        System.out.println("Laptop with ID " + idToRent + " not found.");
			                    }
			                    break;

			                	
			                	
			                	
			                   
			                case 3:
			                    //  returning laptop
			                	System.out.print("Enter the ID of the laptop to return: ");
			                    int idToReturn = scanner.nextInt();
			                    Laptop laptopToReturn = rentalSystem.findLaptopById(idToReturn);
			                    
			                    if (laptopToReturn != null) {
			                        if (!laptopToReturn.isAvailable()) {
			                            laptopToReturn.returnLaptop();
			                            System.out.println("Laptop with ID " + idToReturn + " has been returned.");
			                        } else {
			                            System.out.println("Laptop with ID " + idToReturn + " is not rented.");
			                        }
			                    } else {
			                        System.out.println("Laptop with ID " + idToReturn + " not found.");
			                    }
			                	
			                    break;
			                    
			                    
			                
			                case 4:
				                
			                    // View all laptops
			                    List<Laptop> allLaptops = rentalSystem.getAllLaptops();
			                    
			                    if (allLaptops.isEmpty()) {
			                        System.out.println("No laptops are currently available.");
			                    } else {
			                        System.out.println("==== All Laptops ====");
			                        for (Laptop laptop : allLaptops) {
			                            System.out.println(laptop);
			                        }
			                    }
			                    break;
			                    
			                    
			                case 5:
			                    //  updating laptop
			                
			                    System.out.print("Enter the ID of the laptop to update: ");
			                    int idToUpdate = scanner.nextInt();
			                    scanner.nextLine(); // Consume the newline character
			                    System.out.print("Enter the new brand: ");
			                    String newBrand = scanner.nextLine();
			                    System.out.print("Enter the new model: ");
			                    String newModel = scanner.nextLine();
			                    boolean updateSuccess = rentalSystem.updatelaptop(idToUpdate, newBrand, newModel);
			                    
			                    if (updateSuccess) {
			                        System.out.println("Laptop with ID " + idToUpdate + " has been updated.");
			                    } else {
			                        System.out.println("Unable to update the laptop with ID " + idToUpdate + ".");
			                    }
			                    break;

			                    
			                case 6:
			                	
			                	//  deleting laptop
			                	System.out.print("Enter the ID of the laptop to delete: ");
			                    int idToDelete = scanner.nextInt();
			                    Laptop laptopToDelete = rentalSystem.findLaptopById(idToDelete);

			                    if (laptopToDelete != null) {
			                        rentalSystem.deleteLaptop(idToDelete);
			                        System.out.println("Laptop with ID " + idToDelete + " has been deleted.");
			                    } else {
			                        System.out.println("Laptop with ID " + idToDelete + " not found.");
			                    }
			                    
			                break;
			                 
			                
			                case 7:
			                	//exiting laptop
			                    System.out.println("Exiting the application. Goodbye!");
			                    System.exit(0);
			                default:
			                    System.out.println("Invalid choice. Please try again.");
			            }
			        }
			    }

	
		
	}
			


		


		
		

	


