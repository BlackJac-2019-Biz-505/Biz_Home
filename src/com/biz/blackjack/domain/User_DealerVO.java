package com.biz.blackjack.domain;


public class User_DealerVO {
	private int userCardSum;
	private String userCard1; 
	private String userCard2;
	
	private int dealerCardSum;
	private String dealerCard1;
	private String dealerCard2;
	
	
	public int getUserCardSum() {
		return userCardSum;
	}
	public void setUserCardSum(int userCardSum) {
		this.userCardSum = userCardSum;
	}
	public String getUserCard1() {
		return userCard1;
	}
	public void setUserCard1(String userCard1) {
		this.userCard1 = userCard1;
	}
	public String getUserCard2() {
		return userCard2;
	}
	public void setUserCard2(String userCard2) {
		this.userCard2 = userCard2;
	}
	public int getdealerCardSum() {
		return dealerCardSum;
	}
	public void setdealerCardSum(int dealerCardSum) {
		this.dealerCardSum = dealerCardSum;
	}
	public String getdealerCard1() {
		return dealerCard1;
	}
	public void setdealerCard1(String dealercard1) {
		this.dealerCard1 = dealercard1;
	}
	public String getdealerCard2() {
		return dealerCard2;
	}
	public void setdealerCard2(String dealercard2) {
		this.dealerCard2 = dealercard2;
	}
	
	
		
}
