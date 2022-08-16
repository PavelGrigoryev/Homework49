package com.pavel.springdatajpa.repository;

import com.pavel.springdatajpa.entity.Group;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GroupRepository extends PagingAndSortingRepository<Group, Integer> {
}
