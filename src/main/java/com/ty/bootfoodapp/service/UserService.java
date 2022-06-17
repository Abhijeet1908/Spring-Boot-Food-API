package com.ty.bootfoodapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.bootfoodapp.dao.UserDao;
import com.ty.bootfoodapp.dto.UserDto;

@Service
public class UserService {
	@Autowired
	UserDao dao;

	public UserDto saveUserDto(UserDto dto) {
		return dao.saveUserDto(dto);
	}

	public UserDto getUserById(int id) {

		return dao.getUserById(id);

	}

	public List<UserDto> getAllUser() {
		return dao.getAllUser();

	}

	public String deleteUserByid(int id) {

		return dao.deleteUserByid(id);

	}

	public UserDto updateUser(int id, UserDto dto) {

		return dao.updateUser(id, dto);

	}
	public List<UserDto> validateUser(String email,String password){
		return dao.validateUser(email, password);
	}

}
