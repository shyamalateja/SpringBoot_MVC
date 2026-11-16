package com.SpringBootMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootMvc.model.Employee;
import com.SpringBootMvc.repository.EmployeeRepo;
import com.SpringBootMvc.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	//EmployeeRepo er;
	EmployeeService es;
	
	@GetMapping("/addEmp")
	public String addEmp() {
		System.out.println("enter controller");
		return "addEmployee";
	}
	
	@PostMapping("/saveEmp")
	public ModelAndView saveEmp(@ModelAttribute Employee emp) {
		
//		er.save(emp);
//		System.out.println("employee registerd succesfully");
		
		es.addEmployee(emp);
		return new ModelAndView("redirect:/employees/addEmp");
	}
	
	@GetMapping("/getEmp")
	public ModelAndView getAllEmployee() {
		List<Employee> emps=es.getAllEmp();
		ModelAndView mv=new ModelAndView();
		mv.addObject("employees",emps);
		mv.setViewName("employeelist");
		return mv;
	}
	
	
}
