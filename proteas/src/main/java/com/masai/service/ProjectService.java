package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.exception.NoProjectFound;
import com.masai.model.ProjectModel;

@Service
public interface ProjectService {
	
	public List<String> findByCategory(String Category) throws NoProjectFound ;
	
	public List<String> findByCategory2(String Category) throws NoProjectFound ;
	
	public ProjectModel saveProject(ProjectModel pm);

}
