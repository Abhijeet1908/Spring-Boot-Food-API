package com.ty.bootfoodapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bootfoodapp.dto.FoodOrderDto;
import com.ty.bootfoodapp.respository.FoodOrderRepository;

@Repository
public class FoodOrderDao {
	@Autowired
	FoodOrderRepository repository;

	public FoodOrderDto saveFoodOrder(FoodOrderDto dto) {
		return repository.save(dto);
	}

	public FoodOrderDto getFoodOrderById(int id) {
		Optional<FoodOrderDto> opt = repository.findById(id);
		if (opt.isEmpty()) {
			return null;
		} else {
			return opt.get();
		}
	}

	public List<FoodOrderDto> getAllFoodOrder() {
		return repository.findAll();

	}

//	public List<FoodOrderDto> getFoodOrdersByName(String customerName) {
//		List<FoodOrderDto> list = repository.findByCustomerName(customerName);
//		if (list.isEmpty()) {
//			return null;
//		} else {
//			return list;
//		}
//	}

	public String deleteFoodOrderByid(int id) {
		Optional<FoodOrderDto> opt = repository.findById(id);
		if (opt.isEmpty()) {
			return "No Order found to delete";
		} else {

			FoodOrderDto dto = opt.get();
			repository.delete(dto);
			return "Order Deleted sucessfully";
		}
	}

	public FoodOrderDto updateFoodOrder(int id, FoodOrderDto dto) {
		Optional<FoodOrderDto> opt = repository.findById(id);
		if (opt.isEmpty()) {
			return null;
		} else {

			return repository.save(dto);
		}
	}

}
