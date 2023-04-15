package com.one_to_one.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.one_to_one.dto.AdharCard;
import com.one_to_one.dto.Person;

public class PersonDao {
	public void savePerson(Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		AdharCard adharCard = person.getAdharCard();
		entityManager.persist(adharCard);
		entityManager.persist(person);

		entityTransaction.commit();
	}

	public void deletePersonById(int i) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		// find person By Id
		Person person = entityManager.find(Person.class, i);
		// find AdharCard
		AdharCard adharCard = person.getAdharCard();
		// find id
		entityManager.remove(adharCard);
		entityManager.remove(person);
		entityTransaction.commit();

	}

	public void UpdatePerson(int id, Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Person person2 = entityManager.find(Person.class, id);
		person2.setId(id);
		person2.setName("SaurabhG");
		person2.setMobile(person.getMobile());
		person2.setAdharCard(person.getAdharCard());
		entityManager.merge(person2);
		entityTransaction.commit();

	}

	public void fetchData(int i) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person =  entityManager.find(Person.class, i);
		System.out.println(person);
	}

}
