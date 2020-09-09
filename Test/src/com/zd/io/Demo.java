package com.zd.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Demo {
	
	public static void main(String[] args) {
		
		File file=new File("C:\\\\Users\\\\zd\\\\Desktop/test.txt");
		try {
			Reader re=new FileReader(file);
			int a=0;
			while((a=re.read())!=-1) {
				System.out.print((char)a);
			}
			re.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
