package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveById {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		Student s = entityManager.find(Student.class, 1);
		if (s != null) {
			entityManager.remove(s);
		} else {
			System.out.println("Student not found !!");
		}
		entityTransaction.commit();

		System.out.println("***** Done *****");

	}

}
