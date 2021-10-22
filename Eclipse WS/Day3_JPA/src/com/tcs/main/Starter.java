package com.tcs.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.City;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Day3_JPA");

		EntityManager em = emf.createEntityManager();

		City city = new City();
		city.setId(102);
		city.setCity("Mumbai");
		city.setName("lakshmi");
		em.getTransaction().begin();
		em.persist(city);
		System.out.println("1 Record Inserted Successfully!!!");
		em.getTransaction().commit();

		em.getTransaction().begin();
		List<City> cities = em.createNamedQuery("City.findAll").getResultList();
		System.out.println("City Id");
		for (City c : cities) {
			System.out.println(c.getCityId());
		}
		em.getTransaction().commit();
	}

}