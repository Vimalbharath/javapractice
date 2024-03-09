package main;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import beans.TestJob;

public class Demo {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("myunit");
		EntityManager em = emf.createEntityManager();
		System.out.println( em.find(TestJob.class,123));
	}
}
