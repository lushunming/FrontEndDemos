package com.lu.controller.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/fileUpload")
public class FileUploadController {

	@RequestMapping("/goToUpload")
	public String goFileUploadPage(HttpServletRequest request) {
		return "fileupload/index";
	}

	@RequestMapping("/upload")
	@ResponseBody
	public Map<String, Object> upload(MultipartFile file, MultipartHttpServletRequest request) {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = file.getInputStream();
			int len = 0;
			byte[] buffer = new byte[1024];
			File file2 = new File("E://" + "doc", file.getOriginalFilename());
			if (!file2.exists()) {
				file2.createNewFile();
			}
			outputStream = new FileOutputStream(file2);
			while ((len = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer,0,len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
