package org.peaksoft.service.impl;

import org.hibernate.Session;
import org.peaksoft.model.entities.Student;
import org.peaksoft.service.Service;
import org.peaksoft.util.HibernateUtil;

import java.util.List;

public class StudentService implements Service<Student> {
    @Override
    public void create(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(student);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void update(Student student,Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student1 = session.get(Student.class,id);
        student1.setName(student.getName());
        student1.setAge(student.getAge());
        student1.setGender(student.getGender());
        student1.setStudyFormat(student.getStudyFormat());
        student1.setCreateDate(student.getCreateDate());
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public List<Student> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("FROM Student ",Student.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return students;
    }

    @Override
    public Student getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class,id);
        session.getTransaction().commit();
        session.close();
        return student;
    }

    @Override
    public String deleteById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class,id);
        session.getTransaction().commit();
        session.close();
        return null;
    }
}
