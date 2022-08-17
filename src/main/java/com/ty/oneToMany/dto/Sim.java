package com.ty.oneToMany.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String provider;
	private long imrc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public long getImrc() {
		return imrc;
	}
	public void setImrc(long imrc) {
		this.imrc = imrc;
	}
	@Override
	public String toString() {
		return "Sim\nid=" + id + "\nprovider=" + provider + "\nimrc=" + imrc;
	}
	
	

}
