package com.david.neo4j.metro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.david.neo4j.metro.servicios.ISave;

@SpringBootApplication
public class MetroApplication implements CommandLineRunner{

	@Autowired
	ISave save;
	public static void main(String[] args) 
	{
		SpringApplication.run(MetroApplication.class, args);
	}
	
	public void run(String... args)
	{
		/*Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();
		 
		 ParadaMetro p1= new ParadaMetro();
		 p1.setNombreParada("Chamartin");
		 session.save(p1);*/
		save.insertData();
	}
}
