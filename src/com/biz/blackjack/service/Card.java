package com.biz.blackjack.service;

public class Card {

	private char symbol; // 23456789tkJQ
	private char schd; // s , c ,h ,d

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public char getSchd() {
		return schd;
	}

	public void setSchd(char schd) {
		this.schd = schd;
	}

	public int getValue() {
		if (symbol == 'T') {
			return 10;
		} else if (symbol == 'J') {
			return 10;
		} else if (symbol == 'Q') {
			return 10;
		} else if (symbol == 'K') {
			return 10;
		} else if (symbol == 'A') {
				return 1;
		} else {
			return Integer.valueOf(symbol+"");
		}
	}

	@Override
	public String toString() {
		return this.schd +""+ this.symbol ;
	}
	
	

}
