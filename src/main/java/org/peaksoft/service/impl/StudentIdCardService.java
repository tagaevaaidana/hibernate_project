package org.peaksoft.service.impl;

import org.hibernate.Session;
import org.peaksoft.model.entities.StudentIdCard;
import org.peaksoft.service.Service;
import org.peaksoft.util.HibernateUtil;

import java.util.List;

public class StudentIdCardService implements Service<StudentIdCard> {
    @Override
    public void create(StudentIdCard studentIdCard) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(studentIdCard);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(StudentIdCard studentIdCard, Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        StudentIdCard studentIdCard1 = session.get(StudentIdCard.class,id);
        studentIdCard1.setIdentityNumber(studentIdCard1.getIdentityNumber());
        studentIdCard1.setCreateDate(studentIdCard1.getCreateDate());
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public List<StudentIdCard> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List <StudentIdCard> studentIdCard = session.createQuery("FROM StudentIdCard",StudentIdCard.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return studentIdCard;
    }

    @Override
    public StudentIdCard getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        StudentIdCard studentIdCard = session.get(StudentIdCard.class,id);
        session.getTransaction().commit();
        session.close();
        return studentIdCard;
    }

    @Override
    public String deleteById(Long id) {
        return null;
    }
}
