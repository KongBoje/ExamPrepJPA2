package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-16T01:55:20")
@StaticMetamodel(Student.class)
public class Student_ extends Person_ {

    public static volatile SingularAttribute<Student, Integer> matNr;
    public static volatile SingularAttribute<Student, Date> matDate;

}