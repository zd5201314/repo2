package com.zd.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestIO {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\zd\\Desktop/test.txt");
		try {
			InputStream is = new FileInputStream(file);
			OutputStream os=new FileOutputStream(new File("C:\\Users\\zd\\Desktop/test2.txt"));
			int a=0;
			byte[] b=new byte[2];
			while (( a=is.read() )!= -1) {
				os.write(a);
			}
			os.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
