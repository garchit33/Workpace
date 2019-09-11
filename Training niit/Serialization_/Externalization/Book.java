package Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Book implements Externalizable {
	
	private int bookid;
	private String title;
	private String author;
	private double price;
	
	public Book() 
	{
		
	}
	
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

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.bookid = in.readInt();
		this.title = (String)in.readObject();
//		this.author = (String)in.readObject();
//		this.price = in.readDouble();
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(bookid);
		out.writeObject(title);
//		out.writeObject(author);
//		out.writeDouble(price);
		
	}

	

}
