package com.check.number;

public class PrimeTestExample {

	public static void main(String[] args) {
		PrimeTestExample primeTestExample = new PrimeTestExample();
		
		int number = 11;
		if(primeTestExample.isPrimeNumber(number)) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}

	public boolean isPrimeNumber(int number) {
		if(number < 2) {
			// all negative numbers, 0 & 1 are not prime numbers
			return false;
		} else {
			for(int i = 2; i < number/2; i++) {
				if(number % i == 0) {
					// number divisible by i
					return false;
				}
			}
		}
		return true;
	}
}
