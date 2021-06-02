package com.practise.functionalinterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
/*
 * BiConsumer Interface accepts two input arguments and does not return any result. 
 * This is the two-arity specialization of Consumer interface. 
 * It provides a functional method accept(Object, Object) to perform custom operations.
 * 
 * Map.forEach
* In the JDK source code, Map.forEach accepts a BiConsumer as an argument.
 */

public class BiConsumerInterfaceExample {
	static void ShowDetails(String name, Integer age) {
		System.out.println(name + " " + age);
	}

	// Higher Order Function
	// This example accepts BiConsumer as an argument, create a generic addTwo to
	// join two objects.
	static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
		c.accept(a1, a2);
	}

	public static void main(String[] args) {
		// Referring method
		System.out.println("Using method reference");
		BiConsumer<String, Integer> biCon = BiConsumerInterfaceExample::ShowDetails;
		biCon.accept("Rama", 20);
		biCon.accept("Shyam", 25);
		System.out.println("===========================");

		// Using lambda expression
		System.out.println("Using lambda expression");
		BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);
		biCon2.accept("Peter", 28);
		System.out.println("===========================");

		// Higher Order Function
		System.out.println("Using Higher Order Function");
		addTwo(1, 2, (x, y) -> System.out.println("sum: " + (x + y)));
		addTwo("a", "b", (x, y) -> System.out.println("concat: " + x + y));
		System.out.println("===========================");

		// Map
		System.out.println("Map using BiConsumer");
		Map<Integer, String> map = new LinkedHashMap<>();

		map.put(1, "Java");
		map.put(2, "C++");
		map.put(3, "Rust");
		map.put(4, "JavaScript");
		map.put(5, "Go");

		map.forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println("===========================");
	}
}