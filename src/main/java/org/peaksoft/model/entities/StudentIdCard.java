package org.peaksoft.model.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "student_id_card")
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
// TODO: 07.10.2023 в классе StudentIdCard должен быть поля(Long id, String identityNumber,
//  LocalDate createDate)
public class StudentIdCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String identityNumber;
    LocalDate createDate;
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.REMOVE})
    Student student;
}
