package com.demo.test;
import java.util.*;

import com.demo.beans.Employee;
import com.demo.service.*;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		EmployeeService eservice = new EmployeeServiceImpl();
		do {
			System.out.println("1. add new employee\n 2. display all\n3. search by id");
			System.out.println("4. Search by name\n 5. update sal\n6. delete by id\n7. delete by salary\n");
			System.out.println("8. search by salary \n 9. sort by salary\n10. Sort By name\n 11. Sort By id\n12. exit\n choice: ");
			ch=sc.nextInt();
			switch(ch) {
			
			
//-----------------------------------------------------------------------------------------------
			
			case 1 ->{
				boolean status = eservice.addNewEmp();
				if(status) {
					System.out.println("Employee Added Sucessfully");
				}else {
					System.out.println("Error ! Try Again");
				}	
			}
			
//----------------------------------------------------------------------------------------------------
			
			case 2 ->{
				Set <Employee> e = eservice.displayAll();
				e.forEach(System.out::println);	
			}
		
//----------------------------------------------------------------------------------------------------
			
			case 3 ->{
				System.out.println("Enter emp Id");
				int id= sc.nextInt();
				Employee e = eservice.findById(id);
				if(e!= null) {
					System.out.println(e);
				}else {
					System.out.println("Not Found");
				}
			}
			
//----------------------------------------------------------------------------------------------------
			
			case 4 -> {
				System.out.println("Enter emp Name");
				String name= sc.next();
				List <Employee> e = eservice.findByName(name);
				if(e!= null) {
					e.forEach(System.out::println);
				}else {
					System.out.println("Not Found");
				}
			}
			
//---------------------------------------------------------------------------------------
			case 5 ->{
					System.out.println("Enter the Id : ");
					int id = sc.nextInt();
					System.out.println("Enter the Salary : ");
					double sal = sc.nextDouble();
					boolean flag = eservice.updateBySal(id,sal);
					if(flag) {
						System.out.println("Salary Updates Successfully !!!");
						
					}
					else {
						System.out.println("Not Found!!");
					}
					
					
				}
			
//--------------------------------------------------------------------------------------
			case 6->{
					System.out.println("Enter the Employee Id : ");
					int id = sc.nextInt();
					boolean flag = eservice.deleteById(id);
					if(flag) {
						System.out.println("Deleted Successfully !!!");
						
					}
					else {
						System.out.println("Not Found!!");
					}
			}
			
//---------------------------------------------------------------------------------------------------			
			
			case 7->{
				System.out.println("Enter the Salary : ");
				double sal = sc.nextDouble();
				boolean flag = eservice.deleteBySal(sal);
				if(flag) {
					System.out.println("Deleted Successfully !!!");
					
				}
				else {
					System.out.println("Not Found!!");
				}
				
			}
//-----------------------------------------------------------------------------------------------
			case 8 ->{
				System.out.println("Enter Emmployee Salary");
				double sal = sc.nextDouble();
				
				List <Employee> e2 = eservice.searchBySal(sal);
				if(e2 != null) {
					e2.forEach(System.out::println);
				}
			}
				
					
//---------------------------------------------------------------------------------------------------	
			case 9 ->{
				
			}
			
			
			
			
			
			
			
			
//---------------------------------------------------------------------------------------------------
			
			case 12 -> {
				System.out.println("Thank You For Visiting");
			}
			
		}
	}while(ch != 12);

			
		
}

}
