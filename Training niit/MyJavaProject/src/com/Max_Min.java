package com;

import java.util.Scanner;

public class Max_Min {
	
	int getMax(int[] arr) {

			int max_val = arr[0];
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>max_val)
					max_val= arr[i];
					
			}
			return max_val;
	}
	
	int getMin(int[] arr) {

		int min_val = arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min_val)
				min_val=arr[i];
				
		}
		return min_val;
}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		for(int i=0;i<array.length;i++) {
			
			array[i] = sc.nextInt();
		}
		
		Max_Min m=new Max_Min();
		System.out.println("Max Number : "+ m.getMax(array));
		System.out.println("Min Number: "+ m.getMin(array));
	}
	
}
