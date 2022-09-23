package com.samco.stockNote.allservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.stockNote.allmodel.User;
import com.samco.stockNote.allrepository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository; 
	
	public User getUserId(String user_id) {

		return userRepository.fetchByUserId(user_id);

	}
	
	
}
