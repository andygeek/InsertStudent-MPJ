package com.andygeek.InsertStudent_MPJ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.andygeek.InsertStudent_MPJ.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Make session" );
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        System.out.println("Make student: Andy, 23");
        Student student = new Student("Andy", 23);
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        
        System.out.println("Finish");
        
    }
}
