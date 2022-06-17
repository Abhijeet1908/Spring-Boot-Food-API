package com.ty.bootfoodapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bootfoodapp.dto.ProductDto;
import com.ty.bootfoodapp.respository.ProductDtoRepository;

@Repository
public class ProductsDao {

	@Autowired
	ProductDtoRepository repository;

	public ProductDto saveProductDto(ProductDto dto) {
		return repository.save(dto);
	}

	public ProductDto getProductById(int id) {
		Optional<ProductDto> opt = repository.findById(id);
		if (opt.isEmpty()) {
			return null;
		} else {
			return opt.get();
		}
	}

	public List<ProductDto> getAllPrducts() {
		return repository.findAll();

	}

	public List<ProductDto> getProductsByName(String name) {
		List<ProductDto> list = repository.findByName(name);
		if (list.isEmpty()) {
			return null;
		} else {
			return list;
		}
	}

	public String deleteProducrByid(int id) {
		Optional<ProductDto> opt = repository.findById(id);
		if (opt.isEmpty()) {
			return "No product found to delete";
		} else {

			ProductDto dto = opt.get();
			repository.delete(dto);
			return "Product Deleted sucessfully";
		}
	}

	public ProductDto updateProduct(int id, ProductDto dto) {
		Optional<ProductDto> opt = repository.findById(id);
		if (opt.isEmpty()) {
			return null;
		} else {

			return repository.save(dto);
		}
	}

}
