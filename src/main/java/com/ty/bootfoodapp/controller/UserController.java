package com.ty.bootfoodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bootfoodapp.dto.Login;
import com.ty.bootfoodapp.dto.UserDto;
import com.ty.bootfoodapp.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/users")
	public UserDto saveUser(@RequestBody UserDto dto) {
		return service.saveUserDto(dto);
	}
	@GetMapping("/users/{id}")
	public UserDto getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	@GetMapping("/users")
	public List<UserDto> getAllUsers(){
		return service.getAllUser();
	}
	@PutMapping("users/{id}")
	public UserDto updateUser(@PathVariable int id, @RequestBody UserDto dto) {
		return service.updateUser(id, dto);
	}
	@DeleteMapping("users/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUserByid(id);
	}
	@PostMapping("/users/login")
	public List<UserDto> validateUser(@RequestBody Login login){
		return service.validateUser(login.getEmail(), login.getPassword());
	}

}
