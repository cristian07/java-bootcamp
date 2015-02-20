package com.globant.cristian.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cartList")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private long cartId;

	@OneToMany(mappedBy = "cart")
	private Set<ProductLine> productLine;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Cart() {

	}

	public Cart(User user) {

		this.user = user;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public Set<ProductLine> getProductLine() {
		return productLine;
	}

	public void setProductLine(Set<ProductLine> productLine) {
		this.productLine = productLine;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
