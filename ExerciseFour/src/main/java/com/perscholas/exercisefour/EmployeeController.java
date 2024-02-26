package com.perscholas.exercisefour;

import com.perscholas.exercisefour.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class EmployeeController {
    private Map<Long, Employee> employeeMap = new HashMap<>();

    @GetMapping("/employeeform")
    public String empForm() {
        return "employeeform";
    }

    @PostMapping("/addEmployee")
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap model) {

        model.addAttribute("name", employee.getName());
        model.addAttribute("id", employee.getId());
        model.addAttribute("contactNumber", employee.getContactNumber());
        employeeMap.put(employee.getId(), employee);
        return "employeeView";
    }
}