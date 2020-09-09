package com.zd.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.net.URL;

public class Demo2 {
	
	public static void main(String[] args){
		
		String path=Demo2.class.getResource("/lib/aaa.txt").getFile();
		System.out.println(path);
		File file=new File(path);
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
