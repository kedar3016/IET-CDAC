package com.demo.test;

import java.io.*;

public class BufferedStream {

	public static void main(String[] args) {

		File f = new File("democopy.txt");
		BufferedOutputStream bos = null;
		
		try {
			if(f.exists()) {
				bos = new BufferedOutputStream(new FileOutputStream("democopy.txt",true));
			}
			else {
				bos = new BufferedOutputStream(new FileOutputStream("democopy.txt"));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("demo.txt"));
				BufferedOutputStream bos1 = bos;){
				
			
				int i = bis.read();
				while(i != -1) {
					bos1.write(i);
					i = bis.read();
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
