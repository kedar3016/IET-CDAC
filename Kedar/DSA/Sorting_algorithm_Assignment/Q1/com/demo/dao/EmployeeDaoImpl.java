package com.demo.dao;

import com.demo.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	Employee emp[] = new Employee[10];
	static int cnt = 8;
	public EmployeeDaoImpl(){
		emp[0] = new Employee(1,"Kedar",45000);
		emp[1] = new Employee(2,"Krishna",50000);
		emp[2] = new Employee(3,"Mayur",80000);
		emp[3] = new Employee(4,"Pratik",45000);
		emp[4] = new Employee(5,"aditya",85000);
		emp[5] = new Employee(6,"Amit",45500);
		emp[6] = new Employee(7,"Mahesh",65000);
		emp[7] = new Employee(8,"Mbahesh",665000);
		 
	}
	
	

	private void swap(Employee[] emp1, int i, int j) {
		
		Employee temp = emp[i];
		emp[i] = emp [j];
		emp[j] = temp;
		
		
	}
	

	@Override
	public void bubblesort() {
		for(int i = 0;i<cnt;i++){
			for(int j = 1;j<cnt-i;j++) {
				if(emp[j-1].getSal() > emp[j].getSal()) {
					swap(emp,j-1,j);
				}
			}
			
		}
		
	}



	@Override
	public void showData() {
		for(int i = 0;i<cnt;i++) {
			System.out.println(emp[i]);
		}
		
	}



	@Override
	public boolean insertEmp(Employee e) {
		emp[cnt] = e;
		cnt++;
		insertionSort();
		return true;
	}



	private void insertionSort() {
		for(int i = 1;i<cnt;i++) {
			
			 Employee key = emp[i];
			 int j = i -1;
			 
			 while(j >= 0 && emp[j].getSal()>key.getSal()) {
				 emp[j+1] = emp[j];
				 j--;
			 }
			 
			 emp[j+1]  = key;
			 
		}
		
	}
	
	


}
