package com.demo.Test;
import com.demo.Arrays.*;
import java.util.*;

public class TestMy2DArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		My2DArray ob1 = new My2DArray();
		My2DArray ob2 = new My2DArray();
		
		int ch;
		
		do {
			System.out.println("1 : AcceptData\n2 : Display Data \n3 : Addition"
					+ "\n4 : Substraction\n5 : Transpose Matrix\n6 : find Sum Rowise"
					+ "\n7 : find Sum ColumnWise");
			System.out.println("Enter the Choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
				
				case 1 ->{
					
					ob1.acceptData();
				}
				
				case 2 ->{
					System.out.println("The matrix is : ");
					ob1.displayData();
				}
				
				case 3 ->{
					System.out.println("Enter the First matrix : ");
					ob1.acceptData();
					System.out.println("Enter the Secound matrix : ");
					ob2.acceptData();
					System.out.println("First matrix : ");
					ob1.displayData();
					System.out.println("First matrix : ");
					ob2.displayData();
					int crr[][] = ob1.addition(ob2);
					ob1.displayMatrix(crr);
					
				}
				case 4 ->{
					System.out.println("Enter the First matrix : ");
					ob1.acceptData();
					System.out.println("Enter the Secound matrix : ");
					ob2.acceptData();
					System.out.println("First matrix : ");
					ob1.displayData();
					System.out.println("First matrix : ");
					ob2.displayData();
					int crr[][] = ob1.substration(ob2);
					ob1.displayMatrix(crr);
					
				}
				
				case 5 ->{
					System.out.println("Enter the matrix : ");
					ob1.acceptData();
					System.out.println("Original matrix : ");
					ob1.displayData();
					int[][] trr = ob1.tranpose();
					ob1.displayMatrix(trr);
					
				}
				
				case 6 ->{
					int [] a = ob1.sumRowWise();
					for(int i = 0;i<a.length;i++) {
						System.out.println(a[i]);
					}
						
				}
				
				case 7 ->{
					int [] a = ob1.sumColWise();
					for(int i = 0;i<a.length;i++) {
						System.out.println(a[i]);
					}
						
				}
			}
			
			
		}while(ch!=8);

	}

}
