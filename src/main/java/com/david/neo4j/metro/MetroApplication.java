package com.david.neo4j.metro;

import org.neo4j.ogm.session.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.david.neo4j.metro.entidades.Neo4jSessionFactory;
import com.david.neo4j.metro.entidades.ParadaMetro;

@SpringBootApplication
public class MetroApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(MetroApplication.class, args);
		
		 Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();
		 
		 ParadaMetro p1= new ParadaMetro();
		 p1.setNombreParada("Chamartin");
		 session.save(p1);
	}
}
