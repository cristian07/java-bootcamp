package bootcamps.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bootcamps.entities.ProductLine;
import bootcamps.entities.User;
import bootcamps.service.CartService;

@Controller
public class UserCartController {

	@Inject
	CartService service;

	public UserCartController() {
	}

	@RequestMapping("/createCart")
	@ResponseBody
	public String createCart(User user) {
		return service.createCart(user);
	}

	@RequestMapping("/addToCart")
	@ResponseBody
	public String listProduct(ProductLine productLine){
		return service.listProduct(productLine);
	}
	
}
