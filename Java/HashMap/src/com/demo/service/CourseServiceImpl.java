
package com.demo.service;
import com.demo.dao.*;
import com.demo.beans.Course;
import java.util.*;

public class CourseServiceImpl implements CourseService {
	CourseDao cdao = new CourseDaoImpl();

	@Override
	public void addNewCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter course name:");
		String name = sc.next();
		System.out.println("Enter capacity:");
		int cap = sc.nextInt();
		Course c = new Course(name, cap);
		cdao.addCourse(c);
	}

	@Override
	public Map<String, Course> displayAll() {
		return cdao.getAll();
	}

	@Override
	public Course findByName(String name) {
		return cdao.findByName(name);
	}

	@Override
	public List<Course> findByCapacity(int cap) {
		return cdao.findByCapacity(cap);
	}

	@Override
	public void modifyCourseName(String oldName, String newName) {
		cdao.modifyCourseName(oldName, newName);
	}

	@Override
	public Map<String, Course> displaySortedByKey() {
		return cdao.displaySortedByKey();
	}

	@Override
	public Map<String, Course> displaySortedByValue() {
		return cdao.displaySortedByValue();
	}

	@Override
	public void deleteByName(String name) {
		cdao.deleteByName(name);
	}

	@Override
	public void deleteByCapacity(int cap) {
		cdao.deleteByCapacity(cap);
	}

}
