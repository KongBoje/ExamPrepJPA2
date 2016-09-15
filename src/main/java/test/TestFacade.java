/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Person;
import entity.Student;
import facade.entityfacade;
import java.util.List;

/**
 *
 * @author Michael
 */
public class TestFacade {
    public static void main(String[] args) {
        entityfacade ef = new entityfacade();
        
        Person pers = new Person();
        Person sup = new Person();
        Student stud = new Student();
        
        
        pers.setFirstName("Testfacadeperson");
        sup.setFirstName("Supervisor");
        stud.setFirstName("Studenten");
        
              
        ef.addPerson(pers);
        ef.addPerson(sup);
        ef.addPerson(stud);
        
        ef.setPersonSupervises(sup, pers);
        ef.setPersonSupervises(sup, stud);
        
        ef.editPerson(pers, "Knud");
        
        System.out.println("--- Getting Information ---");
        List<Person> whoDoesSSupervise = ef.getWhoPersonSupervises(sup);
        System.out.println("sup supervises:");
        for(Person tmp : whoDoesSSupervise) {
            System.out.println("-" + tmp.getFirstName());
        }
        
        System.out.println("pers is supervise by " + ef.getPersonSupervisor(pers).getFirstName());
    }
}
