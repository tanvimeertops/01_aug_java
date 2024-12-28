package com.thread;
/*
 * Thread :it is a process
 * single thread: 
 * multi thread:multi processing
 * main is a thread
 * thread life cycle
 * Newborn
 * Runnable
 * Running
 * block
 * dead
 * 
 * by class
 *   extends Thread class
 * by interface
 *   implements Runnable
 */

class FirstThread extends Thread{
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("This is First Thread...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
public static void main(String[] args) throws InterruptedException {
	FirstThread ft=new FirstThread();
	ft.start();
	
	for (int i = 1; i <=5; i++) {
		System.out.println("This is Main Thread...");
		Thread.sleep(2000);
	}
	
}
}
