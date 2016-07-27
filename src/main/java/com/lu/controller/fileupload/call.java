package com.lu.controller.fileupload;

import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.print.attribute.HashAttributeSet;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lu.service.ICloudCallRestService;
import com.mysql.fabric.xmlrpc.base.Array;

@Controller
@RequestMapping("/call")
public class call {

	@Resource
	private ICloudCallRestService callRestService;

	@RequestMapping("/getmap")
	public String getMap() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		A a = new A();
		
		List<B> bs = new ArrayList<B>();
		B b1 = new B();
		b1.setB("b1");
		B b2 = new B();
		b2.setB("b2");
		B b3 = new B();
		b3.setB("b3");

		bs.add(b1);
		bs.add(b2);
		bs.add(b3);
		a.setB(bs);
		a.setAaString(objectMapper.writeValueAsString(bs));
		Map<String, Object> objectAsMap = objectMapper.convertValue(a,
				Map.class);
		Map<String, Object> parameters = new HashMap<String, Object>();
		callRestService.callRest("http://127.0.0.1:8080/becalled/getmap", "POST",
				objectAsMap, true);
		return "fileupload/index";

	}
}
