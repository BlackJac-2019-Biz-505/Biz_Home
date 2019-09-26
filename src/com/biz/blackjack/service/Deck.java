package com.biz.blackjack.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Deck {

	Card[] cards = new Card[52];
	int locate;
	
	public Deck() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new Card(); 			
		}
	}

	// 카드 만들고 뒤섞기 + shuffle
	public void creatCard() {
		String symbols = "A23456789TJQK";
		String types = "SCHD";
		int index = 0;

		for (int i = 0; i < types.length(); i++) {
			for (int j = 0; j < symbols.length(); j++) {
				Card tCard = new Card();
				tCard.setSchd(types.charAt(i));
				tCard.setSymbol(symbols.charAt(j));
				cards[index] = tCard;
				//System.out.print(cards[index]);
				index++;
			}
		}
		shuffleCards();
		//System.out.println(cards[0]);
	}
	
	// shuffle 
	public void shuffleCards() {
		Collections.shuffle(Arrays.asList(cards));
//		for(Card vo : cards) {
//			System.out.print(vo);
//		}
	}
	// cards 배열 위치를 하나씩 이동하면서 카드 얻기
	public Card getCard() {
		Card ca = cards[locate];
		if (locate == 51) {
			return null;
		}
		locate++;
		return ca;
	}	
	
}
