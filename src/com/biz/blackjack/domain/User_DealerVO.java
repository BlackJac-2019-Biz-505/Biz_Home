package com.biz.blackjack.domain;

public class User_DealerVO {
	private int userCardSum;
	private String userCard; 
	
	private int deallerCardSum;
	private String deallercard;
	
	public int getUserCardSum() {
		return userCardSum;
	}
	public void setUserCardSum(int userCardSum) {
		this.userCardSum = userCardSum;
	}
	public String getUserCard() {
		return userCard;
	}
	public void setUserCard(String userCard) {
		this.userCard = userCard;
	}
	public int getDeallerCardSum() {
		return deallerCardSum;
	}
	public void setDeallerCardSum(int deallerCardSum) {
		this.deallerCardSum = deallerCardSum;
	}
	public String getDeallercard() {
		return deallercard;
	}
	public void setDeallercard(String deallercard) {
		this.deallercard = deallercard;
	}
	
	
}
