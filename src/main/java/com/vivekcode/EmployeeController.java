package com.vivekcode;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/EmployeeDetails")
public class EmployeeController {

    private final TechEmployeeServices techEmployeeServices;

    public EmployeeController(TechEmployeeServices techEmployeeServices) {
        this.techEmployeeServices = techEmployeeServices;
    }

    @GetMapping
    public List<TechEmployee> getEmployees() {
      return techEmployeeServices.getTechEmployeeList();

    }
}