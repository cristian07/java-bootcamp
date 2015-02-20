package com.globant.cristian.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long userId;

	@NotNull
	@Column(name = "user_name")
	private String userName;

	@NotNull
	@Column(name = "password")
	private String password;

	@OneToMany(mappedBy = "user")
	private Set<Cart> cart;

	@OneToMany(mappedBy = "user")
	private Set<ProductLine> productLine;
	
	public User() {

	}

	public User(Long userId){
		this.userId = userId;
		
	}
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public long getUserId() {
		return userId;
	}

	public Set<ProductLine> getProductLine() {
		return productLine;
	}

	public void setProductLine(Set<ProductLine> productLine) {
		this.productLine = productLine;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Cart> getCart() {
		return cart;
	}

	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}

	
}
