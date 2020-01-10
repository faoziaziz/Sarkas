package com.labseni.Sarkas.Controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labseni.Sarkas.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("/member")
@Api(value="Sexy management System", description = "Sexy mantap")
public class MemberController {
	
	@ApiOperation(value = "get all member")
	@GetMapping(path="/all")	
	public String getAllMember() {
		/* will give returnall member of labseni */
		return "Hello Crot";
	}
	
	/*
	@ApiOperation(value="Post method")
	@PostMapping(path="/postcrot")
	public User helloPost(
			@ApiParam(value = "Employee object store in database table", required = true) 
			@Valid @RequestBody User user){
		
		return userRepository.save(user);
	}
	*/
	

}
