package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Card {

	Random rnd;
	String[] card = new String[] { "A", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "K",
			"Q", "J" };
	List<String> dupliDelete;
	String[] figure = new String[] { "diamond", "heart", "Spade", "clover" };

	public Card() {
		rnd = new Random();
		dupliDelete = new ArrayList<String>();
	}

	public void shuffle() {
		int cardShuffle = 0;
		int figureShuffle = 0;
		int rndValue = 13;
		Collections.addAll(dupliDelete, card);
		System.out.println(dupliDelete);
		int nSize = dupliDelete.size();
		System.out.println();
		for (int i = 0; i < nSize  ; i++) {
			cardShuffle = rnd.nextInt(rndValue);
			System.out.println(cardShuffle);
			dupliDelete.remove(cardShuffle);
			System.out.println(dupliDelete);
			nSize--;
			rndValue--;
			i = 0;
		}
	}
}
