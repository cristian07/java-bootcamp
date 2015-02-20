package com.globant.cristian.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.globant.cristian.dao.ProductDao;
import com.globant.cristian.entities.Product;
import com.globant.cristian.entities.ProductCategory;

@Service
public class ProductService {

	@Autowired
	private ProductDao _productDao;

	
	public String createProduct(String productName, ProductCategory productCategory) {
		try {
			Product product = new Product(productName, productCategory);
			_productDao.save(product);
		} catch (Exception ex) {
			return "Error creating the Category: " + ex.toString();
		}
		return "Product succesfully created!";
	}
/*
	public Iterable<Product> listProduct(){
		
		return _productDao.findAll();
		
	}*/
	public List<Product> getAllProductsAsProductDTO(Long categoryId) {
		List<Product> product = _productDao.findAll();
		for (Product p : product) {
			if (p.getProductCategory().equals(categoryId)) {
				System.out.println(p.getProductName());
				System.out.println(p.getId());
			}
		}return _productDao.findAll();
	}
	/*
	private ProductDto constructProductDTO(Product product) {
	    ProductDto productDTO = new ProductDto();
	    productDTO.setProductId(product.getId());
	    productDTO.setProductName(product.getProductName());
	    productDTO.setCategory(product.getProductCategory());
	    return productDTO;
	}*/
	
	
	/*public String filtrarProduct(ProductCategory productCategory){
		
			Product product = _productDao.findOne(productCategory);
			if(product.equals(productCategory)){
			product.getProductName();
			product.getId();
			}
		
			return "Error updating the user: " + product.getProductName()+" "+product.getId();
		}*/
}