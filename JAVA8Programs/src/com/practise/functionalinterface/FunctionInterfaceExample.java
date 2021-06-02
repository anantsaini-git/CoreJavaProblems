package com.practise.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/*
 * It is a functional interface. 
 * It is used to refer method by specifying type of parameter. 
 * It returns a result back to the referred function.
 */

public class FunctionInterfaceExample {
	static void ShowDetails(String name) {
		System.out.println("Hello: " + name);
	}

	// Higher Order Function
	// This example accepts Consumer as an argument, create a generic updateOne to
	// perform action on a single object
	static <T> void updateOne(T a1, Consumer<T> c) {
		c.accept(a1);
	}

	static void addList(List<Integer> list) {
		// Return sum of list values
		int result = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of list values: " + result);
	}

	public static void main(String[] args) {
		// Referring method
		System.out.println("Using method reference");
		Consumer<String> con = FunctionInterfaceExample::ShowDetails;
		con.accept("Rama");
		con.accept("Shyam");
		System.out.println("===========================");

		// Using lambda expression
		System.out.println("Using lambda expression");
		Consumer<String> biCon2 = (name) -> System.out.println(name);
		biCon2.accept("Peter");
		System.out.println("===========================");

		// Higher Order Function
		System.out.println("Using Higher Order Function");
		updateOne(1, x -> System.out.println("sum: " + x));
		updateOne("a", x -> System.out.println("concat: " + x));
		System.out.println("===========================");

		// Creating a list and adding values
		System.out.println("Using list with Consumer");
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		// Referring method to String type Consumer interface   
		Consumer<List<Integer>> consumer = FunctionInterfaceExample::addList;
		consumer.accept(list); // Calling Consumer method
		System.out.println("===========================");

	}
}