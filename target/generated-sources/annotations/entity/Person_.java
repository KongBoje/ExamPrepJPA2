package entity;

import entity.Person;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-16T01:55:20")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, Boolean> isMarried;
    public static volatile SingularAttribute<Person, String> firstName;
    public static volatile SingularAttribute<Person, String> lastName;
    public static volatile SingularAttribute<Person, Person> supervisedby;
    public static volatile ListAttribute<Person, Person> supervised;
    public static volatile SingularAttribute<Person, Long> id;
    public static volatile SingularAttribute<Person, Date> birthDate;
    public static volatile SingularAttribute<Person, Integer> age;

}