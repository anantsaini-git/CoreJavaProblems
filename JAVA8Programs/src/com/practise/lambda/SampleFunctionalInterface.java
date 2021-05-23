package com.practise.lambda;

@FunctionalInterface
public interface SampleFunctionalInterface {
	
	abstract void absMethod() throws Exception;
	
	default void defMethod() {
		System.out.println("Default method");
	}
	
	static void staticMethod() {
		System.out.println("Static method");
	}
}