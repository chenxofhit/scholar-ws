package com.chenx.scholar;

/**
 * 
 * 自定义视图
 * 
 * 
 * @author chenx<chenxofhit@gmail.com>
 * @since 2018-03-26
 *
 */
public class MyJsonView {
	
	private boolean success = false;
	
	private int code = 200;
	
	private Object msg = "";
	
	private String token;


	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public MyJsonView() {
		this.success = true;
	}

	public MyJsonView success() {
		this.success = true;
		return this;
	}

	public MyJsonView success(String  token) {
		this.code = 200;
		this.success = true;
		this.msg = "success";
		this.token = token;
		return this;
	}

	public MyJsonView successMsg(Object  msg) {
		this.code = 200;
		this.success = true;
		this.msg = msg;
		return this;
	}
	
	public MyJsonView failure() {
		this.success = false;
		return this;
	}
	
	public MyJsonView failureMsg(Object  msg) {
		this.code = 200;
		this.success = false;
		this.msg = msg;
		return this;
	}

	
	public MyJsonView failure(Integer code, String msg) {
		this.success =false;
		this.code = code;
		this.msg = msg;
		return this;
	}
}
