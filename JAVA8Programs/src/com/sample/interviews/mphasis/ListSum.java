package com.sample.interviews.mphasis;

import java.util.Arrays;
import java.util.List;

public class ListSum {

	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);

		int sum = 0;
		for (int num : input) {
			if (num > 3) {
				sum += (num * 2);
			}
		}
		System.out.println(sum);
	}

}
