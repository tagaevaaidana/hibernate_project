package org.peaksoft;

import org.peaksoft.model.entities.Course;
import org.peaksoft.model.entities.Instructor;
import org.peaksoft.model.entities.Student;
import org.peaksoft.model.entities.StudentIdCard;
import org.peaksoft.model.enums.Gender;
import org.peaksoft.model.enums.StudyFormat;
import org.peaksoft.service.impl.CourseService;
import org.peaksoft.service.impl.InstructorService;
import org.peaksoft.service.impl.StudentIdCardService;
import org.peaksoft.service.impl.StudentService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class Main {
    public static void main(String[] ar6gs) {
        /*
        Course
         */


        Course course = new Course();
        course.setCourseName("JavaScrip");
        course.setDurationMonth("9 month");
        course.setCreateDate(LocalDate.of(2023,9,28));

        Course course1 = new Course();
        course1.setCourseName("C++");
        course1.setDurationMonth("6 month");
        course1.setCreateDate(LocalDate.of(2024,3,1));

        Course course2 = new Course();
        course2.setCourseName("Python");
        course2.setDurationMonth("5 month");
        course2.setCreateDate(LocalDate.now());


        CourseService courseService = new CourseService();
//        courseService.create(course);
//        courseService.create(course1);
//        courseService.create(course2);

        courseService.getById(1L);
//        courseService.update(course,1L);

        List<Course> courseList = new ArrayList<>();
        courseList.add(course3);
        courseList.add(course4);


        /*
        Instructor
         */

        Instructor instructor = new Instructor();
        instructor.setName("Timur");
        instructor.setLastName("Kasymbaev");
        instructor.setAge(27);
        instructor.setCreateDate(LocalDate.of(2022,2,01));

        Instructor instructor1 = new Instructor();
        instructor1.setName("Meder");
        instructor1.setLastName("Tynchbekov");
        instructor1.setAge(24);
        instructor1.setCreateDate(LocalDate.of(2023,5,1));

        Instructor instructor2 = new Instructor();
        instructor2.setName("Mark");
        instructor2.setLastName("Orlov");
        instructor2.setAge(30);
        instructor2.setCreateDate(LocalDate.now());

        InstructorService instructorService = new InstructorService();
//        instructorService.create(instructor);
//        instructorService.create(instructor1);
//        instructorService.create(instructor2);

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(instructor);
        instructorList.add(instructor1);
        instructorList.add(instructor2);


        /*
        Student
         */

        Student student = new Student();
        student.setName("Abai");
        student.setAge(21);
        student.setGender(Gender.MALE);
        student.setStudyFormat(StudyFormat.ONLINE);
        student.setCreateDate(LocalDate.of(2023,7,31));

        Student student1 = new Student();
        student1.setName("Alex");
        student1.setAge(23);
        student1.setCreateDate(LocalDate.of(2024,3,8));

        Student student2 = new Student();
        student2.setName("Max");
        student2.setAge(27);
        student2.setCreateDate(LocalDate.of(2022,9,1));
        student.setCourses(courseList);


        StudentService studentService = new StudentService();
//        studentService.create(student);
//        studentService.create(student1);
//        studentService.create(student2);
//        studentService.create(student);
//        studentService.update(student,2L);
        System.out.println(studentService.getById(2L));
//        studentService.deleteById(2L);


        /*
        StudentIdCard
         */

        StudentIdCard studentIdCard = new StudentIdCard();
        studentIdCard.setIdentityNumber("55555");
        studentIdCard.setCreateDate(LocalDate.of(2023,9,1));

        StudentIdCard studentIdCard1 = new StudentIdCard();
        studentIdCard1.setIdentityNumber("12345");
        studentIdCard1.setCreateDate(LocalDate.of(2024,2,29));

        StudentIdCard studentIdCard2 = new StudentIdCard();
        studentIdCard2.setIdentityNumber("33333");
        studentIdCard2.setCreateDate(LocalDate.now());


        StudentIdCardService studentIdCardService = new StudentIdCardService();
//        studentIdCardService.create(studentIdCard);
//        studentIdCardService.create(studentIdCard1);
//        studentIdCardService.create(studentIdCard2);


















    }
}
