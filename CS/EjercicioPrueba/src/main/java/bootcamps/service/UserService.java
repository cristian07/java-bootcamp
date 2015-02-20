package bootcamps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bootcamps.dao.UserDao;
import bootcamps.entities.User;

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
}
