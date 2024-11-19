package com.cjc.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.crud.model.Student;
import com.cjc.crud.serviceI.HomeService;

@Controller
public class HomeController 
{
	
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	
	@RequestMapping("/reg")
	public String prereg()
	{
		return "register";
	}
	
	@RequestMapping("/regData")
    public String registerdata(@ModelAttribute Student s)
	{
		
		System.out.println("Reg page");
		hs.saveData(s);
		return "login";
	}

	@RequestMapping("/log")
	public String loginCheck(@RequestParam ("uname")String un ,@RequestParam ("Pass")String ps,Model m)
    {
	List<Student> al=hs.logincheck(un,ps);
	
	System.out.println(al);
	m.addAttribute("data",al);
			
			return "success";
}
	
	

}
