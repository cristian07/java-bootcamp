package bootcamps.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import bootcamps.entities.ProductLine;


@Transactional
public interface ProductLineDao extends CrudRepository<ProductLine,Long> {

	
}
