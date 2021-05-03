package com.check.number;

public class ExecuteProgram {

	public static void main(String[] args) {
		PrimeTestExample primeTestExample = new PrimeTestExample();

		int numbers[] = {10, 11, 7, 9};
		
		for(int number: numbers) {
			if (primeTestExample.isPrimeNumber(number)) {
				System.out.println(number + " is a prime number");
			} else {
				System.out.println(number + " is not a prime number");
			}
		}
	}
}