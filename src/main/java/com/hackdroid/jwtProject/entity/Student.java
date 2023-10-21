package com.hackdroid.jwtProject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "students", uniqueConstraints =
        {@UniqueConstraint(name = "student_email_unique", columnNames = "email")
        })
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence_id_name",
            sequenceName = "student_sequence_id_name",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence_id_name")
    @Column(name = "id", updatable = false)
    private long id;
    @Column(name = "firstName", updatable = true, nullable = false)
    private String firstName;
    @Column(name = "lastName", updatable = true)
    private String lastName;
    @Column(name = "email", updatable = true, nullable = false, unique = true)
    private String email;
    @Column(name = "profileImage", updatable = true, nullable = true)
    private String profileImage;
    @Column(name = "dob", updatable = true, nullable = true, columnDefinition = "Date")
    private Date dob;
}
