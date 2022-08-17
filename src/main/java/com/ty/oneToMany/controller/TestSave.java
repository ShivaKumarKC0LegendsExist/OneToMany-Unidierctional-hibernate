package com.ty.oneToMany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Mobile;
import com.ty.oneToMany.dto.Sim;

public class TestSave {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Mobile mobile = new Mobile();
		mobile.setBrand("BlueBerry");
		mobile.setCost(10000);
		
		List<Sim> list = new ArrayList<Sim>();
		Sim sim1=new Sim();
		sim1.setImrc(78654);
		sim1.setProvider("Airtel");
		list.add(sim1);
		Sim sim2=new Sim();
		sim2.setImrc(98765);
		sim2.setProvider("BSNL");
		list.add(sim2);
		
		mobile.setSim(list);
		
		transaction.begin();
		manager.persist(mobile);
		manager.persist(sim1);
		manager.persist(sim2);
		transaction.commit();
		
	}

}
