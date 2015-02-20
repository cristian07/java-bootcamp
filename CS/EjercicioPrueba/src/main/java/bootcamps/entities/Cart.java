package bootcamps.entities;

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
@Table(name = "user_cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_cart_id")
	private long userCartid;

	@OneToMany(mappedBy = "userCart")
	private Set<ProductLine> productLine;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	

	public Cart() {

	}

	public Cart(User user) {

		this.user = user;
	}
	
	public long getUserCartid() {
		return userCartid;
	}

	public void setUserCartid(long userCartid) {
		this.userCartid = userCartid;
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
