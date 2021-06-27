package com.hackerrank.practise;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'sockMerchant' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER_ARRAY ar
	 */

	public static int sockMerchant(int n, List<Integer> ar) {
		// Write your code here
		Collections.sort(ar);
		System.out.println(ar);
		int totalPair = 0;
		int sockPair = 0;
		int sockCounter = 0;

		for (int i : ar) {
			System.out.println(i);
			if (sockCounter != 0) {
				if (ar.get(sockCounter - 1) != i) {
					totalPair = totalPair + sockPair / 2;
					System.out.println("totalPair " + totalPair);
					sockPair = 0;
				}
			}
			sockPair++;

			sockCounter++;

		}
		totalPair = totalPair + sockPair / 2;
		System.out.println("totalPair " + totalPair);
		return totalPair;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = Result.sockMerchant(n, ar);

		System.out.println("result: " + result);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		bufferedReader.close();
		// bufferedWriter.close();
	}
}

//Problem
/*
 * There is a large pile of socks that must be paired by color. Given an array
 * of integers representing the color of each sock, determine how many pairs of
 * socks with matching colors there are.
 * 
 * Example
 * 
 * 
 * There is one pair of color and one of color . There are three odd socks left,
 * one of each color. The number of pairs is .
 * 
 * Function Description
 * 
 * Complete the sockMerchant function in the editor below.
 * 
 * sockMerchant has the following parameter(s):
 * 
 * int n: the number of socks in the pile int ar[n]: the colors of each sock
 * Returns
 * 
 * int: the number of pairs Input Format
 * 
 * The first line contains an integer , the number of socks represented in . The
 * second line contains space-separated integers, , the colors of the socks in
 * the pile.
 * 
 * Constraints
 * 
 * where Sample Input
 * 
 * STDIN Function ----- -------- 9 n = 9 10 20 20 10 10 30 50 10 20 ar = [10,
 * 20, 20, 10, 10, 30, 50, 10, 20] Sample Output
 * 
 * 3 Explanation
 * 
 * There are three pairs of socks.
 * 
 */