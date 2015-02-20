package bootcamps.controller;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import bootcamps.entities.Product;
import bootcamps.entities.Cart;
import bootcamps.service.ProductLineService;

@Controller
public class ProductLineController {

	@Inject
	ProductLineService service;

	public ProductLineController() {

	}

	@RequestMapping("/generateProductLine")
	@ResponseBody
	public String createProductLine(Product product, Long productQuantity, Double productPrice, Cart userCart) {
		return service.createProductLine(product, productQuantity, productPrice, userCart);
	}

	@RequestMapping("/deleteProductLine")
	@ResponseBody
	public String deleteProductLine(long productLineId) {
		return service.deleteProductLine(productLineId);
	}
}
