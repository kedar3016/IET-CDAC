package com.demo.Test;
import com.demo.bean.*;

import java.io.*;
import java.util.*;

public class TestReadCSV {

	public static void main(String[] args) {
		List<Employee> lst = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("empData.txt"));){
			String line = br.readLine();
			while(line != null) {
				String arr [] = line.split(",");
				
				Employee e = new Employee();
				e.seteId(Integer.parseInt(arr[0]));
				e.seteName(arr[1]);
				e.setDesg(arr[2]);
				e.setSal(Double.parseDouble(arr[3]));
				lst.add(e);
				line = br.readLine();
				
			}
			
			lst.forEach(System.out::println);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		lst.add(new Employee(34,"xxxx","admin",45678));
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("empData.txt"));){
			for(Employee e : lst) {
				String str = e.geteId()+","+e.geteName()+","+e.getDesg()+","+e.getSal();
				bw.write(str);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
