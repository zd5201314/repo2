package com.zd.demo;

import com.zd.thread.MyThread;
import com.zd.thread.SecondThread;

public class Demo {
	
	public static void main(String[] args) {
		
//		MyThread thread=new MyThread("A");
//		MyThread thread2=new MyThread("B");
//		MyThread thread3=new MyThread("C");
//		MyThread thread4=new MyThread("D");
//		
//		thread.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
		
		SecondThread se=new SecondThread("A");
		Thread thread1=new Thread(se);
		Thread thread2=new Thread(new SecondThread("B"));
		Thread thread3=new Thread(new SecondThread("C"));
		Thread thread4=new Thread(new SecondThread("D"));
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
