package com.samco.stockNote.allmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userprofile")
public class User {
	@Id
	private String _id;
	private String client_id;
	private String benchmarkIndexName;	
	private String benchmarkTarget;
	private String firstName;
	private String lastName;
	private String tradeType;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String _id, String client_id, String benchmarkIndexName, String benchmarkTarget, String firstName, String lastName,
			String tradeType) {
		super();
		this._id=_id;
		this.client_id = client_id;
		this.benchmarkIndexName = benchmarkIndexName;
		this.benchmarkTarget = benchmarkTarget;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tradeType = tradeType;
	}
	
	public String _id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id=_id;
	}
	
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getBenchmarkIndexName() {
		return benchmarkIndexName;
	}
	public void setBenchmarkIndexName(String benchmarkIndexName) {
		this.benchmarkIndexName = benchmarkIndexName;
	}
	public String getBenchmarkTarget() {
		return benchmarkTarget;
	}
	public void setBenchmarkTarget(String benchmarkTarget) {
		this.benchmarkTarget = benchmarkTarget;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	
	
}
