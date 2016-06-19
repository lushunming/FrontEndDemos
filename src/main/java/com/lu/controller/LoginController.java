package com.lu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	/**
	 * 返回登陆页面
	 * 
	 * @return
	 */
	@RequestMapping("")
	public String toLoginPage() {

		return "login";
	}

}
