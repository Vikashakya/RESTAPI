package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.jobsDao;
import com.springrest.springrest.entities.Jobs;
@Service
public class ImpService implements jobServices {
	@Autowired
	private jobsDao jobsdao;
    //List<Jobs> list;
    public ImpService()
    {
    	//list=new ArrayList<>();
    	//list.add(new Jobs("Software Engineer","Jio","http","2023","hello welcome"));
    }
	@Override
	public List<Jobs> getJobs() {
		
		return jobsdao.findAll();
	}

}
