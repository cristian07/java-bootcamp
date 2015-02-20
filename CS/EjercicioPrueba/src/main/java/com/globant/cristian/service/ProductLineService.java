package com.globant.cristian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.cristian.dao.ProductLineDao;
import com.globant.cristian.dto.ProductLineDto;
import com.globant.cristian.entities.Cart;
import com.globant.cristian.entities.Product;
import com.globant.cristian.entities.ProductLine;
import com.globant.cristian.entities.User;


@Service
public class ProductLineService {

	@Autowired
	private ProductLineDao _productLineDao;
	
	
	
	public ProductLineDto createProductLine(Long productQuantity,Product product,Double productPrice, User user,Cart cart) {
		try {
			ProductLine line = new ProductLine(productQuantity,product,productPrice,user,cart);
			_productLineDao.save(line);
		} catch (Exception ex) {
			return new ProductLineDto("Error generating the new Line: " + ex.toString());
		}
		return new ProductLineDto("Product to Buy succesfully generated!");
	}
/*	
	public String deleteProductLine(long productLineId) {
		try {
			ProductLine line = new ProductLine(productLineId);
			_productLineDao.delete(line);
		} catch (Exception ex) {
			return "Error deleting the Product Line:" + ex.toString();
		}
		return "Product Line succesfully deleted!";
	}*/
	
	}

