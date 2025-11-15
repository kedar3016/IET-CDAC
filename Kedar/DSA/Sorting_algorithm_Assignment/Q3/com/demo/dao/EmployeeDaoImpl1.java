package com.demo.dao;

import com.demo.bean.Employee;

public class EmployeeDaoImpl1 implements EmployeeDao1{
	Employee emp[] = new Employee[10];
	static int cnt = 8;
	public EmployeeDaoImpl1(){
		emp[0] = new Employee(1,"Kedar",45000);
		emp[1] = new Employee(2,"Krishna",50000);
		emp[2] = new Employee(3,"Mayur",80000);
		emp[3] = new Employee(4,"Pratik",45000);
		emp[4] = new Employee(5,"aditya",85000);
		emp[5] = new Employee(6,"Amit",45500);
		emp[6] = new Employee(7,"Mahesh",65000);
		emp[7] = new Employee(8,"Mbahesh",665000);
		 
	}
	

	public void quickSort(Employee emp[],int start,int end) {
			if(start<end) {
				
				int p = partition(emp,start,end);
				
				quickSort(emp,start,p);
				quickSort(emp,p+1,end);
				
			}
		}

	private int partition(Employee[] arr, int start, int end) {

			int pivot = start;
			int i = start;
			int j = end;
			
			while(i < j) {
				while(i < end && arr[i].getEname().compareTo(arr[pivot].getEname()) <= 0) {
					i++;
				}
				while(j > start && arr[j].getEname().compareTo(arr[pivot].getEname()) > 0) {
					j--;
				
				}
				
				if(i<j) {
					swap(arr,i,j);
				}
				if(pivot != j) {
					swap(arr,pivot,j);
				}
			}

			return j;
		}

		private void swap(Employee [] arr, int i, int j) {
				Employee temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			
		}
		@Override
		public void qSort() {
			quickSort(emp,0,emp.length-1);
			
		}


		@Override
		public void showAll() {
			System.out.println(emp.toString());
			
		}
		
		
	
}
