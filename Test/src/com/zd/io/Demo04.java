package com.zd.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * ¸ß²ãÁ÷
 * @author zd
 *
 */
public class Demo04 {

		public static void main(String[] args) {
			File file=new File(Demo04.class.getResource("/lib/springmvc.txt").getFile());
			File file2=new File("C:\\Users\\zd\\Desktop/test.txt");
			try {
				Reader re=new FileReader(file);
				Writer wr=new FileWriter(file2,true);
				BufferedReader br=new BufferedReader(re);
				BufferedWriter bw=new BufferedWriter(wr);
				String s=null;
				while((s=br.readLine())!=null) {
					bw.write(s+"\r\n");
				}
				br.close();
				re.close();
				bw.close();
				wr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
}
