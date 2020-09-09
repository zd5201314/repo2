package com.zd.exception;

public class Test {
	
	public static void main(String[] args) {
		People p=new People();
		try {
			p.setAge(200);
		} catch (AgeBoundsException e) {
			e.printStackTrace();
		}
	}
}
