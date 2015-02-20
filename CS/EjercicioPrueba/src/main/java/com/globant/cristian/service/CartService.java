package com.globant.cristian.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.cristian.dao.UserCartDao;
import com.globant.cristian.dao.UserDao;
import com.globant.cristian.dto.CartDto;
import com.globant.cristian.entities.*;

@Service
public class CartService {

	@Autowired
	private UserCartDao _userCartDao;
	@Autowired
	private UserDao _userDao;

	public CartDto createCart(Long userId) {
		try {
			User user=_userDao.findOne(userId);
			Cart cart = new Cart(user);
			_userCartDao.save(cart);
		} catch (Exception ex) {
			return new CartDto("Error creating the Cart: " + ex.toString());
		}
		return new CartDto("Cart succesfully created!");
	}

}
	