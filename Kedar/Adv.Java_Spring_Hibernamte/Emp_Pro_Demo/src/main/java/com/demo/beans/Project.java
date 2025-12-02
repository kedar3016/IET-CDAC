package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="pro")

public class Project {
	@Id
	private int pid;
	private String pname;
	private LocalDate StartDate;
	@ManyToMany(mappedBy = "pset", cascade= CascadeType.ALL)
	Set<Employee> eset;
	public Project() {
		super();
	}
	public Project(int pid, String pname, LocalDate startDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		StartDate = startDate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public LocalDate getStartDate() {
		return StartDate;
	}
	public void setStartDate(LocalDate startDate) {
		StartDate = startDate;
	}
	public Set<Employee> getEset() {
		return eset;
	}
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", StartDate=" + StartDate + "]";
	}

	

}
