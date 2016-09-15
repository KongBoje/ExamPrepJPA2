/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Person;
import entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Michael
 */
public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU", null);
        
        Person thesupervisor = new Person();
        Person theperson1 = new Person();
        Person theperson2 = new Person();
        
        Student thestudent = new Student();
        
        theperson1.setFirstName("Person A");
        theperson2.setFirstName("Person B");
        
        thesupervisor.setFirstName("The supervisor");
        
        thestudent.setFirstName("Den studerende");
        thestudent.setMatNr(123);
        
        thesupervisor.addSupervises(theperson1);
        thesupervisor.addSupervises(theperson2);
        thesupervisor.addSupervises(thestudent);
        
        System.out.println("Creating with length " + thesupervisor.getSupervises().size());
        
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        em.persist(thesupervisor);
        em.persist(theperson1);
        em.persist(theperson2);
        em.persist(thestudent);
        
        em.getTransaction().commit();
        
        
        Person test = em.find(Person.class, 1L);
        System.out.println("TEST"+test);
        
        System.out.println("List length is: " + test.getSupervises().size());
        System.out.println("Name is: " + test.getFirstName());
        
        em.getTransaction().begin();
        Person test2 = em.find(Person.class, 1L);
        
        em.remove(test2.getSupervises().get(0));
        
        
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
}
