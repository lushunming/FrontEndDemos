package com.lu.controller.fileupload;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/becalled")
public class becalled {

	@RequestMapping("/getmap")
	public Map<String, Object> getMap(String param) {
		return null;

	}

}
