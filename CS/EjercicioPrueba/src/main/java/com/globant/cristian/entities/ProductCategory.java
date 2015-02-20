package com.globant.cristian.entities;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product_category")
public class ProductCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="product_category_id")
	private Long productCategoryId;

	@NotNull
	@Column(name = "product_category_name")
	private String productCategoryName;
	

	@OneToMany(mappedBy = "productCategory")
	private Collection<Product> product;

	
	public ProductCategory(){
		
	}
	public ProductCategory(Long productCategoryId) {
		this.productCategoryId=productCategoryId;

	}

	public ProductCategory(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public Collection<Product> getProduct() {
		return product;
	}

	public void CollectionProduct(Collection<Product> product) {
		this.product = product;
	}

}
