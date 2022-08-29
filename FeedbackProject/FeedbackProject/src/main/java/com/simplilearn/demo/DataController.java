package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {
	
	@Autowired
	UserDataRepo repo;
	
	@RequestMapping("/saveData")
	@ResponseBody
	public String saveData(UserData userData)
	{
		repo.save(userData);
		return "Data inserted Successfully";
	}
}
