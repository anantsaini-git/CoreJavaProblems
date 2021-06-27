package com.sample.interviews.tsys;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		

	List<String> inputList = Arrays.asList("hello", "bad", "world", "bad");
	
	List<String> outputList = inputList.stream().filter(removeBadWord("bad")).
		map(word -> word.toUpperCase())
		.collect(Collectors.toList());

	System.out.println(outputList);
	}
	
	public static Predicate<String> removeBadWord(String s) {
		return (newString -> !(newString.equals(s)));
	}

}
