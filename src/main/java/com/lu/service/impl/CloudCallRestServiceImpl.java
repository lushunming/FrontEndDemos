package com.lu.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lu.util.JsonMapper;

@Service("cloudCallRestService")
@Transactional
public class CloudCallRestServiceImpl implements
		com.lu.service.ICloudCallRestService {

	private static final String REST_PMS = "param";

	@Override
	public String callRest(String URL, String method,
			Map<String, Object> parameters, boolean isJson) {
		// 获取Connection
		// String proxyTicket =
		// AssertionHolder.getAssertion().getPrincipal().getProxyTicketFor(URL);
		// URL = URL + "?ticket=" + proxyTicket;
		HttpURLConnection httpConnection = this.getConnection(URL, method);

		// 拼接参数
		String param = "";
		if (isJson) {
			param = this.getParamStrOfJson(parameters);
		} else {
			param = this.getParamStrOfTradition(parameters);
		}

		this.write(httpConnection, param);
		return this.read(httpConnection);
	}

	/**
	 * 请求参数格式为传统方式：key=value&key=value ...
	 * 
	 * @param parameters
	 * @return
	 */
	private String getParamStrOfTradition(Map<String, Object> parameters) {
		String param = "";

		if (MapUtils.isNotEmpty(parameters)) { // 拼接参数
			Iterator<String> it = parameters.keySet().iterator();
			int i = 1;
			while (it.hasNext()) {
				String pname = it.next();
				String pvalue = parameters.get(pname) == null ? "" : parameters
						.get(pname).toString();
				if (i == 1) {
					param += pname + "=" + pvalue;
				} else {
					param += "&" + pname + "=" + pvalue;
				}
				i++;
			}
		}

		return param;
	}

	/**
	 * 请求参数格式为JSON方式：key=JSON串
	 * 
	 * @param parameters
	 * @return
	 */
	private String getParamStrOfJson(Map<String, Object> parameters) {
		String param = "";

		if (MapUtils.isNotEmpty(parameters)) { // 拼接参数
			param = REST_PMS + "=" + new JsonMapper().toJson(parameters);
		}

		return param;
	}

	private final HttpURLConnection getConnection(String urlStr, String method) {
		URL url = null;
		HttpURLConnection httpConnection = null;
		try {
			url = new URL(urlStr);
			httpConnection = (HttpURLConnection) url.openConnection();
			httpConnection.setRequestMethod(method);
			httpConnection.setDoInput(true);
			httpConnection.setDoOutput(true);
			httpConnection.connect();
		} catch (Exception e) {
			e.printStackTrace();

		}

		return httpConnection;
	}

	private final void write(HttpURLConnection httpConnection, String param) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(
					httpConnection.getOutputStream()));
			bw.write(param);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private String read(HttpURLConnection httpConnection) {
		StringBuffer sb = new StringBuffer("");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(
					httpConnection.getInputStream(), "utf-8"));
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();

			if (br != null) {
				try {
					br.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
		return sb.toString();
	}
}
