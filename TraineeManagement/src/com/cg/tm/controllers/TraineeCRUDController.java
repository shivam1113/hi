package com.cg.tm.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.tm.entities.Trainee;
import com.cg.tm.exceptions.TraineeException;
import com.cg.tm.services.TraineeService;

@Controller
public class TraineeCRUDController {
	
	@Resource
	private TraineeService service;
	
	@RequestMapping("/getIndexPage.do")
	public ModelAndView getIndexPage(){
			
		ModelAndView mAndV =new ModelAndView("Index");
		return mAndV;
		
	}

	
	@RequestMapping("/getHomePage.do")
	public ModelAndView getHomePage(){
		
		ModelAndView mAndV =new ModelAndView("HomePage");
		return mAndV;
		
	}
	
	

		@RequestMapping("/DeleteTraineePage.do")
	public ModelAndView getDeletePage(){
		
		
		ModelAndView mAndV =new ModelAndView("TraineeDetails2");
		return mAndV;
		
	}
		
		
	@RequestMapping("/getTraineeDetails.do")
	public ModelAndView getTraineePage() throws TraineeException{
		
		ModelAndView mAndV =new ModelAndView("TraineeDetails");
		return mAndV;
		
	}
	
	@RequestMapping("/getEmpList.do")
	public ModelAndView getEmpList() throws TraineeException {
		
		
		List<Trainee> empList=service.getEmpList();
		ModelAndView mAndV =new ModelAndView();
	
		mAndV.addObject("empList",empList);
		mAndV.addObject("pageHead","Employee List");
		
		mAndV.setViewName("EmpList");
		
		return mAndV;
		
	}
	
	
	@RequestMapping("/getTraineeId.do")
	public ModelAndView getEmpDetails(@RequestParam("traineeId") int empNo) throws TraineeException {
		Trainee emp=service.getEmpOnId(empNo);
		
		ModelAndView mAndV =new ModelAndView();
		
		mAndV.addObject("emp",emp);
		mAndV.addObject("pageHead","Employee Details");
		
		mAndV.setViewName("EmpDetails");
		
		return mAndV;
		
	}
	
	@RequestMapping("/deleteId.do")
	public ModelAndView deleteId(@RequestParam("traineeId") int empNo) throws TraineeException {
		Trainee emp=service.getEmpOnId(empNo);
		System.out.println(emp);
		ModelAndView mAndV =new ModelAndView("SuccessPage");
		
		return mAndV;
		
	}
	
	
	@RequestMapping("/deleteDetails.do")
	public ModelAndView deleteDetails(@RequestParam("empNo") int empNo) throws TraineeException {
		System.out.println(empNo);
		Trainee emp=service.getEmpOnId(empNo);
		service.deleteEmp(emp);
		
		ModelAndView mAndV =new ModelAndView();
		
		mAndV.addObject("traineeId",empNo);
		mAndV.addObject("pageHead","SuccessPage");
		
		mAndV.setViewName("UpdateNamePage");
		
		return mAndV;
		
	}
	@RequestMapping("/getEntryPage.do")
	public ModelAndView getEntryPage(){
		
		ModelAndView mAndV =new ModelAndView("EntryPage");
		
		Trainee emp=new Trainee();	//Command Object;
		mAndV.addObject("employee",emp);
		
		return mAndV;
		
	}
	
	@RequestMapping(value="/submitEmpDetails.do", method=RequestMethod.POST)
	public String submitEmpDetails(@ModelAttribute("employee") Trainee emp,Model mAndV) throws TraineeException {
		System.out.println(emp);
		service.insertNewEmp(emp);
		
		mAndV.addAttribute("emp",emp);
		mAndV.addAttribute("pageHead","Suceessful Insertion of Trainee");
		
		return "SuccEmpJoining";
		
		
	}
	
	
	//Update Name Use case
	@RequestMapping("/getUpdateNamePage.do")
	public ModelAndView getUpdateNamePage() throws TraineeException{
		
		/*ModelAndView mAndV =new ModelAndView("UpdateNamePage");
		List<Integer> idList=service.getEmpNoList();
		
		mAndV.addObject("idList",idList);
		mAndV.addObject("pageHead","Update Name of an Employee");
		return mAndV;*/
		ModelAndView mAndV =new ModelAndView("TraineeDetails1");
		return mAndV;
		
	}
	
	@RequestMapping("/getUpdatingId.do")
	public ModelAndView getUpdationId(@RequestParam("traineeId") int empNo) throws TraineeException {
		Trainee emp=service.getEmpOnId(empNo);
		
		ModelAndView mAndV =new ModelAndView();
		
		mAndV.addObject("traineeId",empNo);
		mAndV.addObject("pageHead","UpdateNamePage");
		
		mAndV.setViewName("UpdateNamePage");
		
		return mAndV;
		
	}

	
	
	@RequestMapping(value="/submitNewEmpName.do", method=RequestMethod.GET)
	public String submitNewEmpName(@RequestParam("traineeId") int traineeId,
			@RequestParam("traineeName") String traineeName,@RequestParam("traineeLocation") String traineeLocation,
			@RequestParam("traineeDomain") String traineeDomain,Model mAndV) throws TraineeException {
		System.out.println(traineeId+" "+traineeName+" "+traineeDomain+" "+traineeLocation);
		
		service.updateEmpName(traineeId, traineeName,traineeDomain,traineeLocation);
			
		Trainee emp=service.getEmpOnId(traineeId);
		mAndV.addAttribute("emp",emp);
		mAndV.addAttribute("pageHead","Suceessful Updation of Employee Name");
		
		return "SuccEmpUpdate";
		
		
	}
	

	
	
}
