package com.demo.dao;

import java.util.*;
import com.demo.beans.Course;

public interface CourseDao {
	void addCourse(Course c);
	Map<String, Course> getAll();
	Course findByName(String name);
	List<Course> findByCapacity(int cap);
	void modifyCourseName(String oldName, String newName);
	Map<String, Course> displaySortedByKey();
	Map<String, Course> displaySortedByValue();
	void deleteByName(String name);
	void deleteByCapacity(int cap);
}
