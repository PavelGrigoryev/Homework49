package com.pavel.springdatajpa.repository;

import com.pavel.springdatajpa.entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

    List<Student> findByPayment(Boolean payment);

    List<Student> findByName(String name);

    List<Student> findBySurname(String surname);

}
