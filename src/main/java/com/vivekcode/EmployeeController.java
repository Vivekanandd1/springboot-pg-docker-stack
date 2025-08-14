package com.vivekcode;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/EmployeeDetails")
public class EmployeeController {

   @GetMapping
    public List<TechEmployee> getEmployees(){
       return List.of( new TechEmployee(
              1, "Vivek", "Java, Rails, JS"

       ),
               new TechEmployee(
                       2,"Damy","Selenium, Appium, Playwright"
               )
       );

    }

}
