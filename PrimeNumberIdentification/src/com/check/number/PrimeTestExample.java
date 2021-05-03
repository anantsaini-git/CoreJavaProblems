package com.check.number;

public class PrimeTestExample {

	public boolean isPrimeNumber(int number) {
		if (number < 2) {
			// all negative numbers, 0 & 1 are not prime numbers
			return false;
		} else {
			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					// number divisible by i
					return false;
				}
			}
		}
		return true;
	}
}
