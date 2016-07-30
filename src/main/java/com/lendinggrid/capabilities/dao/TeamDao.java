package com.lendinggrid.capabilities.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.lendinggrid.capabilities.domain.Team;

@RestResource(path="teams", rel="teams")
public interface TeamDao extends CrudRepository<Team, Long> {

	
	public List<Team> findAll();
	
	public String findByName(String name);
}
