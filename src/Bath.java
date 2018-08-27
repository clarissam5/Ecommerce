/*
 * Quiz 9:Ecommerce 
 * Author:Clarissa Mercado 
 * Date: 08-27-18
 */
public class Bath extends Product{

	Bath(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	@Override
	public void getDetails() {
		System.out.println("We sell organic bath products!");
		
	}

	@Override
	public String toString() {
		return "Bath [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
