package bootcamps.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product_line")
public class ProductLine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_line_id")
	private Long product_line_id;

	@NotNull
	@Column(name = "product_quantity")
	private Long productQuantity;

	@NotNull
	@Column(name = "product_price")
	private Double productPrice;

	@OneToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne
	@JoinColumn(name= "user_cart_id")
	private Cart userCart;

	public Cart getUserCart() {
		return userCart;
	}

	public void setUserCart(Cart userCart) {
		this.userCart = userCart;
	}

	public ProductLine() {

	}
	public ProductLine(Long product_line_id) {
		
		this.product_line_id=product_line_id;
	}

	public ProductLine(Product product,Long productQuantity,Double productPrice,Cart userCart) {

		this.product=product;
		this.productQuantity=productQuantity;
		this.productPrice=productPrice;
		this.userCart=userCart;
	}

	
	public Long getProduct_line_id() {
		return product_line_id;
	}

	public void setProduct_line_id(Long product_line_id) {
		this.product_line_id = product_line_id;
	}

	public Long getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Long productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	

}
