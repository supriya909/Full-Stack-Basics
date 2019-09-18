package com.h2kinfosys.fullstackbasics2;

public class Constructor {

	//1. Dont have return type
	// 2. always have class names
	// parameterized constructor - constructor with arguments
	
	public Constructor(String sampleParameter) {
		this();
		System.out.println("Creating instance of Constructor Class" + sampleParameter);
	}
	public Constructor () {
		System.out.println("No Argument Constructor");
	}
	
	
	public static void main(String[] args) {
		Constructor constructor = new Constructor("Sample Param");
		// Compiler will give you default constuctor only when u dont have any constructor at all
	}

}
