package com.ajwalker.user_defined_exception;
// checked için Exception
//unchecked için RuntimeException
public class NotOutOfBoundsException extends Exception{
	public NotOutOfBoundsException(){
		super();
	}
	public NotOutOfBoundsException(String message){
		super(message);
	}
}