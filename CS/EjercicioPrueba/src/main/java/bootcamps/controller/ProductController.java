package bootcamps.controller;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import bootcamps.entities.ProductCategory;
import bootcamps.service.ProductService;

@Controller
public class ProductController {

	@Inject
	ProductService service;

	public ProductController() {

	}

	@RequestMapping("/createProduct")
	@ResponseBody
	public String createProduct(String productName, ProductCategory productCategory) {

		return service.createProduct(productName, productCategory);

	}
	
	
}

