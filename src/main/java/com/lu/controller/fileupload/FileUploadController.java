package com.lu.controller.fileupload;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fileUpload")
public class FileUploadController {

	@RequestMapping("/goToUpload")
	public String goFileUploadPage(HttpServletRequest request) {
		return "fileupload/index";

	}

}
