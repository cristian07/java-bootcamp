package com.globant.cristian.controller;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globant.cristian.service.UserService;

@Controller
public class UserController {

	@Inject
	UserService service;

	public UserController() {

	}

	@RequestMapping("/createUser")
	@ResponseBody
	public String createUser(String userName, String password) {
		return service.createUser(userName, password);
	}

	@RequestMapping("/updateUser")
	@ResponseBody
	public String updateUser(Long userId, String userName, String password) {
		return service.updateUser(userId, userName, password);
	}
}
