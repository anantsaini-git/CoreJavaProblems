package com.practise.threads;

public class ThreadsBasic {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		Runnable t2 = new Thread2();
		Thread threadRunner = new Thread(t2);
		threadRunner.start();
	}

}


class Thread1 extends Thread{
	int i = 0;
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread 1: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 implements Runnable {
	int i = 0;
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread 2: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}