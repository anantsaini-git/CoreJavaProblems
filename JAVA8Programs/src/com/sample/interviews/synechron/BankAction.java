package com.sample.interviews.synechron;

import java.util.Random;

public class BankAction {

	public static void main(String[] args) {
		BankAction bankAction = new BankAction();
		bankAction.threadRun();
	}

	public void threadRun() {
		BankAccount account = new BankAccount();

		// initial amount

		Runnable depositThread = () -> {
			for(int i = 0; i < 5; i++) {
				account.deposit(new Random().nextInt(50));

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable withdrawThread = () -> {
			for(int i = 0; i < 5; i++) {
				account.withdraw(new Random().nextInt(50) );
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(depositThread);
		Thread t2 = new Thread(withdrawThread);

		t1.start();
		t2.start();

	}

}
