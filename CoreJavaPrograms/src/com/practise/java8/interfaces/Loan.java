package com.practise.java8.interfaces;

public interface Loan {
	default String getBankName() {
		return "Default Bank";
	}
}
