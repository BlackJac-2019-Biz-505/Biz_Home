package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.blackjack.domain.CardVO;
import com.biz.blackjack.domain.User_DealerVO;

public class BlackJackServiceImp implements BlackJackService{

	List<Card> handList;
	
	public BlackJackServiceImp() {
		handList = new ArrayList<Card>();
		int locate = 0;
	}
	
	@Override
	public void addReceive(Card card) {
			handList.add(card);
	}
	
	public String receiveCardToString() {
		String hand = "";
		int nSize = handList.size();
		for (int i = 0; i < nSize; i++) {
			hand = handList.get(i).toString() + " ";			
		}
		return hand;
	}

	@Override
	public int getValue() {
		int valueSum = 0;
		int nSize = handList.size(); 
		for (int i = 0; i < nSize ; i++) {
			Card temp = handList.get(i);
			int cardValue = temp.getValue();
			if(cardValue > 10) {
				cardValue = 10;
			}
			valueSum += cardValue;
		}
		return valueSum;
	}
	
	
	@Override
	public void view() {
		
	}
}
