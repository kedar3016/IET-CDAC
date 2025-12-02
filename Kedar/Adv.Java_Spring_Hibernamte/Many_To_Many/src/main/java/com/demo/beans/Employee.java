package com.demo.beans;
import java.time.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="emp4")
public class Employee {
	@Id
	private int eid;
	private String ename;
	private Double sal;
	private LocalDate hiredate;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")
	Set<Project> pset;
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, Double sal, LocalDate hiredate) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.hiredate = hiredate;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public Set<Project> getPset() {
		return pset;
	}
	public void setPset(Set<Project> pset) {
		this.pset = pset;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", hiredate=" + hiredate + "]";
	}
	
	
}
