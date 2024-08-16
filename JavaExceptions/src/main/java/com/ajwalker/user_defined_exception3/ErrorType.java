package com.ajwalker.user_defined_exception3;

public enum ErrorType {
	REPOSITORY_USER_NOTFOUND(1001, "Aradığınız kullanıcı bulunamadı");
	private  int code;
	private String message;
	
	ErrorType(){
	}
	ErrorType(int code, String message){
		this.code = code;
		this.message = message;
	}
	
	public int getCode(){
		return code;
	}
	
	public String getMessage(){
		return message;
	}
}