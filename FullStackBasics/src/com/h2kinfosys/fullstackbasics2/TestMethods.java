package com.h2kinfosys.fullstackbasics2;


public class TestMethods {
	
	/* Understanding method
	 * 1. Access Modifier
	 * 2.
	 * Return type - output(no return is void)
	 * method name - camelCase(get and set - accessors)
	 * 4. Arguments or parameters or inputs provided in ()
	 * Metyhod body {}
	 * Exception- see this later
	 * 
	 
	 */

public String getCustomerDetails(int custId) {
	String text = "Customer With ID :: " + custId;
	return text;
}

// Overloading
//1. Number of arguments
//2. Type of argument
public String getCustomerDetails(String firstName) {
	String text = " Customer with Name ::" + firstName;
	return text;
} 

public String getCustomerDetails(int custId, String firstName) {
	String text = " Customer with Name ::" + firstName + "and ID ::" + custId;
	return text;
}
public int sumOfStartToEnd(int startValue, int endValue) {
    int sum = 0;
	while(startValue<=endValue) {
		sum = sum + startValue;
		startValue++;
			
		
	}
	  System.out.println("Sum ::" + sum);
	  return sum;
	  
}

public static void main(String[] args) {
	TestMethods test = new TestMethods();
	int sum = test.sumOfStartToEnd(1,  10);
	System.out.println(sum);
			
			
}

	  
	  
			
			
	
	
}

