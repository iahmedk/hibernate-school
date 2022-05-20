package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVisitor {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Imtiyaz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Visitor visitor = new Visitor();
		visitor.setId(5);
		visitor.setName("Madiha");
		visitor.setEmail("madiha123@gmail.com");
		visitor.setGender("female");
		visitor.setDob(LocalDate.of(2005, 4, 20));
		visitor.setVisitDateTime(LocalDateTime.now());
		
		entityTransaction.begin();		
		entityManager.persist(visitor);			
		entityTransaction.commit();
		
		System.out.println("*********************** Done ***************************");
	}

}
