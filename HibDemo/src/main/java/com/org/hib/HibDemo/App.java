package com.org.hib.HibDemo;



import org.hibernate.*;
import org.hibernate.cfg.Configuration;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        Configuration  cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fact = cfg.buildSessionFactory();
        Session sess= fact.openSession();
        sess.beginTransaction();

        book book=new book();
        book.setbno(401);
        book.setbname("Java Complete Reference");
        book.setprice(550);

        sess.save(book);
        sess.getTransaction().commit();
        System.out.println("saved successfully ");   
        sess.close();     
    }
}
