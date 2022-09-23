package com.samco.stockNote.allservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.stockNote.allmodel.FutureModel;
import com.samco.stockNote.allrepository.FuturesRepository;

@Service
public class FutureService {
@Autowired
FuturesRepository futuresRepository;
	public FutureModel save(FutureModel  futuremodel) {
	return futuresRepository.save(futuremodel);
}

}
	


