package com.ty.bootfoodapp.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.bootfoodapp.dto.FoodOrderDto;

public interface FoodOrderRepository extends JpaRepository<FoodOrderDto, Integer>{
	//List<FoodOrderDto> findByCustomerName(String customerName);

}
