package com.nitkart.starter.h2jpastarter.service;

import com.nitkart.starter.h2jpastarter.entities.Employee;
import com.nitkart.starter.h2jpastarter.entities.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee findEmployee(Integer id) {
        return employeeRepository.findById(id).get();
    }
}
