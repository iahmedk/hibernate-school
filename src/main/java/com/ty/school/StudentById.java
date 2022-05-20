package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class StudentById {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("Imtiyaz").createEntityManager();
		Student s = entityManager.find(Student.class, 2);
		if (s != null) {
			System.out.println(s);
		} else {
			System.out.println("****** Student not found ******");
		}
	}
}
