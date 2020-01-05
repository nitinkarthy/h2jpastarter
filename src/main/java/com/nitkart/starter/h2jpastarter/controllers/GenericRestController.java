package com.nitkart.starter.h2jpastarter.controllers;

import com.nitkart.starter.h2jpastarter.entities.Employee;
import com.nitkart.starter.h2jpastarter.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GenericRestController {
    @Autowired
    private GenericService genericService;

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    Employee getEmployee(@PathVariable Integer id){
        return  genericService.findEmployee(id);
    }
}
