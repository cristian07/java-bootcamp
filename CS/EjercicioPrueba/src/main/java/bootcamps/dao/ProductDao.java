package bootcamps.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import bootcamps.entities.Product;


@Transactional
public interface ProductDao extends CrudRepository<Product,Long> {

	Product findById(long id);
	Iterable<Product> findAll();
	//Product findOne(ProductCategory productCategory);
}
