package com.cg.hims.service;

import com.cg.hims.entities.User;

public interface IUserService {
	public User addNewUser(User user);

	public User signIn(User user);

	public User signOut(User user);
}
