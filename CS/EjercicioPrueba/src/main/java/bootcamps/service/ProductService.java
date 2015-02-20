package bootcamps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamps.dao.ProductDao;
import bootcamps.entities.Product;
import bootcamps.entities.ProductCategory;

@Service
public class ProductService {

	@Autowired
	private ProductDao _productDao;

	
	public String createProduct(String productName, ProductCategory productCategory) {
		try {
			Product product = new Product(productName, productCategory);
			_productDao.save(product);
		} catch (Exception ex) {
			return "Error creating the Category: " + ex.toString();
		}
		return "Category succesfully created!";
	}


	/*public String filtrarProduct(ProductCategory productCategory){
		
			Product product = _productDao.findOne(productCategory);
			if(product.equals(productCategory)){
			product.getProductName();
			product.getId();
			}
		
			return "Error updating the user: " + product.getProductName()+" "+product.getId();
		}*/
}