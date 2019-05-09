package com.infovity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WishController {

		@GetMapping("/wishMe")
		public String greeting(@RequestParam String name, Model model) {
			String message = name + "is good boy";
			model.addAttribute("message",message);
			return "home";
		}
}
