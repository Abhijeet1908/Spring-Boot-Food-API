package com.ty.bootfoodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.bootfoodapp.dao.FoodOrderDao;
import com.ty.bootfoodapp.dto.FoodOrderDto;
import com.ty.bootfoodapp.dto.ItemDto;

@Service
public class FoodOrderService {
	@Autowired
	FoodOrderDao dao;

	public FoodOrderDto saveFoodOrder(FoodOrderDto dto) {
		double totalcost= 0;
		for(ItemDto item: dto.getItems()) {
			totalcost+=(item.getPrice()*item.getQuantity());
		}
		dto.setTotalCost(totalcost);
		return dao.saveFoodOrder(dto);
	}

	public FoodOrderDto getFoodOrderById(int id) {

		return dao.getFoodOrderById(id);

	}

	public List<FoodOrderDto> getAllFoodOrder() {
		return dao.getAllFoodOrder();

	}
//
//	public List<FoodOrderDto> getFoodOrdersByName(String customerName) {
//
//		return dao.getFoodOrdersByName(customerName);
//
//	}

	public String deleteFoodOrderByid(int id) {

		return dao.deleteFoodOrderByid(id);

	}

	public FoodOrderDto updateFoodOrder(int id, FoodOrderDto dto) {
		
			return dao.updateFoodOrder(id, dto);
		}

}
