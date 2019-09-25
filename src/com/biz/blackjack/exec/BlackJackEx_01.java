package com.biz.blackjack.exec;

import com.biz.blackjack.service.BlackJackService;
import com.biz.blackjack.service.BlackJackServiceImp;

public class BlackJackEx_01 {
	public static void main(String[] args) {
		BlackJackService bj = new BlackJackServiceImp();
		bj.cardReceive();
		bj.view();
//		bj.cardReceive();
//		bj.calculation();
//		bj.view();
		
//		Card card = new Card();
//		card.shuffle();
		
	}
}
