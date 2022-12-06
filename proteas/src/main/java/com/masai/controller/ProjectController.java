package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.NoProjectFound;
import com.masai.model.ProjectModel;
import com.masai.service.ProjectServiceImpl;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectServiceImpl ps;
	
	
	@GetMapping("/gettitle/{category}")
	public ResponseEntity<List<String>> GetTitleListHandler(@PathVariable String category) throws NoProjectFound{
		List<String> ans=ps.findByCategory(category);
		
		return new ResponseEntity<List<String>>(ans,HttpStatus.ACCEPTED);
		
		
	}
	
	@GetMapping("/getDescreption/{category}")
	public ResponseEntity<List<String>> GetDescriptionListHandler(@PathVariable String category) throws NoProjectFound{
		List<String> ans=ps.findByCategory2(category);
		
		return new ResponseEntity<List<String>>(ans,HttpStatus.ACCEPTED);
		
		
	}
	
	@PostMapping("/SaveProject")
	public ResponseEntity<ProjectModel> SaveProjectModelHandler(@RequestBody ProjectModel pm){
		
		return new ResponseEntity<ProjectModel>(ps.saveProject(pm),HttpStatus.CREATED);
	}

}
