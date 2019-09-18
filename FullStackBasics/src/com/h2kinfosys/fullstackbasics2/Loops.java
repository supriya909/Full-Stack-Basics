package com.h2kinfosys.fullstackbasics2;

public class Loops {
	
	// Array - set of elements of same type
	
	
	

	public static void main(String[] args) {
		int customers [] = {100,101,102,103,104};
		//System.out.println(customers[3]);
		
		// three types of loops
		int size = customers.length;
		System.out.println("Size of customer array :: " + size);
		
	   // while(condition) - block of code will executed
		int index = 3;
		while(index < size) {
			System.out.println("Sending email to customer number :: " + customers[index]);
			index++; // increse value by one
			
		}
		System.out.println("Jumped out of loop for Index :" + index);
		// use while loop when u r dependent on condition for number of iterations
		
		// block first and condition later
		index = 3;
		do {
			System.out.println("Sending email to customer number :: " + customers[index]);
		index++; // increse value by one
		 }while(index < size);
		
		// for - starting point, end point, increment
		for(int i = 0; i < size; i++) {
          System.out.println("For Loop way to send messages to consumer : : Customer Number" + customers[i]);
          
	   }
		
		// for-each loop
		for (int eachItem:customers) {
			System.out.println("This is from For Each Loop : Customer" + eachItem);
		}
	}
	
}
		
		
	
	
		
		
		
	


		
