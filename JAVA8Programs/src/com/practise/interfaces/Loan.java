package com.practise.interfaces;

public interface Loan {
	default String getBankName() {
		return "Default Bank";
	}
}
