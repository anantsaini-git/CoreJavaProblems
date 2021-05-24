package com.practise.functionalinterface;

@FunctionalInterface
public interface SampleFunctionalInterface {
// It can have only one abstract method
	abstract void print(String str);

	// A functional interface can have methods of object class.
	int hashCode();

	// using @Override is optional
	boolean equals(Object obj);
	
	//A functional interface can extend another interface only when it does not have any abstract method.
}
