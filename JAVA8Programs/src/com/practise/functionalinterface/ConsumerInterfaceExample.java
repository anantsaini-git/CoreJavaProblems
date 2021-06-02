package com.practise.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/*
 * It is a functional interface defined in java.util.function package. 
 * It contains an abstract accept() and a default andThen() method. 
 * It can be used as the assignment target for a lambda expression or method reference.
 * The Consumer Interface accepts a single argument and does not return any result.
 */

public class ConsumerInterfaceExample {
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
		Consumer<String> con = ConsumerInterfaceExample::ShowDetails;
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
		Consumer<List<Integer>> consumer = ConsumerInterfaceExample::addList;
		consumer.accept(list); // Calling Consumer method
		System.out.println("===========================");

	}
}