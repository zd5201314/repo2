package com.zd.thread;

public class SecondThread implements Runnable {
	
	public String name;

	public SecondThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name+"->"+i);
		}
	}

}
