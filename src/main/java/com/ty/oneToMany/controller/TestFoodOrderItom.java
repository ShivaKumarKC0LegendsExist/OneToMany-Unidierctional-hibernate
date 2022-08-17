package com.ty.oneToMany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.FoodOrder;
import com.ty.oneToMany.dto.Items;

public class TestFoodOrderItom {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Items items1 = new Items();
		items1.setName("Biryani");
		items1.setQuantity(1);
		items1.setCost(120);
		Items items2 = new Items();
		items2.setName("Kabab");
		items2.setQuantity(2);
		items2.setCost(150);
		List<Items> items = new ArrayList<Items>();
		items.add(items1);
		items.add(items2);
		
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setCustomerName("Ravindra");
		foodOrder.setPhone(987654321);
		foodOrder.setAddress("Katruguppe");
		foodOrder.setItems(items);
		
		transaction.begin();
		manager.persist(foodOrder);
		manager.persist(items1);
		manager.persist(items2);
		transaction.commit();
	}

}
