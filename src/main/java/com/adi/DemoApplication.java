package com.adi;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adi.dao.TeamDao;
import com.adi.domain.Player;
import com.adi.domain.Team;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	TeamDao teamDao;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@PostConstruct
	public void createTeams() {
		Set<Player> players = new HashSet<Player>();
		Player p1 = new Player("Anupam", "Front");
		Player p2 = new Player("Aditys", "GoalKeeper");
		players.add(p1);
		players.add(p2);
		
		Team team = new Team("peanuts", "India", players);
		teamDao.save(team);
	}
}
