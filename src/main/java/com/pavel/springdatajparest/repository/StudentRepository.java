package com.pavel.springdatajparest.repository;

import com.pavel.springdatajparest.entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

    List<Student> findByPaymentIsFalse();

    List<Student> findByName(String name);

    List<Student> findBySurname(String surname);

}
