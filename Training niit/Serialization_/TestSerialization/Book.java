package TestSerialization;

import java.io.Serializable;

public class Book implements Serializable {
	
	private int bookid;
	private String title;
	private String author;
	private transient double price;
	
	public Book(int bookid, String title, String author, double price) {
		
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString()
	{
		return "Book{Book ID = " +bookid+ ", Book Title = " +title+", Book Author = " +author+", Book Price = "+price+"}";
	}

}
