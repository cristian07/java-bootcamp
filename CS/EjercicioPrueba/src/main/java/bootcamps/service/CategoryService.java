package bootcamps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bootcamps.dao.ProductCategoryDao;
import bootcamps.entities.ProductCategory;

@Service
public class CategoryService {

	@Autowired
	private ProductCategoryDao _categoryDao;

	public String createCategory(String productCategoryName) {
		try {
			ProductCategory category = new ProductCategory(productCategoryName);
			_categoryDao.save(category);
		} catch (Exception ex) {
			return "Error creating the Category: " + ex.toString();
		}
		return "Category succesfully created!";
	}

	public String deleteCategory(long productCategoryId) {
		try {
			ProductCategory category = new ProductCategory(productCategoryId);
			_categoryDao.delete(category);
		} catch (Exception ex) {
			return "Error deleting the Category:" + ex.toString();
		}
		return "Category succesfully deleted!";
	}

	public String getByCategoryName(String productCategoryName) {
		String categoryId;
		try {
			ProductCategory category = _categoryDao.findByProductCategoryName(productCategoryName);
			categoryId = String.valueOf(category.getProductCategoryId());
		} catch (Exception ex) {
			return "Category not found";
		}
		return "The Category ID is: " + categoryId;
	}

	public String getByCategoryId(Long productCategoryId) {
		String categoryName;
		try {
			ProductCategory category = _categoryDao.findByProductCategoryId(productCategoryId);
			categoryName = String.valueOf(category.getProductCategoryName());
		} catch (Exception ex) {
			return "Category not found";
		}
		return "The Category name is: " + categoryName;
	}
}
