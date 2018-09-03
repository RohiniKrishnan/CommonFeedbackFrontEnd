package com.cg.plp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.plp.beans.Admin;



@RestController
public class FrontEndController {
@RequestMapping("/CustomerFeedback")
	public ModelAndView getProduct(@RequestParam String ProductId,@RequestParam String feedback) {
		RestTemplate rt=new RestTemplate();
		String prod=rt.getForObject("http://localhost:7070/commonfeedback/"+ProductId+"/"+feedback, String.class);
		return new ModelAndView("success","cust",prod);
	}

@RequestMapping("/MerchantResponse")
public ModelAndView getProduct1(@RequestParam String ProductId,@RequestParam String response) {
	RestTemplate rt=new RestTemplate();
	String prod=rt.getForObject("http://localhost:7070/response/"+ProductId+"/"+response, String.class);
	return new ModelAndView("success2","cust",prod);
}
	
}
