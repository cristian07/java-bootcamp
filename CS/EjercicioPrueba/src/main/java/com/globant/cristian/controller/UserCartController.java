package com.globant.cristian.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.globant.cristian.dto.CartDto;
import com.globant.cristian.service.CartService;

@Controller
public class UserCartController {

	@Inject
	CartService service;

	public UserCartController() {
	}

	@RequestMapping("/createCart")
	@ResponseBody
	public CartDto createCart(Long userId) {
		return service.createCart(userId);
	}

}
