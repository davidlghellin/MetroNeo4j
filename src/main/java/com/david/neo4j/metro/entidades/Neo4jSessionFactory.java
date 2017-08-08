package com.david.neo4j.metro.entidades;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

public class Neo4jSessionFactory 
{
	private final static  SessionFactory sessionFactory= new SessionFactory("com.david.neo4j.metro.entidades");
	private static Neo4jSessionFactory factory = new Neo4jSessionFactory();
	
	private Neo4jSessionFactory() {}
	
	public static Neo4jSessionFactory getInstance()
	{
		return factory;
	}
	
	public static Session getNeo4jSession() 
	{
		return sessionFactory.openSession();
	}
}
