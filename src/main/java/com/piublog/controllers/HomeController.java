package com.piublog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class HomeController {
	
	@RequestMapping(value = "", method = GET)
	public String index(Model model) {
		return "home/index";
	}
}
