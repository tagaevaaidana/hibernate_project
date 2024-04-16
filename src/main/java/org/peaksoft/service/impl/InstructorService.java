package org.peaksoft.service.impl;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
import org.peaksoft.model.entities.Instructor;
import org.peaksoft.service.Service;
import org.peaksoft.util.HibernateUtil;

import java.util.List;

public class InstructorService implements Service<Instructor> {
    @Override
    public void create(Instructor instructor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(instructor);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Instructor instructor, Long id) {
        ;

    }

    @Override
    public List<Instructor> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Instructor> instructors = session.createQuery("FROM Instructor",Instructor.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return instructors;
    }

    @Override
    public Instructor getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Instructor instructor = session.get(Instructor.class,id);
        session.getTransaction().commit();
        session.close();
        return instructor;
    }

    @Override
    public String deleteById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Instructor instructor = session.get(Instructor.class,id);
        session.getTransaction().commit();
        session.close();
        return null;
    }



}
