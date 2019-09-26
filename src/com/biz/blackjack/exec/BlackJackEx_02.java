package com.biz.blackjack.exec;

import java.util.Scanner;

import com.biz.blackjack.service.BlackJackService;
import com.biz.blackjack.service.BlackJackServiceImp;
import com.biz.blackjack.service.Deck;

public class BlackJackEx_02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Deck d = new Deck();
		d.creatCard();

		BlackJackService dealer = new BlackJackServiceImp();
		BlackJackService user = new BlackJackServiceImp();

		dealer.addReceive(d.getCard());
		dealer.addReceive(d.getCard());

		user.addReceive(d.getCard());
		user.addReceive(d.getCard());

		while (dealer.getValue() <= 16) {
			dealer.addReceive(d.getCard());
		}
		
		while (true) {
			System.out.println("현재 유저카드:" + user.receiveCardToString());
			System.out.println("Hit[H] and Stop[S]");
			String input = scanner.nextLine();
			if (input.equals("H")) {
				user.addReceive(d.getCard());
				System.out.println(user.receiveCardToString());
			} else {
				break;
			}
		}
		System.out.println("딜러카드:" + dealer.receiveCardToString());
	}
}
