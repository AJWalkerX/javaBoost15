package com.ajwalker.optional;

public class UserRunner {
	public static void main(String[] args) {
		User user = new User("deneme@gmail.com", "123");
		user.getAddress().ifPresent(o -> {
			o.toLowerCase();
			System.out.println(o);
		});
	}
}