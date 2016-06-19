package com.lu.common;

public class ResultVo {
	/**
	 * 返回的msg
	 */
	private String msg;
	/**
	 * 错误值
	 */
	private int value;
	/**
	 * 是否成功
	 */

	private boolean success;
	/**
	 * 数据
	 */
	private Object data;

	public ResultVo(String msg, int value, boolean success, Object data) {
		super();
		this.msg = msg;
		this.value = value;
		this.success = success;
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
