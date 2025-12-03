package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Project;

public interface ProjectDao {

	Set<Project> findByPid(String parr[]);

	boolean save(Project p);

	Project findByPid(int pid);

	List<Project> showAllProject();

	boolean modifyByPid(int pid, String pname);

	boolean removeByPid(int pid);

}
