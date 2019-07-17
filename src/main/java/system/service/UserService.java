package system.service;

import system.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.model.User;

import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserDAO userDao;

	public List<User> gettAllUsers() {
		return userDao.getAllUsers();
	}
}
