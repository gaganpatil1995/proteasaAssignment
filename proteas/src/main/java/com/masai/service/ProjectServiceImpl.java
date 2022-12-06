package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.NoProjectFound;
import com.masai.model.ProjectModel;
import com.masai.repo.ProjectRepo;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectRepo pr;

	@Override
	public List<String> findByCategory(String Category) throws NoProjectFound {
		
		List<String> ans=new ArrayList<>();
		
		List<ProjectModel> pp=pr.findByCategory(Category);
		    
		for(ProjectModel d:pp) {
			ans.add(d.getTitle());
		}
		
		if(ans.size()==0) {
			throw new NoProjectFound("No Project Found with this Category");
		}
		
		return ans;
		
	}

	@Override
	public ProjectModel saveProject(ProjectModel pm) {
		
		return pr.save(pm);
	}

	@Override
	public List<String> findByCategory2(String Category) throws NoProjectFound {
	List<String> ans=null;
		
		List<ProjectModel> pp=pr.findByCategory(Category);
		    
		for(ProjectModel d:pp) {
			ans.add(d.getDescription());
		}
		
		if(ans.size()==0) {
			throw new NoProjectFound("No Project Found with this Category");
		}
		
		return ans;
	}

}
