package com.cg.hr.controllers;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hr.entities.Employee;
import com.cg.hr.exceptions.EmpException;
import com.cg.hr.services.EmpService;

@Controller
public class EmpCRUDController {
	
	@Resource
	private EmpService service;
	
	@RequestMapping("/getHomePage.do")
	public ModelAndView getHomePage(){
		
		
		ModelAndView mAndV =new ModelAndView("HomePage");
		return mAndV;
		
	}
	
	@RequestMapping("/getEmpList.do")
	public ModelAndView getEmpList() throws EmpException {
		
		
		List<Employee> empList=service.getEmpList();
		ModelAndView mAndV =new ModelAndView();
	
		mAndV.addObject("empList",empList);
		mAndV.addObject("pageHead","Employee List");
		
		mAndV.setViewName("EmpList");
		
		return mAndV;
		
	}
	
	
	@RequestMapping("/getEmpDetails.do")
	public ModelAndView getEmpDetails(@RequestParam("empNo") int empNo) throws EmpException {
		Employee emp=service.getEmpOnId(empNo);
		
		ModelAndView mAndV =new ModelAndView();
		
		mAndV.addObject("emp",emp);
		mAndV.addObject("pageHead","Employee Details");
		
		mAndV.setViewName("EmpDetails");
		
		return mAndV;
		
	}
	
	@RequestMapping("/getEntryPage.do")
	public ModelAndView getEntryPage(){
		
		ModelAndView mAndV =new ModelAndView("EntryPage");
		
		Employee emp=new Employee();	//Command Object;
		mAndV.addObject("employee",emp);
		
		return mAndV;
		
	}
	
	@RequestMapping(value="/submitEmpDetails.do", method=RequestMethod.POST)
	public String submitEmpDetails(@ModelAttribute("employee") @Valid Employee emp, BindingResult result, Model mAndV) throws EmpException {
		System.out.println(emp);
		if(result.hasErrors())
		{
			return "EntryPage";
		}
		else
		{
		service.insertNewEmp(emp);
		
		mAndV.addAttribute("emp",emp);
		mAndV.addAttribute("pageHead","Suceessful Joining of Employee");
		
		return "SuccEmpJoining";
		}
		
	}
	
	//Update Name Use case
	@RequestMapping("/getUpdateNamePage.do")
	public ModelAndView getUpdateNamePage() throws EmpException{
		
		ModelAndView mAndV =new ModelAndView("UpdateNamePage");
		List<Integer> idList=service.getEmpNoList();
		
		mAndV.addObject("idList",idList);
		mAndV.addObject("pageHead","Update Name of an Employee");
		return mAndV;
		
	}
	
	@RequestMapping(value="/submitNewEmpName.do", method=RequestMethod.GET)
	public String submitNewEmpName(@RequestParam("empNo") int empNo,
			@RequestParam("newName") String newName,Model mAndV) throws EmpException {
		System.out.println(empNo+" "+newName);
		
		service.updateEmpName(empNo, newName);
			
		Employee emp=service.getEmpOnId(empNo);
		mAndV.addAttribute("emp",emp);
		mAndV.addAttribute("pageHead","Suceessful Updation of Employee Name");
		
		return "SuccEmpUpdate";
		
		
	}
	
	
	
	
}
