package com.lu.service;

import java.util.Map;

public interface ICloudCallRestService {
	public String callRest(String URL, String method,
			Map<String, Object> parameters, boolean isJson);
}
