package com.samco.stockNote;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import javax.swing.text.html.parser.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.ComparisonOperators.Eq;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.samco.stockNote.allmodel.Customer;
import com.samco.stockNote.allmodel.EQModel;
import com.samco.stockNote.allmodel.FutureModel;
import com.samco.stockNote.allmodel.HybridModel;
import com.samco.stockNote.allmodel.OptionsModel;
import com.samco.stockNote.allmodel.User;
import com.samco.stockNote.allrepository.CustomerRepo;
import com.samco.stockNote.allrepository.EqRepository;
import com.samco.stockNote.allrepository.FuturesRepository;
import com.samco.stockNote.allrepository.HybridRepository;
import com.samco.stockNote.allrepository.OptionsRepository;
import com.samco.stockNote.allrepository.UserRepository;
import com.samco.stockNote.allservice.EqService;
import com.samco.stockNote.allservice.FutureService;
import com.samco.stockNote.allservice.HybridService;
import com.samco.stockNote.allservice.OptionService;

@SpringBootApplication
@Component
public class StockNoteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StockNoteApplication.class, args);

	}

	@Autowired
	UserRepository userRepository;
	@Autowired
	CustomerRepo customerRepo;

	@Autowired
	EqRepository eqRepository;
	@Autowired
	FuturesRepository futuresRepository;
	@Autowired
	OptionsRepository optionsRepository;
	@Autowired
	HybridRepository hybridRepository;
	@Autowired
	EqService eqService;
	@Autowired
	HybridService hybridService;
	@Autowired
	OptionService optionService;
	@Autowired
	FutureService futureService;

	@Override
	public void run(String... args) throws Exception {

		List<Customer> customerList = customerRepo.findAll();
		List<User> userList = userRepository.findAll();
		Map<String, Customer> customer = new HashMap<>();
		Map<String, User> userMap = new HashMap<>();

		for (Customer cust : customerList) {
			customer.put(cust.getClient_id(), cust);
			// System.out.println(cust.getClient_id());
		}
		for (User u : userList) {
			userMap.put(u.getClient_id(), u);
			// System.out.println(u.getClient_id());
		}

		for (Map.Entry<String, Customer> obj : customer.entrySet()) {

			// System.out.println("customer::: "+obj.getKey());
			// System.out.println("customer::: "+obj.getValue().getClient_id());
			// System.out.println("customer::: "+obj.getValue().getPrevNAV());
		}

		for (Map.Entry<String, User> obj : userMap.entrySet()) {

			// System.out.println("user::: "+obj.getKey());
			// System.out.println("user::: "+obj.getValue().getClient_id());
			// System.out.println("user::: "+obj.geteValue().getTradeType());
		}
		
		for (String s : customer.keySet()) {

			if (userMap.containsKey(s)) {
				User users = userMap.get(s);
				System.out.println("Users:: " + users);

				String eq = users.getTradeType();
				System.out.println("EQ:: " + eq);
				System.out.println("FETCHING USER DETAILS");
				System.out.println(userMap.get(s).getClient_id());
				System.out.println(userMap.get(s).getFirstName());
				System.out.println(userMap.get(s).getLastName());
				System.out.println(userMap.get(s).getTradeType());
				System.out.println(userMap.get(s).getBenchmarkTarget());
				System.out.println(userMap.get(s).getBenchmarkIndexName());
				System.out.println("FETCHING CUSTOMER DETAILS");
				System.out.println(customer.get(s).getClient_id());
				System.out.println(customer.get(s).getBonus());
				System.out.println(customer.get(s).getConsolidationOfShares());
				System.out.println(customer.get(s).getDividend());
				System.out.println(customer.get(s).getCapital());
				System.out.println(customer.get(s).getInsertedDate());
				if(eq.equalsIgnoreCase("EQ")) {
					//System.out.println(usersMap.get(s));
					//System.out.println(masterMap.get(s)); 
					EQModel eqModel = new EQModel();
					eqModel.setClient_id(users.getClient_id());
					eqService.save(eqModel);
				   }
					
					else if(eq.equalsIgnoreCase("Futures")) {
						FutureModel futuresModel = new FutureModel();
						futuresModel.setClient_id(users.getClient_id());
						
						
						futureService.save(futuresModel);
					
					} else if(eq.equalsIgnoreCase("Options")) {
						OptionsModel optionsModel = new OptionsModel();
						optionsModel.setClient_id(users.getClient_id());
						optionService.save(optionsModel);
					}else if(eq.equalsIgnoreCase("Hybrid")) {
						HybridModel hybridModel = new HybridModel();
						hybridModel.setClient_id(users.getClient_id());
						hybridService.save(hybridModel);
					}else {
						System.out.println("Not Available");
					}
				
			}
		}
	}
}


