package bootcamps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamps.dao.ProductLineDao;
import bootcamps.entities.Cart;
import bootcamps.entities.Product;
import bootcamps.entities.ProductLine;


@Service
public class ProductLineService {

	@Autowired
	private ProductLineDao _productLineDao;
	
	
	
	public String createProductLine(Product product,Long productQuantity,Double productPrice,Cart userCart) {
		try {
			ProductLine line = new ProductLine(product,productQuantity,productPrice,userCart);
			_productLineDao.save(line);
		} catch (Exception ex) {
			return "Error generating the new Line: " + ex.toString();
		}
		return "Product to Buy succesfully generated!";
	}
	
	public String deleteProductLine(long productLineId) {
		try {
			ProductLine line = new ProductLine(productLineId);
			_productLineDao.delete(line);
		} catch (Exception ex) {
			return "Error deleting the Product Line:" + ex.toString();
		}
		return "Product Line succesfully deleted!";
	}
}
