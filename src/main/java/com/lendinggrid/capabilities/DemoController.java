package com.lendinggrid.capabilities;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendinggrid.capabilities.dao.TeamDao;
import com.lendinggrid.capabilities.domain.Team;

@RestController
public class DemoController {

	@Autowired
	TeamDao teamDao;
		
	@RequestMapping("/hiThere")
	public List<Team> hello(Map map) {
		//map.put("name", "Aditya");
		return teamDao.findAll();
		 
	}
	
}
