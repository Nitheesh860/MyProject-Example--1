package com.samco.stockNote.allrepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.samco.stockNote.allmodel.Customer;



@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {
	@Query("{'client_id':?0}")
	public Customer fetchByClientId( String client_id);
}