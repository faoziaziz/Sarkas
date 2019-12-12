package com.labseni.Sarkas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.labseni.Sarkas.model.User;
import com.labseni.Sarkas.model.UserRepository;

@RestController
public class HelloController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/")
	public String helloWorld() {
		
		return "Check dengan Spring";
	}
	
	@GetMapping(path="/crot")
	public String helloCrot() {
		return "Hello Crot";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers(){
		return userRepository.findAll();
	}
	

}
