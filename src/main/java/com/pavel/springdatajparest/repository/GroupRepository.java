package com.pavel.springdatajparest.repository;

import com.pavel.springdatajparest.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Integer> {
}
