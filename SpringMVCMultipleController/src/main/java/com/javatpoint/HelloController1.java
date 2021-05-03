package com.javatpoint;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {
	@RequestMapping("/hello1")
	public String display(HttpServletRequest req, Model m) {
		String msg="Hello ";  
        //add a message to the model  
        m.addAttribute("message", msg);
		return "viewpage1";
	}
}
