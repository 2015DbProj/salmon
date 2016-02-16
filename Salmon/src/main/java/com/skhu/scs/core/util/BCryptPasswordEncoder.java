package com.skhu.scs.core.util;

import javax.annotation.Resource;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service("BCryptPasswordEncoder")
public class BCryptPasswordEncoder {

	@Resource(name="passwordEncoder")
	private PasswordEncoder encoder;

	public String encoding(String str){
		return encoder.encode(str);
	}

}