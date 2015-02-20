package com.globant.cristian.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globant.cristian.entities.Product;
import com.globant.cristian.entities.ProductCategory;
import com.globant.cristian.service.ProductService;

@Controller
public class ProductController {

	@Inject
	ProductService service;

	public ProductController() {

	}

	@RequestMapping("/createProduct")
	@ResponseBody
	public String createProduct(String productName, ProductCategory productCategory) {

		return service.createProduct(productName, productCategory);

	}
	@RequestMapping("/ListProduct")
	@ResponseBody
	public List<Product> getAllProductsAsProductDTO(Long categoryId){
		return service.getAllProductsAsProductDTO(categoryId);
	}
}

