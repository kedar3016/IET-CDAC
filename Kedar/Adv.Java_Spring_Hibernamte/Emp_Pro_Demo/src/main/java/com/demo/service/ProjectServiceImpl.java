package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.demo.beans.Project;
import com.demo.dao.*;

public class ProjectServiceImpl implements ProjectService{
	ProjectDao pdao = new ProjectDaoImpl();
	@Override
	public boolean addNewProject() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Project Id : ");
		int pid = sc.nextInt();
		
		System.out.println("Enter the Project Name : ");
		String pname = sc.next();
		
		System.out.println("Enter the Start Date : ");
		String dt = sc.next();
		
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Project p = new Project(pid,pname,ldt);
		
		
		return pdao.save(p);
	}

}
