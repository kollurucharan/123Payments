package com.boot.payments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.payments.model.DiseaseModel;
import com.boot.payments.repository.DiseaseRepositoryInterface;


@Controller
public class DiseaseController {
	
	@Autowired
	DiseaseRepositoryInterface dri;
	
	@GetMapping("/getDisease")
	public String getAllDisease(Model model){
		model.addAttribute("diseases", dri.getAllDisease());
		return "Disease";
	}
	
	@GetMapping("/addDisease")
	public String addDisease(){
		String data = dri.addDisease("covid","1254","harmfull for everyone","active");
		System.out.println(data);
		return "dummy";
	}
	
	@PostMapping("/editDisease")
	@ResponseBody
	public String editDisease(@RequestParam String name, String ICDCode, String Description, String Status, Model model){
		String message = dri.editDisease(name, ICDCode, Description, Status);
		System.out.println(message);
		model.addAttribute("diseases", dri.getAllDisease());
		return message;
	}
	
	@GetMapping("/deleteDisease")
	public String deleteDisease(){
		String data = dri.deleteDisease("covid");
		System.out.println(data);
		return "dummy";
	}
}
