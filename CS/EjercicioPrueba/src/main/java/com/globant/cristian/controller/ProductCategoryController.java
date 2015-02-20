package com.globant.cristian.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globant.cristian.service.CategoryService;

@Controller
public class ProductCategoryController {

	@Inject
	CategoryService service;

	public ProductCategoryController() {

	}

	@RequestMapping("/createCategory")
	@ResponseBody
	public String createCategory(String productCategoryName) {
		return service.createCategory(productCategoryName);

	}

	@RequestMapping("/deleteCategory")
	@ResponseBody
	public String deleteCategory(long productCategoryId) {
		return service.deleteCategory(productCategoryId);

	}

	@RequestMapping("/get-by-categoryName")
	@ResponseBody
	public String getByCategoryName(String productCategoryName) {
		return service.getByCategoryName(productCategoryName);

	}

	@RequestMapping("/get-by-categoryId")
	@ResponseBody
	public String getByCategoryId(Long productCategoryId) {
		return "";// service.getByCategoryId(productCategoryId);

	}
}
