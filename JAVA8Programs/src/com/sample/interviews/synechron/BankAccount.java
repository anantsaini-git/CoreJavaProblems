package com.sample.interviews.synechron;

/*
 Create a BankAccount class with a member named "amount".
Start one thread which will deposit some random amount (in the range 10-50).
Start another thread which will withdraw some random amount (in the range 10-50).
Correct messages should be printed if the bank balance is low.
Make the threads sleep for 100-1000 milli seconds.
Run loop for 5 times, so 5 deposits should happen and 5 withdrawl attempts should happen.
Sample Logs:
T1: deposited 20, balance is 20
T2: withdrawn 15, balance is 5
T2: withdrawing 7, Low Balance error, balance is 5.
T2: withdrawn 3, balance is 2
T1 deposited 45, balance is 47

new Random().nextInt(50) can be used to get a random number in range 0-50.



T1: deposited 49, balance is 49
T2: withdrawing 34, Low Balance error, balance is: 49
T1: deposited 16, balance is 65
T2: withdrawn 26, balance is 39
T1: deposited 4, balance is 29
T2: withdrawn 10, balance is 29
T1: deposited 46, balance is 75
T2: withdrawn 8, balance is 67
T2: withdrawn 47, balance is 28
T1: deposited 8, balance is 28

  
 */
public class BankAccount {
	int amount = 0;

	public synchronized void deposit(int amount) {
		this.amount = this.amount + amount;

		System.out.println("T1: deposited " + amount + ", balance is " + this.amount);
		notify();
	}

	public synchronized void withdraw(int amount) {

		if (this.amount < amount) {
			System.out.println("T2: withdrawing " + amount + ", Low Balance error, balance is: " + this.amount);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			this.amount = this.amount - amount;
			System.out.println("T2: withdrawn " + amount + ", balance is " + this.amount);
		}

		
	}
}
