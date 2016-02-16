package com.skhu.scs.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value="/test.do")
	public String testdo(){
		System.out.println("dd");
		return "test";
	}

}
