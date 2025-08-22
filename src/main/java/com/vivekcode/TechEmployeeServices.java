package com.vivekcode;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechEmployeeServices {

    private TechEmployeeRepo techEmployeeRepo;

    public TechEmployeeServices(TechEmployeeRepo techEmployeeRepo) {
        this.techEmployeeRepo = techEmployeeRepo;
    }

    public List<TechEmployee> getTechEmployeeList() {
        return techEmployeeRepo.findAll();
    }

    public void insertechEmployee(TechEmployee techEmployee) {
        techEmployeeRepo.save(techEmployee);
    }
}
