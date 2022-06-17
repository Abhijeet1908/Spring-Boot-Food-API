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

import com.ty.bootfoodapp.dto.FoodOrderDto;
import com.ty.bootfoodapp.service.FoodOrderService;

@RestController
public class FoodOrderController {
	@Autowired
	FoodOrderService service;
	
	@PostMapping("/foodorders")
	public FoodOrderDto saveFoodOrder(@RequestBody FoodOrderDto dto) {
		return service.saveFoodOrder(dto);
	}
	@GetMapping("/foodorders/{id}")
	public FoodOrderDto getFoodOrderById(@PathVariable int id) {

		return service.getFoodOrderById(id);

	}
	@GetMapping("/foodorders")
	public List<FoodOrderDto> getAllFoodOrder() {
		return service.getAllFoodOrder();

	}
	
//	@GetMapping("/foodorders/{customername}")
//	public List<FoodOrderDto> getFoodOrdersByName(@PathVariable String customerName) {
//
//		return service.getFoodOrdersByName(customerName);
//
//	}
	@DeleteMapping("/foodOrders")
	public String deleteFoodOrderByid(@RequestParam int id) {

		return service.deleteFoodOrderByid(id);

	}

	@PutMapping("/foodorders")
	public FoodOrderDto updateFoodOrder(@RequestParam int id,@RequestBody FoodOrderDto dto) {
		
			return service.updateFoodOrder(id, dto);
		}

	

}
