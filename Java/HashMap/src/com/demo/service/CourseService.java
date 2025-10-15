package com.demo.service;

import java.util.*;
import com.demo.beans.Course;

public interface CourseService {
	void addNewCourse();
	Map<String, Course> displayAll();
	Course findByName(String name);
	List<Course> findByCapacity(int cap);
	void modifyCourseName(String oldName, String newName);
	Map<String, Course> displaySortedByKey();
	Map<String, Course> displaySortedByValue();
	void deleteByName(String name);
	void deleteByCapacity(int cap);
}
