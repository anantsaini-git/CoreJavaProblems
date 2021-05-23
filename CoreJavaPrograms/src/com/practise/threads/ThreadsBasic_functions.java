package com.practise.threads;

public class ThreadsBasic_functions {

	public static void main(String[] args) {

		// normalFlow();
		joinFlow();
	}

	private static void normalFlow() {
		System.out.println("Normal flow");
		System.out.println("=============");
		Thread t1 = new ThreadHi();

		Runnable t2 = new ThreadHello();
		Thread threadRunner = new Thread(t2);

		t1.start();
		threadRunner.start();

		System.out.println("Bye");
	}

	private static void joinFlow() {
		System.out.println("Join flow");
		System.out.println("=============");
		Thread t1 = new ThreadHi();

		Runnable t2 = new ThreadHello();
		Thread threadRunner = new Thread(t2);

		t1.start();
		threadRunner.start();

		System.out.println("Thread alive status: " + t1.isAlive());
		try {
			t1.join();
			threadRunner.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thread alive status: " + t1.isAlive());
		// will print only after threads execution
		System.out.println("Bye");
	}

}

class ThreadHi extends Thread {
	int i = 0;

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Hi: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadHello implements Runnable {
	int i = 0;

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Hello: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}