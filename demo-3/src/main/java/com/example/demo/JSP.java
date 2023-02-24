package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSP {
	@GetMapping("/hii")
     public String show() {
    	 return "NewFile.jsp";
     }
}
