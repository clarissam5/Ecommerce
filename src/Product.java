/*
 * Quiz 5/9:Ecommerce 
 * Author:Clarissa Mercado 
 * Date: 08-13-18,  08-27-18
 */
public abstract class Product {
	//Declaring attributes that will be inherited by subclasses 
	protected String name;
	protected double price;
	protected int quantity;
		//Removing other attributes 
		/*private char size;
		private String author;
		private String color;
		private String category;*/
	
	//Getters and setters for private attributes 

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
		/*public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}*/
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
		/*public char getSize() {
			return size;
		}
		public void setSize(char size) {
			this.size = size;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}*/

	
	
	//Constructors
	Product(String name, double price, int quantity){
		this.name = name;
		this.price = price; 
		this.quantity = quantity; 
		
/*		Product(String name, double price, String category, int quantity, char size, String color){
			this.name = name;
			this.price = price;
			this.category = category;
			this.quantity = quantity;
			this.size = size;
			this.color = color; 	
		}
			
		Product(String name, double price, String category, int quantity, String author){
			this.name = name;
			this.price = price;
			this.category = category;
			this.quantity = quantity;
			this.author = author; 
		}
		
*/	
	}
	
	//Override of toString method to printout all attribtues 
	/*public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + ", quantity=" + quantity
				+ ", size=" + size + ", author=" + author + ", color=" + color + "]";
	}*/

	//Instance method 
	boolean buy(){
		if(this.quantity > 0) {
			this.quantity--;
			return true;
		} 
		else {
			return false; 
		} 
	}
	
	//Abstract method
	public abstract void getDetails();
	
	
}
