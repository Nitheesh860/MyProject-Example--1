package com.samco.stockNote.allmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Demo")
public class Customer {
	
	
		@Id
	
		private String _id;
		private String bonus;
		private String buyBack;
		private String capital;
		private String client_id;
		private String consolidationOfShares;
		private String dividend;
		private Double index;
		private String insertedDate;
		private Double nav;
		private String navDate;
		private String navDateYMD;
		private String openOffer;
		private String prevNAV;
		private String provisionalNAV;
		private String remarks;
		private String securities;
		private String splitStocks;
		private String units;
		
		
		public Customer() {
			super();
		}
		public Customer(String _id, String bonus, String buyBack, String capital, String client_id,
				String consolidationOfShares, String dividend, Double index, String insertedDate, Double nav,
				String navDate, String navDateYMD, String openOffer, String prevNAV, String provisionalNAV,
				String remarks, String securities, String splitStocks, String units) {
			super();
			this._id = _id;
			this.bonus = bonus;
			this.buyBack = buyBack;
			this.capital = capital;
			this.client_id = client_id;
			this.consolidationOfShares = consolidationOfShares;
			this.dividend = dividend;
			this.index = index;
			this.insertedDate = insertedDate;
			this.nav = nav;
			this.navDate = navDate;
			this.navDateYMD = navDateYMD;
			this.openOffer = openOffer;
			this.prevNAV = prevNAV;
			this.provisionalNAV = provisionalNAV;
			this.remarks = remarks;
			this.securities = securities;
			this.splitStocks = splitStocks;
			this.units = units;
		}
		public String get_id() {
			return _id;
		}
		public void set_id(String _id) {
			this._id = _id;
		}
		public String getBonus() {
			return bonus;
		}
		public void setBonus(String bonus) {
			this.bonus = bonus;
		}
		public String getBuyBack() {
			return buyBack;
		}
		public void setBuyBack(String buyBack) {
			this.buyBack = buyBack;
		}
		public String getCapital() {
			return capital;
		}
		public void setCapital(String capital) {
			this.capital = capital;
		}
		public String getClient_id() {
			return client_id;
		}
		public void setClient_id(String client_id) {
			this.client_id = client_id;
		}
		public String getConsolidationOfShares() {
			return consolidationOfShares;
		}
		public void setConsolidationOfShares(String consolidationOfShares) {
			this.consolidationOfShares = consolidationOfShares;
		}
		public String getDividend() {
			return dividend;
		}
		public void setDividend(String dividend) {
			this.dividend = dividend;
		}
		public Double getIndex() {
			return index;
		}
		public void setIndex(Double index) {
			this.index = index;
		}
		public String getInsertedDate() {
			return insertedDate;
		}
		public void setInsertedDate(String insertedDate) {
			this.insertedDate = insertedDate;
		}
		public Double getNav() {
			return nav;
		}
		public void setNav(Double nav) {
			this.nav = nav;
		}
		public String getNavDate() {
			return navDate;
		}
		public void setNavDate(String navDate) {
			this.navDate = navDate;
		}
		public String getNavDateYMD() {
			return navDateYMD;
		}
		public void setNavDateYMD(String navDateYMD) {
			this.navDateYMD = navDateYMD;
		}
		public String getOpenOffer() {
			return openOffer;
		}
		public void setOpenOffer(String openOffer) {
			this.openOffer = openOffer;
		}
		public String getPrevNAV() {
			return prevNAV;
		}
		public void setPrevNAV(String prevNAV) {
			this.prevNAV = prevNAV;
		}
		public String getProvisionalNAV() {
			return provisionalNAV;
		}
		public void setProvisionalNAV(String provisionalNAV) {
			this.provisionalNAV = provisionalNAV;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public String getSecurities() {
			return securities;
		}
		public void setSecurities(String securities) {
			this.securities = securities;
		}
		public String getSplitStocks() {
			return splitStocks;
		}
		public void setSplitStocks(String splitStocks) {
			this.splitStocks = splitStocks;
		}
		public String getUnits() {
			return units;
		}
		public void setUnits(String units) {
			this.units = units;
		}
		
		


}