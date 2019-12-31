/*
	Hello controller 
*/

package com.labseni.Sarkas.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

//import net.guides.springboot2.springboot2swagger2.exception.ResourceNotFoundException;
//import net.guides.springboot2.springboot2swagger2.model.Employee;
//import net.guides.springboot2.springboot2swagger2.repository.EmployeeRepository;

import com.labseni.Sarkas.model.User;
import com.labseni.Sarkas.model.UserRepository;

@RestController
@RequestMapping("/")
@Api(value="Sexy management System", description = "Sexy mantap")
public class HelloController {
	@Autowired
	private UserRepository userRepository;

	@ApiOperation(value = "View list of available emplotess")

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@ApiOperation(value = "get all user")
	@GetMapping(path="/")
	public String helloWorld() {	
		return "Check dengan Spring";
	}

	@GetMapping(path="/crot")
	public String helloCrot() {
		return "Hello Crot";
	}
	
	
	

}
