package com.globant.cristian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.globant.cristian.dao.UserDao;
import com.globant.cristian.entities.User;

@Service
public class UserService {

	@Autowired
	private UserDao _userDao;

	public String createUser(String userName, String password) {
		try {
			User user = new User(userName, password);
			_userDao.save(user);
		} catch (Exception ex) {
			return "Error creating the User: " + ex.toString();
		}
		return "User succesfully created!";
	}

	public String updateUser(Long userId, String userName, String password) {
		try {
			User user = _userDao.findOne(userId);
			user.setUserName(userName);
			user.setPassword(password);
			_userDao.save(user);
		} catch (Exception ex) {
			return "Error updating the user: " + ex.toString();
		}
		return "User succesfully updated!";
	}
	
	/*public String logIn(String userName,String password){
		
		User user = _userDao.findByName(userName);
		if(user.equals(userName)){
			User pass= _userDao.findByPass(password);
			if(pass.equals(password)){
				
			}
		}else return "User or password incorrect";
		return "Login ok";
	}
	*/
	
	
}
