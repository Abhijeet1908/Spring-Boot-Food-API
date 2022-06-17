package com.ty.bootfoodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bootfoodapp.dto.ProductDto;
import com.ty.bootfoodapp.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	@PostMapping("/products")
	public ProductDto saveProductDto(@RequestBody ProductDto dto) {
		return service.saveProductDto(dto);
	}
	@GetMapping("/products/{id}")
	public ProductDto getProductById(@PathVariable int id) {

		return service.getProductById(id);
	}
	@GetMapping("/products")
	public List<ProductDto> getAllPrducts() {
		return service.getAllPrducts();

	}
	@GetMapping("/productsname")
	public List<ProductDto> getProductsByName(@RequestParam String name) {
		return service.getProductsByName(name);

	}
	@DeleteMapping("/products/{id}")
	public String deleteProducrByid(@PathVariable int id) {

		return service.deleteProducrByid(id);

	}
	@PutMapping("/products/{id}")
	public ProductDto updateProduct(int id, ProductDto dto) {
		
			return service.updateProduct(id, dto);
		
	}

}
