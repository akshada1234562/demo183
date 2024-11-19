package com.cjc.crud.serviceI;

import java.util.List;

import com.cjc.crud.model.Student;

public interface HomeService 
{
	public void saveData(Student s);
	
	public List<Student> logincheck(String uname,String pass);
}
