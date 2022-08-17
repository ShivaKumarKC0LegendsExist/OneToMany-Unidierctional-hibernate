package com.ty.oneToMany.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.oneToMany.dao.OrganizationBusDeo;
import com.ty.oneToMany.dto.Bus;
import com.ty.oneToMany.dto.Organization;

public class SaveBus {

	public static void main(String[] args) {

		OrganizationBusDeo deo = new OrganizationBusDeo();
		Organization organization = new Organization();
		organization.setName("KSRTC");
		organization.setAddress("Bangalore");
		
		Bus bus = new Bus();
		bus.setCapacity(123);
		bus.setType("Sleeper");
		
		Bus bus1 = new Bus();
		bus1.setCapacity(164);
		bus1.setType("Stander");
		
		List<Bus> list = new ArrayList<Bus>();
		list.add(bus1);
	
		list.add(bus);
		organization.setBus(list);
		
		deo.saveOrganization(organization, list);
	}

}
