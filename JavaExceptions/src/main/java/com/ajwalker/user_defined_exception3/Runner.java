package com.ajwalker.user_defined_exception3;

public class Runner {
	public static void main(String[] args) {
		UserRepository repository = new UserRepository();
		User su = null;
		try {
			su = repository.getUserByName("Salih");
			System.out.println(su);
		}
		catch (UserNotFoundException e) {
			System.err.print(e.getErrorType().getCode()+ " ");
			System.err.println(e.getErrorType().getMessage());
		}
		
		
		try {
			repository.getUserListByName("aw").forEach(System.out::println);
		}
		catch (UserNotFoundException e) {
			System.err.print(e.getErrorType().getCode()+ " ");
			System.err.println(e.getMessage());
		}
	}
}