package com.ty.oneToMany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Mobile;

public class GetMobileById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = entityManagerFactory.createEntityManager();
		
		Mobile mobile = manager.find(Mobile.class, 2);
		System.out.println(mobile);
	}

}
