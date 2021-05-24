package com.practise.method.reference;

public class ExecuteMain {

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
	 * 
	 * Advantage: you need not implement interface explicitly This can help in
	 * Threads as we can execute any class method using Thread without explicitly
	 * implementing Runnable interface
	 */

	ExecuteMain() {

	}

	ExecuteMain(String str) {
		System.out.println("in constructor: " + str);
	}

	public static void useStaticPrint(String str) {
		// can be called by main method
		// if static is not used then it cannot be called by static method
		System.out.println("in static method: " + str);
	}

	public void useInstancePrint(String str) {
		// can be called by main method
		// if static is not used then it cannot be called by static method
		System.out.println("in instance method: " + str);
	}

	public static void main(String[] args) {

		// Through Lambda
		SampleFunctionalInterface sfi = (str) -> {
			System.out.println(str);
		};
		sfi.print("Test");

		// Through method reference
		SampleFunctionalInterface sfi2 = ExecuteMain::useStaticPrint;
		sfi2.print("Test static method reference");

		ExecuteMain exec = new ExecuteMain();
		SampleFunctionalInterface sfi3 = exec::useInstancePrint;
		sfi3.print("Test instance method reference");

		SampleFunctionalInterface sfi4 = ExecuteMain::new;
		sfi4.print("Test constructor reference");
	}

}
