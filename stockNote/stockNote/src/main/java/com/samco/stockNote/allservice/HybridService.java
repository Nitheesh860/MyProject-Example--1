package com.samco.stockNote.allservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.stockNote.allmodel.HybridModel;
import com.samco.stockNote.allrepository.HybridRepository;


@Service
public class HybridService {
	@Autowired
	HybridRepository hybridRepository;
	public HybridModel save(HybridModel hybridmodel ) {
	return hybridRepository.save(hybridmodel);
}

}