package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveParent {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Parent parent = new Parent();
		parent.setName("Fareed");
		parent.setEmail("fareedkolkar123@gmail.com");
		parent.setMobile(9845605206l);

		entityTransaction.begin();

		entityManager.persist(parent);

		entityTransaction.commit();

		System.out.println("***** Done *****");

	}

}
