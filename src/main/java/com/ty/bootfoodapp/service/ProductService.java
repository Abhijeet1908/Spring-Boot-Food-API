package com.ty.bootfoodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.bootfoodapp.dao.ProductsDao;
import com.ty.bootfoodapp.dto.ProductDto;

@Service
public class ProductService {
	@Autowired
	ProductsDao dao;

	public ProductDto saveProductDto(ProductDto dto) {
		return dao.saveProductDto(dto);
	}

	public ProductDto getProductById(int id) {

		return dao.getProductById(id);
	}

	public List<ProductDto> getAllPrducts() {
		return dao.getAllPrducts();

	}

	public List<ProductDto> getProductsByName(String name) {
		return dao.getProductsByName(name);

	}

	public String deleteProducrByid(int id) {

		return dao.deleteProducrByid(id);

	}
	public ProductDto updateProduct(int id, ProductDto dto) {
		
			return dao.updateProduct(id, dto);
		
	}
	


}
