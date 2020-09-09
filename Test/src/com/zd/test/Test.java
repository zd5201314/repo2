package com.zd.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
//		String[] s=new String[10];
//		String a="test good";
//		char[] c={'a','b','c'};
//		
//		System.out.println(a+""+c);
//		float a=0.17f;
//		float b=2.87f;
//		float c=3.04f;
//		
//		System.out.println(a+b==c);
		long lo=System.currentTimeMillis();
		Date date=new Date(lo);
		SimpleDateFormat sd=new SimpleDateFormat("yyy-MM-dd");
		System.out.println(sd.format(date));
		
	}
}
