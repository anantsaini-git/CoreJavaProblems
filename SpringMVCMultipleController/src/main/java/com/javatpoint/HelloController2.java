package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {
	@RequestMapping(path="/hello2", produces = "application/text")
	public String display() {
		return "viewpage2";
	}
}
