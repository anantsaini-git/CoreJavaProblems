package com.practise.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachUse {
	int sum;

	public void sum(int i) {
		sum += i;
	}

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("A1", "A2", "A3", "A4", "A5", "A6");
		System.out.println("String list");
		stringList.forEach((a) -> System.out.println(a));

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("Integer list");
		integerList.forEach((i) -> System.out.println(i));

		List<Employee> empList = Arrays.asList(new Employee("ID1", "E1"), new Employee("ID2", "E2"),
				new Employee("ID3", "E3"));
		System.out.println("Employee list");
		empList.forEach((e) -> System.out.println(e.getId() + "::" + e.getName()));

		// operations on forEach
		// summing all elements of list
		ForEachUse f = new ForEachUse();
		integerList.forEach(i -> f.sum(i));
		System.out.println(f.sum);
	}

}

class Employee {
	String id;
	String name;

	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}