package com.practise.threads;

public class ThreadsLambda {

	public static void main(String[] args) {
		// Normal way
		Runnable t4 = new Thread4();
		Thread threadRunner = new Thread(t4);
		threadRunner.start();

		// direct interface implementation
		Runnable t3 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread 3: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread threadRunner3 = new Thread(t3);
		threadRunner3.start();

		// Using lambda expression
		Runnable t5 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread 5: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread threadRunner5 = new Thread(t5);
		threadRunner5.start();

		// Direct usage of lambda
		Thread threadRunner6 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread 6: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		threadRunner6.start();
	}

}

class Thread4 implements Runnable {
	int i = 0;

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 4: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
