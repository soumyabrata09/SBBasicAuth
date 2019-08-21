/**
 * 
 */
package com.sam.ms.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SoumyabrataSen
 *
 */
@RestController
@RequestMapping(value = "/api")
public class AuthController {

//	@RequestMapping(value ="api/auth/login/submit" , method = RequestMethod.POST  )
//	public String authenticateAndDeliver() {
//		return "Welcome";
//	}
	
// 	@RequestMapping(value ="api/auth/login/submit" , method = RequestMethod.POST  )
// 	public ResponseEntity<String> authenticateAndDeliver() {
// 		return new ResponseEntity<String>("Welcome,your authorization done successfully",HttpStatus.OK);
// 	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getListOfUsers() {
		String ack=null;
		ack="hello i am vishal";
		return ack;
	}
}
