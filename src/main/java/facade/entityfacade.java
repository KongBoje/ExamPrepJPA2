/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Person;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Michael
 */
public class entityfacade {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public entityfacade() {
        emf = Persistence.createEntityManagerFactory("PU", null);
        em = emf.createEntityManager();
    }
    
    public void addPerson(Person p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
    // Lad os ikke bruge for lang paa dette - navneændring er nok
    public void editPerson(Person p, String newFirstname) {
        em.getTransaction().begin();
        p.setFirstName(newFirstname);
        em.getTransaction().commit();
    }
    
    public Person findPerson(Long id) {
        return em.find(Person.class, id);
    }
    
    public void deletePerson(Person p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }
    
    public Person getPersonSupervisor(Person p) {
        return p.getSupervisedby();
    }
    
    public List<Person> getWhoPersonSupervises(Person p) {
        return p.getSupervises();
    }
    
    public void setPersonSupervises(Person a, Person b) {
        em.getTransaction().begin();
        a.addSupervises(b);
        em.getTransaction().commit();
    }
}
