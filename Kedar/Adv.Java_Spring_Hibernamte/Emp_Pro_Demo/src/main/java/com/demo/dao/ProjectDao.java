package com.demo.dao;

import java.util.Set;

import com.demo.beans.Project;

public interface ProjectDao {

	Set<Project> findByPid(String parr[]);

	boolean save(Project p);

}
