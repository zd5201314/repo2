package com.zd.thread;

/**
 * @author zd
 * 实现线程的第一种方法，继承Thread类
 */
public class MyThread extends Thread {
	
	public String name;
	
	public MyThread(String name) {
		super();
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name+"->"+i);
		}
	}
}
