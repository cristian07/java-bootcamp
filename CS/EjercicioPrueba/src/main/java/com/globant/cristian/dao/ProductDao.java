package com.globant.cristian.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.globant.cristian.entities.Product;


@Transactional
public interface ProductDao extends CrudRepository<Product,Long> {

	Product findById(long id);
	List<Product> findAll();
	//Product findOne(ProductCategory productCategory);
}
