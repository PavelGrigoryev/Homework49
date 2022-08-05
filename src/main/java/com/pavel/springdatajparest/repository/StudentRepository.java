package com.pavel.springdatajparest.repository;

import com.pavel.springdatajparest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findStudentsByPaymentIsFalse();

    List<Student> findStudentByName(String name);

    List<Student> findStudentBySurname(String surname);

}
