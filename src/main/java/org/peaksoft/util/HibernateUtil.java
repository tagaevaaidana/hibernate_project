package org.peaksoft.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.peaksoft.model.entities.Course;
import org.peaksoft.model.entities.Instructor;
import org.peaksoft.model.entities.Student;
import org.peaksoft.model.entities.StudentIdCard;

public class HibernateUtil {
    public static SessionFactory getSessionFactory(){
        return new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(StudentIdCard.class)
                .addAnnotatedClass(Instructor.class)
                .buildSessionFactory();
    }


}
