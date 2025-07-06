package com.example.Ex4_JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Ex4_JPA.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

