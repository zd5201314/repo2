package com.zd.thread;

/**
 * @author zd
 * ʵ���̵߳ĵ�һ�ַ������̳�Thread��
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
