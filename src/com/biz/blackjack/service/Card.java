package com.biz.blackjack.service;

import java.util.Arrays;
import java.util.Collections;
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
//		Collections.shuffle(Arrays.asList(card));
//		
//		for(String s : card) {
//			System.out.println(s);
//		}

		
		for (int i = 0; i < figure.length; i++) {
			System.out.println(figure[i]);
			for (int j = 0; j < card.length; i++) {
				System.out.println(card[j]);
			}
		}

	}
}
