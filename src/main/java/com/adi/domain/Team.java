package com.adi.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Team {

	@Id @GeneratedValue
	private Long id;
	private String name;
	private String country;
	
	@OneToMany(cascade=CascadeType.ALL) 
	@JoinColumn(name="teamId")
	Set<Player> palyers;
	
	public Team() {
		super();		
	}

	public Team(String name, String country, Set<Player> palyers) {
		this();		
		this.name = name;
		this.country = country;
		this.palyers = palyers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<Player> getPalyers() {
		return palyers;
	}

	public void setPalyers(Set<Player> palyers) {
		this.palyers = palyers;
	}
	
	
	
}
