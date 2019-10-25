package com.boco.unitive.rule.core;

public class ResponseGenerator {
	private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
	public static ResponseBody genSuccessResult(){
		return new ResponseBody().setCode(ResponseCode.SUCCESS)
				.setMessage(DEFAULT_SUCCESS_MESSAGE);
	}
	public static ResponseBody genSuccessResult(Object object){
		return new ResponseBody().setCode(ResponseCode.SUCCESS)
				.setMessage(DEFAULT_SUCCESS_MESSAGE)
				.setObj(object);
	}
	public static ResponseBody genFailResult(String message){
		return new ResponseBody().setCode(ResponseCode.FAIL)
				.setMessage(message);
	}
}
