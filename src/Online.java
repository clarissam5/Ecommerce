/*
 * Quiz 9:Ecommerce 
 * Author:Clarissa Mercado 
 * Date: 08-27-18
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner; 

public class Online {
	//adding static attributes
	protected static double totalAmount = 0.0;
	protected static int userInput = 9;
	protected static ArrayList<Product> items = new ArrayList<Product>();
	
	public static void main(String args[]) {
		//adding objects to ArrayList
		items.add(new Apparel("Business Ritual Women's Long Sleeve Top", 65.39, 4, 'L', "Blue"));
		items.add(new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth", "Education" ,
				"9788-429-1266-48"));
		items.add(new Apparel("Men's Business Casual Shirt", 57.10, 2, 'M', "Teal"));
		items.add(new Bath("Organic Tumeric Soap", 11.25, 1));
		items.add(new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman"));
		
		//take userInput using Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Print Menu using array list
		//user can buy products as long as it is in stock, once the user inputs invalid input/or wants to quit,
		//print total amount and break out of the menu loop
		//Menu option inside while(true) loop
		while(true) {
			System.out.println("Enter product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4"); 
			//use for loop to loop through inventory array output = index : inventory[index] and it's name 
			for (int i = 0; i <items.size() ; i++) {
				System.out.println(i + ":" + items.get(i));
				}	
				//Try Scanner input 
			try {
				userInput = keyboard.nextInt();
				if(items.get(userInput).buy()) {
					System.out.println("Your purchase was successful!");
					totalAmount += items.get(userInput).getPrice(); 
				} else {
					System.out.println("Sorry! This product is out of stock.");
					}
				}
				//If user does not enter integer JVM throws exception 
				catch(InputMismatchException e){
					System.out.println("Invalid input, exiting the shopping cart! Your total amount is: " + totalAmount);
						break;
					}
				//changing exception from ArrayIndexOutOfBoundsException to IndexOutOfBoundsException
				catch(IndexOutOfBoundsException e) {
					System.out.println("Thank you for shopping with us! The total amount is " + totalAmount);
						break;
					}
		//close Scanner
		}
		keyboard.close();
		
	}
}
