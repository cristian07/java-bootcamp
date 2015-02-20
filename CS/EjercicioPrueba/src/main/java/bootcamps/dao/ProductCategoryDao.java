package bootcamps.dao;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import bootcamps.entities.ProductCategory;


@Transactional
public interface ProductCategoryDao extends CrudRepository<ProductCategory,Long>{

	Iterable<ProductCategory> findAll();
	public ProductCategory findByProductCategoryName(String productCategoryName);
	public ProductCategory findByProductCategoryId(Long productCategoryId);
}
