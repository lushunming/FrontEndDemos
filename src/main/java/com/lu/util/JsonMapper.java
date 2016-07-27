package com.lu.util;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonMapper {

	public String toJson(Object parameters) {

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = null;
		try {
			jsonString = mapper.writeValueAsString(parameters);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonString;
	}

}
