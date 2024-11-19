package com.cjc.crud.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.cjc.crud.model.Student;

@Repository
public interface HomeRepository
{
	public void saveData(Student s);
	

	public List<Student> logincheck(String uname,String pass);

}
