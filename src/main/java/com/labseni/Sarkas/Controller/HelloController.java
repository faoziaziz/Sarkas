/*
 * 	Author : Aziz Amerul Faozi
 * 	Description :
 * 		Hello controller this program under development to test some API
 * 		 
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.labseni.Sarkas.model.Crot;
import com.labseni.Sarkas.model.CrotRepository;

@RestController
@RequestMapping("/")
@Api(value="Sexy management System", description = "Sexy mantap")
public class HelloController {
	/*
	 * 	HelloController.Java to route main 
	 * */
	@Autowired
	private CrotRepository crotRepository;

	@ApiOperation(value = "View list of available emplotess")
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Crot> getAllCrots(){
		return crotRepository.findAll();
	}
	
	@ApiOperation(value = "get all user")
	@GetMapping(path="/")
	public String helloWorld() {	
		return "Check dengan Spring";
	}
	

	@ApiOperation(value="get crot operation")
	@GetMapping(path="/crot")
	public String helloCrot() {
		return "Hello Crot";
	}
	
	/*
	 *  Post method to realize some how with
	 * 	*/
	
	@ApiOperation(value="Post method")
	@PostMapping(path="/postcrot")
	public Crot helloPost(
			@ApiParam(value = "Employee object store in database table", required = true) 
			@Valid @RequestBody Crot crot){
		
		return crotRepository.save(crot);
	}
	

}
