package com.globant.cristian.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.globant.cristian.entities.Cart;

@Transactional
public interface UserCartDao extends CrudRepository<Cart, Long> {

}
