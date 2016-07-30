package com.lendinggrid.capabilities.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.lendinggrid.capabilities.domain.Player;

@RestResource(path="persons", rel="persons")
public interface PersonDao extends CrudRepository<Player, Long>{

}
