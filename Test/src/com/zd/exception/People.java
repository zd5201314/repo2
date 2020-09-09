package com.zd.exception;

public class People {
	
	private int age;
	
	public void setAge(int age) throws AgeBoundsException {
		if(age>100|age<0) {
			AgeBoundsException ex=new AgeBoundsException();
			throw ex;
		}else {
			this.age=age;
		}
	}
}
