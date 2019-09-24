package com.biz.blackjack.service;

import java.util.Random;

public class Card {

	Random rnd;
	String[] card = new String[] { "A", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "K",
			"Q", "J" };
	String[] figure = new String[] { "diamond", "heart", "Spade", "clover" };

	public Card() {
		rnd = new Random();
	}

	public void shuffle() {
		int cardShuffle = 0;
		int figureShuffle = 0;

		for (int i = 0; i < figure.length; i++) {
			figureShuffle = rnd.nextInt(3);
			for (int j = 0; j < card.length; j++) {
				cardShuffle = rnd.nextInt(13);				
				System.out.println("["+figure[figureShuffle]+"]" + card[cardShuffle]);
			}
		}
	}

}
