package com.skilldistillery.foodTruckProject;

import java.util.Scanner;

public class FoodTruckApp {

	FoodTruck [] truckList = new FoodTruck[5];
	

	public static void main(String[] args) {

		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Food Truck Name: ");
		String name = kb.next();
		System.out.println("Enter Food that the Food Truck provides: ");
		String food = kb.next();
		System.out.println("Enter Food Truck Rating");
		int rating = kb.nextInt();

		FoodTruck fTruck = new FoodTruck (name, food, rating);		
		System.out.println(fTruck);
		kb.close();
	}
	
//	public void displayFoodTruck(Scanner kb) {
//		
//		System.out.println("Choose which Food Truck you want to display.  Choose 1,2,3,4 or 5.");
//		
//		
//		String i = kb.next();
//				
//		switch(i) {
//{
//
//				case "1":
//						System.out.println(FoodTruck1);
//						break;				
//				case "2":
//						System.out.println(FoodTruck2);
//						break;			
//				case "3":
//						System.out.println(FoodTruck3);
//						break;
//								
//				case "4":
//						System.out.println(FoodTruck4);
//						break;
//								
//				case "5":
//						System.out.println(FoodTruck5);
//						break;
//				default:
//					    System.out.println("Choose between 1 and 5");
//					    
//			}
//			
//		}
//	}
//}

	
//}
	
	
}
