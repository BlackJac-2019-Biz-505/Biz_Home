package com.biz.blackjack.service;

public interface BlackJackService {
	public void addReceive(Card card);
	public int getValue();
	public void view();
	public String receiveCardToString();
}
