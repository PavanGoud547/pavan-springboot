package com.Pavaninfotech1.employee1.info.service;


import com.Pavaninfotech1.employee1.info.Model.Employee;
import com.Pavaninfotech1.employee1.info.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employeeservice {
    @Autowired
    private Employeerepository repo;

    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

}
