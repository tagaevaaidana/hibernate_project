package org.peaksoft.service.impl;

import org.hibernate.Session;
import org.peaksoft.model.entities.Course;
import org.peaksoft.service.Service;
import org.peaksoft.util.HibernateUtil;

import java.security.Guard;
import java.util.List;

public class CourseService implements Service<Course> {
    @Override
    public void create(Course course) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(course);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Course course, Long id) {


    }

    @Override
    public List<Course> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Course> courses = session.createQuery("FROM Course",Course.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return courses;
    }

    @Override
    public Course getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Course course = session.get(Course.class,id);
        session.getTransaction().commit();
        session.close();
        return course;
    }

    @Override
    public String deleteById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        return null;
    }
}
