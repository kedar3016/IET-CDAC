package com.demo.service;

import java.util.List;

import com.demo.beans.Project;

public interface ProjectService {

	boolean addNewProject();

	List<Project> displayAllProject();

	boolean updateByPid(int pid, String pname);

	boolean deleteByPid(int pid);

}
