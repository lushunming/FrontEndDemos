package com.lu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
	/**
	 * 404处理
	 * 
	 * @return
	 */
	@RequestMapping("/404")
	public String _404Error() {
		return "404";
	}

	@RequestMapping("/500")
	public String _500Error() {
		return "500";
	}

}
