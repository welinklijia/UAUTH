package com.boco.unitive.rule.core;

import com.alibaba.fastjson.JSON;

/*
 * 封装http响应消息体
 */
public class ResponseBody {
	private int code;
	private Object obj;
	private String message;
	public int getCode() {
		return code;
	}
	public ResponseBody setCode(ResponseCode code) {
		this.code = code.getCode();
		return this;
	}
	public Object getObj() {
		return obj;
	}
	public ResponseBody setObj(Object obj) {
		this.obj = obj;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public ResponseBody setMessage(String message) {
		this.message = message;
		return this;
	}
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	
}
