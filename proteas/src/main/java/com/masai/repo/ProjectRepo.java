package com.masai.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.ProjectModel;

@Repository
public interface ProjectRepo extends JpaRepository<ProjectModel,Integer> {
	
	public List<ProjectModel> findByCategory(String Category);
	

}
