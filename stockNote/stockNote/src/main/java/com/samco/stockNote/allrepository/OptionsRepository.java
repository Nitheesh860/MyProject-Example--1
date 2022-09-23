package com.samco.stockNote.allrepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samco.stockNote.allmodel.Customer;
import com.samco.stockNote.allmodel.OptionsModel;
import com.samco.stockNote.allmodel.User;

@Repository
public interface OptionsRepository extends MongoRepository<OptionsModel, String>{

	public OptionsModel save(OptionsModel optionmodel);

}
