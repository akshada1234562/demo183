package com.cjc.crud.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.model.Student;
import com.cjc.crud.repository.HomeRepository;
import com.cjc.crud.serviceI.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Student s) 
	{
		
		hr.saveData(s);
	}

	@Override
	public List<Student> logincheck(String uname, String pass) {
		
		return hr.logincheck(uname,pass);
	}


	

}
