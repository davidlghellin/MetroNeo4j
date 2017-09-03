package com.david.neo4j.metro.servicios.impl;

import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.david.neo4j.metro.entidades.Neo4jSessionFactory;
import com.david.neo4j.metro.entidades.ParadaMetroNodos;
import com.david.neo4j.metro.servicios.ISave;

@Component
public class Save implements ISave {

	@Value("${data.david}")
	String david;
	
	public void insertData() 
	{
		System.out.println(david);
		
		Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();
		
		session.purgeDatabase();
		
		/*ParadaMetro p1 = new ParadaMetro();
		p1.setNombreParada("Chamartin");
		
		List<ParadaMetro> listaMetros = new LinkedList<ParadaMetro>();
		listaMetros.add(p1);
		
		session.save(listaMetros);*/
		
		ParadaMetroNodos p1 = new ParadaMetroNodos();
		p1.setNombreParada("Chamartin");
		p1.setnLinea(10);
		//session.save(p);

		ParadaMetroNodos p2 = new ParadaMetroNodos();
		p2.setNombreParada("Nuevos Ministerios");
		p2.setnLinea(10);
		p1.setAntesParada(p2);

		// session.save(p2);
		
		ParadaMetroNodos p3 = new ParadaMetroNodos();
		p3.setNombreParada("Alonso Cano");
		p3.setnLinea(10);
		p3.setDespuesParada(p1);
		
		session.save(p3);
	}

}
