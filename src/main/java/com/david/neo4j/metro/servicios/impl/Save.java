package com.david.neo4j.metro.servicios.impl;

import java.util.LinkedList;
import java.util.List;

import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.david.neo4j.metro.entidades.Neo4jSessionFactory;
import com.david.neo4j.metro.entidades.ParadaMetro;
import com.david.neo4j.metro.servicios.ISave;

@Component
public class Save implements ISave {

	@Value("${data.david}")
	String david;
	
	public void insertData() 
	{
		System.out.println(david);
		
		Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();
		
		ParadaMetro p1 = new ParadaMetro();
		p1.setNombreParada("Chamartin");
		
		List<ParadaMetro> listaMetros = new LinkedList<ParadaMetro>();
		listaMetros.add(p1);
		
		session.save(listaMetros);
	}

}
