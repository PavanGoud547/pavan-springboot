package com.Pavaninfotech1.employee1.info.repository;

import com.Pavaninfotech1.employee1.info.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee,Integer> {
}
