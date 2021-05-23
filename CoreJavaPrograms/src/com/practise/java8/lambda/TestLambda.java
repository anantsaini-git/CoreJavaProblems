package com.practise.java8.lambda;

public class TestLambda {

	public static void main(String[] args) {

		SampleFunctionalInterface sfi = () -> {
			System.out.println("Inside interface");
			// cannot throw checked exceptions inside functional interface directly
			// if we have to throw checked exception then we will have to use throws
			// "checked exception" in functional interface. Ex: 
			// in SampleFunctionalInterface: abstract void absMethod() throws Exception;
			
			// this follows rule of method overriding-exception handling (try with SQLException)
			throw new Exception("checked Exception");
			// below code working
			// throw new RuntimeException("Run time exception");
		};

		try {
			sfi.absMethod();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}