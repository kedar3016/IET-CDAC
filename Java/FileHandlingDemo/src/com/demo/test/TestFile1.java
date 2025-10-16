package com.demo.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestFile1 {

	public static void main(String[] args) {
		File f = new File("mycopyfile.txt");
		FileOutputStream fos = null;
		
		try {
			if(f.exists()) {
				fos = new FileOutputStream("mycopyfile.txt",true);
			}
			else {
				fos = new FileOutputStream("mycopyfile.txt");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("myfile.txt");
		FileOutputStream fos1 = fos;){
			int i = fis.read();
			while(i != -1) {
				fos1.write(i);
				i = fis.read();
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
