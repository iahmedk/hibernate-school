package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Imtiyaz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student s = new Student();
		s.setId(4);
		s.setName("Aariz");
		s.setPercentage(88.88);

		entityTransaction.begin();

		entityManager.persist(s);

		entityTransaction.commit();

		System.out.println("*********************** Done ***************************");
	}

}
