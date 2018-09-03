package com.cg.plp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {
	@RequestMapping("/feedback")
	public String feedbackPage() {
		return "feedback";
}
	@RequestMapping("/success")
	public String successPage() {
		return "success";
}
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
}
	
	@RequestMapping("/response")
	public String merchantPage() {
		return "merchantResponse";
}
	
	@RequestMapping("/success2")
	public String success2Page() {
		return "success2";
}
}
