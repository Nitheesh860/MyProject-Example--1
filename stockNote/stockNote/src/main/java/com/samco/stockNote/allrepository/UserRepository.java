package com.samco.stockNote.allrepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.samco.stockNote.allmodel.User;



@Repository
public interface UserRepository extends MongoRepository<User, String>{

	@Query("{'client_id':?0}")
	public User fetchByUserId(String user_id);
	
	
	
}
