package com.zd.store;

public class Demo {
	
	public static void main(String[] args) {
		Store store=new Store();
//		Thread thread1=new Thread(new Shop("A", store));
//		Thread thread2=new Thread(new Shop("B", store));
//		Thread thread3=new Thread(new Shop("C", store));
//		Thread thread4=new Thread(new Shop("D", store));
//		
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
		
		Thread thread=new Thread(new Product(store));
		Thread thread2=new Thread(new Reduce(store));
		
		thread.start();
		thread2.start();
		
	}
}
