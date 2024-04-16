package org.peaksoft.model.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.peaksoft.model.enums.Gender;
import org.peaksoft.model.enums.StudyFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
// TODO: 07.10.2023 в классе Student должен быть поля (Long id, String name, int age,
//  StudyFormat studyFormat(enum),Gender gender, LocalDate createDate)
//  Relationships:
//  1. Student and StudentIdCard. У каждого Студента должен быть только один student_idCard
//  2. Student and Course. Студент может обучаться на нескольких курсах, и на одном курсе может быть несколько студентов
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    int age;
    LocalDate createDate;
    Gender gender;
    StudyFormat studyFormat;
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.REMOVE})
    StudentIdCard studentIdCard;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name = "student_course",
    joinColumns = @JoinColumn(name = "student_id"),
    inverseJoinColumns = @JoinColumn(name = "course_id"))
    List<Course> courses;


//    mabedBy надо знать куда как ставить
    // запись пересмотреть
    // чат ждпи посмотреть, и генедер из цифры

}
