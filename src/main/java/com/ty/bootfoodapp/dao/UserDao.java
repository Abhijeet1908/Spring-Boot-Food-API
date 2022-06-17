package com.ty.bootfoodapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bootfoodapp.dto.UserDto;
import com.ty.bootfoodapp.respository.UserDtoRepository;

@Repository
public class UserDao {
	@Autowired
	UserDtoRepository repository;

	public UserDto saveUserDto(UserDto dto) {
		return repository.save(dto);
	}

	public UserDto getUserById(int id) {
		Optional<UserDto> opt = repository.findById(id);
		if (opt.isEmpty()) {
			return null;
		} else {
			return opt.get();
		}
	}

	public List<UserDto> getAllUser() {
		return repository.findAll();

	}

	public String deleteUserByid(int id) {
		Optional<UserDto> opt = repository.findById(id);
		if (opt.isEmpty()) {
			return "No User found to delete";
		} else {

			UserDto dto = opt.get();
			repository.delete(dto);
			return "User Deleted sucessfully";
		}
	}

	public UserDto updateUser(int id, UserDto dto) {
		Optional<UserDto> opt = repository.findById(id);
		if (opt.isEmpty()) {
			return null;
		} else {

			return repository.save(dto);
		}
	}
	
	public List<UserDto> validateUser(String email,String password){
		return repository.validateUser(email, password);
	}

}
