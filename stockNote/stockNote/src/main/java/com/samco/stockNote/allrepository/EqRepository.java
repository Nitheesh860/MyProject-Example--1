package com.samco.stockNote.allrepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samco.stockNote.allmodel.Customer;
import com.samco.stockNote.allmodel.EQModel;
import com.samco.stockNote.allmodel.User;
@Repository
public interface EqRepository extends MongoRepository<EQModel, String>{

	public EQModel save(EQModel eqModel);

	

}
