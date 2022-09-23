package com.samco.stockNote.allrepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samco.stockNote.allmodel.FutureModel;

@Repository
public interface FuturesRepository extends MongoRepository<FutureModel, String>{

	public FutureModel save(FutureModel futuremodel);

}
