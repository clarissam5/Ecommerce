/*
 * Quiz 5:Ecommerce 
 * Author:Clarissa Mercado 
 * Date: 08-27-18
 */
public class Book extends Product {
	
	private String author;
	private String genre;
	private String isbn;
	
	Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		this.author = author;
	}
	
	Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	@Override
	public void getDetails() {
		System.out.println("We sell books that’ll make you smarter at programming");
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", genre=" + genre + ", isbn=" + isbn + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
