package com.practise.functionalinterface;

public class ExecuteMain {
	
	//TODO: To be completed: cannot understand properly

	/*
	 * Java provides a new feature called method reference in Java 8. Method
	 * reference is used to refer method of functional interface.
	 * 
	 * It is compact and easy form of lambda expression. Each time when you are
	 * using lambda expression to just referring a method, you can replace your
	 * lambda expression with method reference.
	 * 
	 * There are following types of method references in java:
	 * 
	 * Reference to a static method. Reference to an instance method. Reference to a
	 * constructor.
	 */

	public static void main(String[] args) {

		// Through Lambda
		SampleFunctionalInterface sfi = (str) -> {
			System.out.println(str);
		};
		
		sfi.print("Test");
		
		
		//Through method reference
		
	}

}
