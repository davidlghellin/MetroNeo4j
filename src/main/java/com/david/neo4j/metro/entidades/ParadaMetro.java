package com.david.neo4j.metro.entidades;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ParadaMetro {
	
	@GraphId
	private Long id;
	
	private String nombreParada;
	
	private int nLinea;
	
	

	public ParadaMetro() {
		super();
	}

	public ParadaMetro(Long id, String nombreParada, int nLinea) {
		super();
		this.id = id;
		this.nombreParada = nombreParada;
		this.nLinea = nLinea;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreParada() {
		return nombreParada;
	}

	public void setNombreParada(String nombreParada) {
		this.nombreParada = nombreParada;
	}

	public int getnLinea() {
		return nLinea;
	}

	public void setnLinea(int nLinea) {
		this.nLinea = nLinea;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + nLinea;
		result = prime * result + ((nombreParada == null) ? 0 : nombreParada.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParadaMetro other = (ParadaMetro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nLinea != other.nLinea)
			return false;
		if (nombreParada == null) {
			if (other.nombreParada != null)
				return false;
		} else if (!nombreParada.equals(other.nombreParada))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ParadaMetro [id=" + id + ", nombreParada=" + nombreParada + ", nLinea=" + nLinea + "]";
	}
	
	
	

}
