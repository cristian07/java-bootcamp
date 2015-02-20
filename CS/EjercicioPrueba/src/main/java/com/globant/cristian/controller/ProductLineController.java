package com.globant.cristian.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globant.cristian.dto.ProductLineDto;
import com.globant.cristian.entities.Cart;
import com.globant.cristian.entities.Product;
import com.globant.cristian.entities.User;
import com.globant.cristian.service.ProductLineService;

@Controller
public class ProductLineController {

	@Inject
	ProductLineService service;

	public ProductLineController() {

	}

	@RequestMapping("/addItemToCart")
	@ResponseBody
	public ProductLineDto createProductLine( Product product,Long productQuantity, Double productPrice, User user, Cart cart) {
		return service.createProductLine(productQuantity, product, productPrice, user, cart);
	}
/*
	@RequestMapping("/deleteProductLine")
	@ResponseBody
	public String deleteProductLine(long productLineId) {
		return service.deleteProductLine(productLineId);
	}*/
}
