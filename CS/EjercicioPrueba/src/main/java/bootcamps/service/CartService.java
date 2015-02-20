package bootcamps.service;

import java.util.ArrayList;

import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamps.dao.UserCartDao;
import bootcamps.entities.*;

@Service
public class CartService {

	@Autowired
	private UserCartDao _userCartDao;

	public String createCart(User user) {
		try {
			Cart cart = new Cart(user);
			_userCartDao.save(cart);
		} catch (Exception ex) {
			return "Error creating the Category: " + ex.toString();
		}
		return "Cart succesfully created!";
	}

	public String listProduct(ProductLine productLine) {
		ArrayList<ProductLine> p = new ArrayList<ProductLine>();
		p.add(productLine);
		return "Product added to cart: " + productLine.getProduct().getProductName();
	}

	
}
	