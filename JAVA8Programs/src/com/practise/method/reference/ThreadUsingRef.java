package com.practise.method.reference;

public class ThreadUsingRef {

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

	// must be static to run from static main()
	public static void runUsingThread() {
		System.out.println("in runUsingThread ");
	}
	
	public void runInseMethodUsingThread() {
		System.out.println("in runInseMethodUsingThread ");
	}

	public static void main(String[] args) {

		Thread t = new Thread(ThreadUsingRef::runUsingThread);
		t.start();
		
		// using instance method
		ThreadUsingRef ref = new ThreadUsingRef();
		Thread t2 = new Thread(ref::runInseMethodUsingThread);
		t2.start();

	}

}
