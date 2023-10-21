package com.hackdroid.jwtProject.repository;

import com.hackdroid.jwtProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
