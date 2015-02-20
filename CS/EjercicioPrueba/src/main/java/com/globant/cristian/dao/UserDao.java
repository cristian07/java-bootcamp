package com.globant.cristian.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.globant.cristian.entities.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
	
	public User findOne(Long userId);
	//public User findByName(String userName);
	//public User findByPass(String password);

}
