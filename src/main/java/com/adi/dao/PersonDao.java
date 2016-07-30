package com.adi.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.adi.domain.Player;

@RestResource(path="persons", rel="persons")
public interface PersonDao extends CrudRepository<Player, Long>{

}
