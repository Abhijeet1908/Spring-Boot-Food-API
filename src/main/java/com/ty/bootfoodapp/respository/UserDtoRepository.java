package com.ty.bootfoodapp.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ty.bootfoodapp.dto.UserDto;

public interface UserDtoRepository extends JpaRepository<UserDto, Integer>{
	@Query("SELECT u FROM UserDto u WHERE u.email=:myemail AND u.password = :mypassword")
	List<UserDto> validateUser(@Param("myemail")String e, @Param("mypassword")String p); 

}
