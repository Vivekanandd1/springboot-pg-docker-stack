package com.vivekcode;


import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    public TechEmployee getEmployeesbyID(@PathVariable Integer id) {
        return techEmployeeServices.getTechEmployeebyID(id);
    }

    @PostMapping
    public void addTechEmployee( @RequestBody TechEmployee techEmployee) {

        techEmployeeServices.insertechEmployee(techEmployee);
    }

}