package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentUpdateById {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
			
		Student student = new Student();
		student.setId(1);
		student.setName("imtiyaz");
		student.setPercentage(55.55);
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		
		System.out.println("***** Done *****");
	}

}
