package com.lu.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lu.common.Constant;
import com.lu.common.ResultVo;
import com.lu.domain.Article;
import com.lu.domain.User;
import com.lu.inter.UserMapper;
import com.lu.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String userPage(Model model) {
		return "index";
	}

	@RequestMapping("/userList")
	public @ResponseBody List<Map<String, Object>> getUserList() {
		List<Map<String, Object>> list = userService
				.getUserListByName("summer");
		return list;

	}

}
