package com.bridgeit.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Admin;
import model.Employee;
import model.HEmployee;
import model.SoftwareEmployee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure("resources/db.config.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        SoftwareEmployee se=new SoftwareEmployee(101, "Pushpa Navik",25000.00, "abc@gmail.com", "hibernate");
        HEmployee he=new HEmployee(102,"Vinay Navik",45000.00,"vina@gmail.com",10);
        Admin am=new Admin(103, "Piyush Nishad", 60000.00, "xyz@gmail.com","Chembur");
        
        session.save(se);
        session.save(he);
        session.save(am);
        
        tx.commit();
        session.close();
        sessionFactory.close();
        
        
        
        
    }
}
