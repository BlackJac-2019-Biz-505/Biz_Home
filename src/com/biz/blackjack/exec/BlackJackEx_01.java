package com.biz.blackjack.exec;

import com.biz.blackjack.service.BlackJackService;
import com.biz.blackjack.service.BlackJackServiceImp;
import com.biz.blackjack.service.Deck3;

public class BlackJackEx_01 {
	public static void main(String[] args) {
		
		Deck3 d = new Deck3();
		d.shuffle();
		
		Deck3 userDeck = new Deck3();
		Deck3 dealerDeck = new Deck3();
//		BlackJackService bj = new BlackJackServiceImp();
//		bj.cardReceive();
//		bj.view();
//		bj.cardReceive();
//		bj.calculation();
//		bj.view();
		
//		Card card = new Card();
//		card.shuffle();
		
	}
}
