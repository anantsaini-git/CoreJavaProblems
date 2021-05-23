package com.practise.java8.interfaces;

public interface Bank {
	
	default String getBankName() {
		return "Default Bank";
	}
	
	static int getLoanAmount(int rate, String loanType) {
		if(loanType.equals("home")) {
			return 7 * rate;
		}
		return 10 * rate;
	}
}