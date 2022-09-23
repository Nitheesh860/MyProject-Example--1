package com.samco.stockNote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samco.stockNote.allmodel.User;
import com.samco.stockNote.allservice.UserService;

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserService userService;
	@GetMapping("/{user_id}")
	public User fetchUserId(@PathVariable("user_id") String user_id) {
		return userService.getUserId(user_id);
	}
	
	
}
