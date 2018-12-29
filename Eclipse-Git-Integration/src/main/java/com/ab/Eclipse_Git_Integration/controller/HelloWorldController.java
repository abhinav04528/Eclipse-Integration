package com.ab.Eclipse_Git_Integration.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloWorld.do")
	public String todoList(Model model) {
		model.addAttribute("groupId","com.ab");
		model.addAttribute("artifactId","Eclipse-Git-Integration");
		return "/helloWorld";
	}
}
