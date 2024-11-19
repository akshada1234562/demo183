package com.cjc.crud.repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cjc.crud.model.Student;
import com.cjc.crud.repository.HomeRepository;
@Repository
public class HomeRepositoryImpl implements HomeRepository
{
	List<Student>al=new ArrayList<Student>();
	

	@Override
	public void saveData(Student s) 
	{
		al.add(s);
		
	}

	@Override
	public List<Student> logincheck(String uname, String pass) {
		for (Student student : al) 
		{
		
			if (uname.equalsIgnoreCase(student.getUname()) && pass.equalsIgnoreCase(student.getPass()))
			{
			
				return al;
			}
		}
		
		return null;
		
	}

}
