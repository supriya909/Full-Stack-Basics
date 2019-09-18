package com.h2kinfosys.fullstackbasics;

public class Variables {

	//Properties - Variables are instance variable 
	// Premitives - data type
	//Numeric Data
	byte byteData = 99;
	short shortData = 9999;
	int intData = 999999999;
	long longData = 99999999999999l; 
	
	//Decimal data
	float floatData = 1212.21323f;
	double doubledata = 23213.23213;
	
	//Character
	char charData = 'A'; // single quote, only one char
	
	// Boolean
	boolean boolData = false;
	
	//String - Non Primitive
	String strData = "Anything.. from single alphabet to a novel";
	
	// Class Level Variable ( static ) - reference variables
	// common values for all instances
	static String companyName = "H2KInfosys Inc";

	
	public static void main(String[]args) {
		
		String localVar = "Something in Local Variable";
		Variables varOne = new Variables();
		Variables.companyName = "Best Buy Inc";
	    // properties and methods are accessible with . --> instance Name.<variables> or functions
		varOne.strData = "I am giving a new value ";
			System.out.println("VarOne :: " + varOne.strData);
			System.out.println("VarOne :: " + Variables.companyName);
			
			Variables varTwo = new Variables();
			System.out.println("VarTwo :: " + varTwo.strData);
			System.out.println("VarTwo :: " + Variables.companyName);
			
		
	}
	}
	
	
	
	
	

