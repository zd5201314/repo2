package com.zd.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * »ù´¡Á÷
 * @author zd
 *
 */
public class Demo03 {
	
	public static void main(String[] args) {
		
		File file=new File(Demo03.class.getResource("/lib/springmvc.txt").getFile());
		try {
			Reader re=new FileReader(file);
			char[] c=new char[1024];
			//char[] c=null;
			int count=0;
			while(true) {
				count=re.read(c);
				System.out.println(new String(c,0,count));
				if(count<1024) {
					break;
				}
			}
			re.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
