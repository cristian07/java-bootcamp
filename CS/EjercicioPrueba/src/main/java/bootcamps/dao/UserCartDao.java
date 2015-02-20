package bootcamps.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import bootcamps.entities.Cart;

@Transactional
public interface UserCartDao extends CrudRepository<Cart, Long> {

}
