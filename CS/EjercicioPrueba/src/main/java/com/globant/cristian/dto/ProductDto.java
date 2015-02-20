package com.globant.cristian.dto;

import com.globant.cristian.entities.ProductCategory;

public class ProductDto {

	private String 			productName;
	private Long 			productId;
	private ProductCategory category;
	
	public ProductDto() {

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

}
