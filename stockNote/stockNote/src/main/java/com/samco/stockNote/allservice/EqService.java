package com.samco.stockNote.allservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.stockNote.allmodel.EQModel;
import com.samco.stockNote.allrepository.EqRepository;

@Service
public class EqService {
@Autowired
private EqRepository eqRepository;
public EQModel save(EQModel eqModel) {
	return eqRepository.save(eqModel);
}
}
