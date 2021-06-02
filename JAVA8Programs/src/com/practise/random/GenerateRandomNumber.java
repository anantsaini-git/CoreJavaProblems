package com.practise.random;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		// generate 5 random numbers starting from 5

		Random r = new Random();
		r.longs(5, 1, 5).forEach(
				n -> System.out.println(n)
						);
		
	}

}
