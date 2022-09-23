package com.samco.stockNote.allservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.stockNote.allmodel.OptionsModel;
import com.samco.stockNote.allrepository.OptionsRepository;
@Service
public class OptionService {
	@Autowired
	OptionsRepository optionsRepository;
public OptionsModel save(OptionsModel optionmodel ) {
	return optionsRepository.save(optionmodel);
}

}