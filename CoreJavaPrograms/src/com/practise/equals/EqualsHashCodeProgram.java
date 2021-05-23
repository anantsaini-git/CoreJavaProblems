package com.practise.equals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// This program shows usage and implementation of 
// hashcode, equals, toString, TreeSet

// Observations:
// to use Object as key, we must implement hashcode and equals both
// only one will not suffice and will give null with get operation (Map)

// To use TReeSet for sorting of Object, object must implement Comparable interface
public class EqualsHashCodeProgram {

	public static void main(String[] args) {
		Map<Employee, String> employeeDeptMap = testHashMapWithObjAsKey();
		employeeDeptMap.forEach((k, v) -> System.out.println(k + ": " + v));

		// Getting Keys of map in set
		/*
		 * Set<Employee> empSet = employeeDeptMap.keySet(); empSet.forEach(e ->
		 * System.out.println(e));
		 * 
		 * testTreeSet(empSet);
		 */
	}

	private static void testTreeSet(Set<Employee> empSet) {
		// Below code will give exception if Employee does not implement Comparable\
		// even implementing Comparator won't work
		Set<Employee> empTreeSet = new TreeSet<Employee>();
		empTreeSet.addAll(empSet);
		empTreeSet.forEach(e -> System.out.println(e));
	}

	private static Map<Employee, String> testHashMapWithObjAsKey() {
		Map<Employee, String> employeeDeptMap = new HashMap<>();

		employeeDeptMap.put(new Employee("ID-1", "Emp1"), "IT");
		employeeDeptMap.put(new Employee("ID-2", "Emp2"), "Cleaner");
		employeeDeptMap.put(new Employee("ID-3", "Emp3"), "Security");

		Employee myEmp = new Employee("ID-2", "Emp3");

		System.out.println(employeeDeptMap.get(myEmp));
		// null if we don't override equals AND hashcode
		// null if we don't override equals OR hashcode
		// Security if we override equals AND hashcode

		// works fine if hashcode return value is hardcoded to 10
		// get and put both will give desired results
		// but all objects will be stored in one bucket only

		// works fine if hashcode return value is set to return random number
		// get and put both will give desired results
		// but all objects will be stored in different bucket only

		// if equals() always return false
		// put will work as usual (internally it will always store in different node if
		// hashcode matches)
		// get will never give result as it will not find any match
		// employeeDeptMap.get(myEmp) will be always null

		// if equals() always return true
		// put will work as usual (internally it will depend all on hashcode)
		// get will be dependent on hashcode implementation only
		// Employee myEmp = new Employee("ID-2", "Emp3");
		// employeeDeptMap.get(myEmp) will match based on name and return Security,
		// although the object should not match any item
		return employeeDeptMap;
	}
}