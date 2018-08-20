/*
 * Quiz 5:Ecommerce 
 * Author:Clarissa Mercado 
 * Date: 08-13-18
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class Shop {
	
	public static boolean isShopOpen = true;
	public static double totalAmount = 0.0; 
	public static int userInput = 9; 
	public static Product[] inventory = { new Product("Business Ritual Women's Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue") , 
				new Product("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth"),
				new Product("Men's Business Cascual Shirt", 57.10, "Apparel", 2, 'M', "Teal"),
				new Product ("Organic Tumeric Soap", 11.25, "Bath & Beauty", 1),
				new Product ("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman"),
		};
			
	
	public static void main (String args[]) {
		/*//Creating Product objects
		Product prod1 = new Product("Business Ritual Women's Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue");
		Product prod2 = new Product("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth");
		Product prod3 = new Product("Men's Business Cascual Shirt", 57.10, "Apparel", 2, 'M', "Teal");
		Product prod4 = new Product("Organic Tumeric Soap", 1.25, "Bath & Beauty", 1);
		Product prod5 = new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman");
		*/
		//Checking if the shop is not open 
		if (!isShopOpen) {
			System.out.println("The Shop is not open.");
		}else {
		
		//Array of Product objects called inventory
		/*Product[] inventory = new Product [5]; //how many elements in student array 
		  	inventory[0]= new Product("Business Ritual Women's Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue");
		  	inventory[1]= new Product("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth");
		  	inventory[2]= new Product("Men's Business Cascual Shirt", 57.10, "Apparel", 2, 'M', "Teal");
		  	inventory[3]= new Product("Organic Tumeric Soap", 11.25, "Bath & Beauty", 1);
		  	inventory[4]= new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman");*/
	
		  /*//Declaring local variables 
		  double totalAmount = 0.0;
		  int userInput = 9;
		  */
		 //Creating Scanner object 
		Scanner keyboard = new Scanner(System.in);
		
		//Menu option inside while(true) loop
		while(true) {
			System.out.println("Enter product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to\r\n" + 
					"4"); 
			
			//use for loop to loop through inventory array output = index : inventory[index] and it's name 
			for (int i = 0; i <inventory.length; i++) {
			System.out.println(i + ":" + inventory[i].getName());
			}
			
			//Try Scanner input 
			try {
			userInput = keyboard.nextInt();
			if(inventory[userInput].buy()) {
				System.out.println("Your purchase was successful!");
					totalAmount += inventory[userInput].getPrice(); 
				} else {
				System.out.println("Sorry! This product is out of stock.");
				}
			}
				//If user doe snot enter integer JVM throws exception 
				catch(InputMismatchException e){
				System.out.println("Invalid input, exiting the shopping cart! Your total amount is: " + totalAmount);
					break;
				}
				catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Thank you for shopping with us! The total amount is " + totalAmount);
					break;
				}
			
			//if user enters a valid input 
			/*if(userInput >= 0 && userInput <= 4) {
				if(inventory[userInput].buy()) {
				System.out.println("Your purchase was successful!");
					totalAmount += inventory[userInput].getPrice(); 
				} else {
				System.out.println("Sorry! This product is out of stock.");
				}
			//entered other number other than 0,1,2,3,4
			} else {*/
			
				
			
		}
		keyboard.close(); 
		
		/*//EXTRA CREDIT FOR LOOP TO PRINT OUT INVENTORY 
		System.out.println("Product Inventory");
		for (Product products: inventory) {
			System.out.println(products + "\n");
		}*/
		}
	}
}
