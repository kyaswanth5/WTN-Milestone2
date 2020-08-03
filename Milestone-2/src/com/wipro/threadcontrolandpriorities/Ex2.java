package com.wipro.threadcontrolandpriorities;

public class Ex2 implements Runnable{
	static Thread oddThread;
	static Thread evenThread;public static void main(String[] args) {
	Ex2 ex2 = new Ex2();

	oddThread = new Thread(ex2, "OddThread");
	evenThread = new Thread(ex2, "EvenThread");

	oddThread.start();
	evenThread.start();
	}
	@Override
	public void run() {
	try {
	if (Thread.currentThread().getName().equals("OddThread"))
	evenThread.join();
	} catch (InterruptedException e) {
	e.printStackTrace();
	}

	for (int i = 1; i <= 20; i++) {
	if (Thread.currentThread().getName().equals("EvenThread")) {
	if (i % 2 == 0) System.out.println(i);
	}

	if (Thread.currentThread().getName().equals("OddThread")) {
	if (i % 2 == 1) System.out.println(i);
	}
	}
	}
}
