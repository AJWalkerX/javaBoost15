package com.ajwalker.user_defined_exception3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
	List<User> users;
	
	public UserRepository(){
		this.users = new ArrayList<>();
		users.add(new User("Ayhaan"));
		users.add(new User("Berk"));
		users.add(new User("Bhar"));
		users.add(new User("Su"));
		users.add(new User("Can"));
		users.add(new User("Emel"));
	}
	/*
	* Bu method dışarından gönderilen isimde bir kullanıcı bulursa o kullanıcıya geri dön
	* Eğer bulunamazsa null dön. (Exception)
	* @param name
	* @return
	* */
	public  User getUserByName(String name) throws UserNotFoundException {
		Optional<User> optionalUser =
				users.stream()
				     .filter(user -> user.getName().equalsIgnoreCase(name))
				     .findFirst();
		return optionalUser.orElseThrow(()-> new UserNotFoundException(ErrorType.REPOSITORY_USER_NOTFOUND));
	}
	
	public List<User> getUserListByName(String name) throws UserNotFoundException {
		List<User> list = users.stream().filter(user -> user.getName().contains(name)).toList();
		if (list.isEmpty()){
			throw new UserNotFoundException(ErrorType.REPOSITORY_USER_NOTFOUND, "Aradığınız kriterlerde bir kullanıcı" +
					" bulunamadı");
		}
		return list;
	}
}