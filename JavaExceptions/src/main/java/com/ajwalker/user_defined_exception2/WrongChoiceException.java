package com.ajwalker.user_defined_exception2;

public class WrongChoiceException extends RuntimeException{
	public WrongChoiceException(String message) {
		super(message);
	}
	
	public WrongChoiceException() {
	}
}