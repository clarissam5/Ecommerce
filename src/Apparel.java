/*
 * Quiz 9:Ecommerce 
 * Author:Clarissa Mercado 
 * Date: 08-27-18
 */
public class Apparel extends Product{
	
	private char size;
	private String color;

	Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}

	@Override
	public void getDetails() {
		System.out.println("We sell different kinds of business clothes for both men and women");
		
	}

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", color=" + color + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}
