package com.springrest.springrest.MyController;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Jobs;
import com.springrest.springrest.services.jobServices;

@RestController
public class Controller {
@Autowired
private jobServices service;
	
@GetMapping("/home")
public String home()
{
	return "welcome";
}
@GetMapping("/Jobs")
public List<Jobs> getJobs()
{
	List<Jobs>p=this.service.getJobs();
	Collections.reverse(p);
	return p;
}

}
