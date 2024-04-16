package org.peaksoft.model.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "instructor")
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PACKAGE)

// TODO: 07.10.2023  в классе Instructor должен быть поля(Long id,String name, String lastName, int age,
//  Gender gender, LocalDate createDate)
//  Relationship: Instructor and Course.На одном курсе может быть несколько инструкторов,
//  но один инструктор не может работать на нескольких курсах
public class Instructor {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String lastName;
    int age;
    LocalDate createDate;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.REMOVE,CascadeType.PERSIST})
    @JoinColumn(name = "course_id")
    Course course;
}
