package com.demo.dao;

import java.util.*;
import com.demo.beans.Course;

public class CourseDaoImpl implements CourseDao {
	private static Map<String, Course> hm = new HashMap<>();

	@Override
	public void addCourse(Course c) {
		hm.put(c.getcName(), c);
	}

	@Override
	public Map<String, Course> getAll() {
		return hm;
	}

	@Override
	public Course findByName(String name) {
		return hm.get(name);
	}

	@Override
	public List<Course> findByCapacity(int cap) {
		List<Course> clist = new ArrayList<>();
		for (Course c : hm.values()) {
			if (c.getCapacity() == cap) {
				clist.add(c);
			}
		}
		return clist;
	}

	@Override
	public void modifyCourseName(String oldName, String newName) {
		Course c = hm.remove(oldName);
		if (c != null) {
			c.setcName(newName);
			hm.put(newName, c);
		}
	}

	@Override
	public Map<String, Course> displaySortedByKey() {
		return new TreeMap<>(hm);
	}

	@Override
	public Map<String, Course> displaySortedByValue() {
		List<Map.Entry<String, Course>> list = new ArrayList<>(hm.entrySet());
		list.sort(Map.Entry.comparingByValue(Comparator.comparing(Course::getCapacity)));
		Map<String, Course> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Course> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	@Override
	public void deleteByName(String name) {
		hm.remove(name);
	}

	@Override
	public void deleteByCapacity(int cap) {
		hm.entrySet().removeIf(entry -> entry.getValue().getCapacity() == cap);
	}
}
