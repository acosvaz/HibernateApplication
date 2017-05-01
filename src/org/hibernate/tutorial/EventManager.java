package org.hibernate.tutorial;

import org.hibernate.Session;

import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.tutorial.domain.Employee;

import org.hibernate.tutorial.domain.Event;
import org.hibernate.tutorial.util.HibernateUtil;

public class EventManager {

    public static void main(String[] args) throws HibernateException {
        EventManager mgr = new EventManager();
        EventManager mg = new EventManager();

        if (args[0].equals("store")) {
            mgr.createAndStoreEvent("My Event", new Date());
            mg.createAndStoreEmployee("My Employee", new Date());
        }

        HibernateUtil.getSessionFactory().close();
    }

   private void createAndStoreEvent(String title, Date theDate) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Event theEvent = new Event();
        theEvent.setTitle(title);
        theEvent.setDate(theDate);
        session.save(theEvent);
       
        session.close();
    }
    
    private void createAndStoreEmployee(String fullname, Date thenDate) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        Employee nuEmployee = new Employee();
        nuEmployee.setFullname(fullname);
        nuEmployee.setDate(thenDate);
        session.save(nuEmployee);
       
        session.close();
    }

}