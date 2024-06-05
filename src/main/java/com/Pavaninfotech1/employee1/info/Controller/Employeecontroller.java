package com.Pavaninfotech1.employee1.info.Controller;

import com.Pavaninfotech1.employee1.info.Model.Employee;
import com.Pavaninfotech1.employee1.info.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {

    @Autowired
    private Employeeservice employeeService;


    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

}
