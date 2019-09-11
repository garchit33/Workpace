package snack;

import java.util.Scanner;

public class SouthSnacks extends Snacks {

	@Override
	void displaySnacks() {
		
		System.out.println("1. Idli Sambhar");
		System.out.println("2. Dosa");
		System.out.println("3. Upma");
		
		// TODO Auto-generated method stub
		
	}
	@Override
	void userInputSnacks() {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: System.out.println("Price of Idli Sambhar is Rs 60.");
			System.out.println("Please Enter the Quantity you want.");
			Scanner s = new Scanner(System.in);
			int qty = s.nextInt();
			double price = (qty*60);
			System.out.println("Your final price for the selected Item is : "+price);
		
		}
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		SouthSnacks ss=new SouthSnacks();
		ss.displaySnacks();
		ss.userInputSnacks();
	}

}
