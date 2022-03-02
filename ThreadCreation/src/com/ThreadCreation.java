package com;

public class ThreadCreation extends Thread implements Runnable {
	
	public void run(){  
		System.out.println("thread is running..");
		}  
	
	
	public static void main(String[] args) {
		
		System.out.println("using Thread class");
		ThreadCreation t1=new ThreadCreation(); 
		t1.setName("Akhil");
		System.out.println(t1);
		t1.start(); 
		
		System.out.println("using runnable interface");
		Thread t3=new Thread(t1);
		t3.setName("Abhi");
		t3.setPriority(MIN_PRIORITY);
		System.out.println(t3);
		t3.start();

	}

}