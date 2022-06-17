package com.ty.bootfoodapp.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.bootfoodapp.dto.ProductDto;

public interface ProductDtoRepository extends JpaRepository<ProductDto, Integer>{
	
	List<ProductDto> findByName(String name);

}
