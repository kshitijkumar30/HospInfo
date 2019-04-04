package com.cognizant.pts.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.pts.entity.Medicine;
import com.cognizant.pts.model.MedicineModel;
import com.cognizant.pts.service.MedicineService;
import com.cognizant.pts.validation.MedicineValidator;
@SessionAttributes({"medicineList","oneMedicine"})
@Controller
public class MedicineController {
	
	@Autowired
	private MedicineService medicineService;
	
	@Autowired 
	private MedicineValidator medicineValidator;
	
	@RequestMapping(value="index.htm", method=RequestMethod.GET)
	public ModelAndView viewMedicines()
	{
		ModelAndView mv = new ModelAndView();
		List<Medicine> medicineList = medicineService.viewAllMedicines();
		mv.addObject("medicineList", medicineList);
		mv.setViewName("viewmedicines");
		return mv;
	}
	
	@RequestMapping(value="addmedicineform.htm", method=RequestMethod.GET)
	public String loadMedicineForm()
	{
		return "medicineform";
	}
	
	@RequestMapping(value="addmedicine.htm", method=RequestMethod.POST)
	public ModelAndView persistMedicine(@Valid@ModelAttribute("medicineModel")MedicineModel medicineModel, Errors errors)
	{
		ModelAndView mv = new ModelAndView();
		ValidationUtils.invokeValidator(medicineValidator, medicineModel, errors);
		if(errors.hasErrors())
		{
			mv.setViewName("medicineform");
		}
		else
		{
		boolean medicinePersist = medicineService.persistMedicine(medicineModel);
			if (medicinePersist)
			{
			mv.addObject("status", "Medicine Registered");
			}
			else
			{
			mv.addObject("status", "Medicine Registration Failed");
			}
			mv.setViewName("medicineform");
		}
		return mv;
	}
	
	@ModelAttribute("medicineModel")
	public MedicineModel createMedicineObject()
	{
		MedicineModel medicineModel = new MedicineModel();
		return medicineModel;
	}
	
	@RequestMapping(value="viewonemedicine.htm", method=RequestMethod.GET)
	public ModelAndView viewOneMedicine(ModelMap map, @RequestParam("medicineId")int medicineId)
	{
		ModelAndView mv = new ModelAndView();
		MedicineModel medicineModel = medicineService.viewOneMedicine(medicineId);
		map.addAttribute("oneMedicine", medicineModel);
		mv.setViewName("viewonemedicine");
		return mv;
	}
	
	@RequestMapping(value="updatemedicine.htm", method=RequestMethod.POST)
	public ModelAndView upadateMedicine(@ModelAttribute("oneMedicine")MedicineModel medicineModel, Errors errors)
	{
		ModelAndView mv = new ModelAndView();
		ValidationUtils.invokeValidator(medicineValidator, medicineModel, errors);
		if(errors.hasErrors())
		{
			mv.setViewName("viewonemedicine");
		}
		else
		{
		boolean medicineMerge = medicineService.updateMedicine(medicineModel);
			if (medicineMerge)
			{
			List<Medicine> medicineList = medicineService.viewAllMedicines();
			mv.addObject("medicineList", medicineList);
			mv.addObject("status1", "Medicine successfully updated");
			mv.setViewName("viewmedicines");
			}
			else
			{
			mv.addObject("status", "Medicine registration failed");
			mv.setViewName("viewonemedicine");
			}
			
		}
		return mv;
	}
	/*@RequestMapping(value="viewmedicineafteradd.htm", method=RequestMethod.GET)
	public ModelAndView viewMedicinesAfterAdd()
	{
		ModelAndView mv = new ModelAndView();
		List<Medicine> medicineList = medicineService.viewAllMedicines();
		mv.addObject("medicineList", medicineList);
		mv.setViewName("viewmedicines");
		return mv;
	}*/
	

}
