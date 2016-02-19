package com.skhu.scs.user.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skhu.scs.core.util.BCryptPasswordEncoder;
import com.skhu.scs.user.dao.UserDaoService;

@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource(name="BCryptPasswordEncoder")
	private BCryptPasswordEncoder encoder;
	
	@Resource(name="userDaoService")
	private UserDaoService dao;
	
	@RequestMapping("index")
	public String index(Model model) {
		return "../../index";
	}
	
	@RequestMapping(value="/user/join", params="m=init")
	public String init(@RequestParam("m")String process){
		
		return "/user/joinPage";
	}
	
	@RequestMapping(value="/user/join", params="m=join")
	public String join(@RequestParam("email")String email, @RequestParam("passwd")String passwd,@RequestParam("authority")String authority ){
		
		String encodedPw = encoder.encoding(passwd);
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("email", email);
		paramMap.put("passwd", encodedPw);
		paramMap.put("authority", authority);
		int result = dao.insertUser(paramMap);
		logger.info("result ===> {}", result);
		return "redirect:../index.skhu";
	}
	
}
