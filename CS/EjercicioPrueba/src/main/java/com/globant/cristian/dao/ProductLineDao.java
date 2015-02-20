package com.globant.cristian.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.globant.cristian.entities.ProductLine;


@Transactional
public interface ProductLineDao extends CrudRepository<ProductLine,Long> {

	
}
