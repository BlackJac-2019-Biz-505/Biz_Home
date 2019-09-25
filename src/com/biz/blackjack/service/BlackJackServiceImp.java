package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.blackjack.domain.User_DealerVO;

public class BlackJackServiceImp implements BlackJackService{

	Deck card;
	User_DealerVO vo;
	List<String> reList;
	
	// 처음에 받는 카드 2장
	String userInitialCard; 
	String dealerInitialCard;
	
	public BlackJackServiceImp() {
		card = new Deck();
		reList = new ArrayList<String>();
		vo = new User_DealerVO();
	}
	@Override
	public void cardReceive() {
		reList = card.cardList;
		card.shuffle();
		
		// 사용자 카드 받기 
		vo.setUserCard1(reList.get(0));
		reList.remove(0);
		vo.setUserCard2(reList.get(0));
		reList.remove(0);
		userInitialCard = vo.getUserCard1() + " "+ vo.getUserCard2();
		
		// 딜러 카드 받기
		vo.setdealerCard1(reList.get(0));
		reList.remove(0);
		vo.setdealerCard2(reList.get(0));
		reList.remove(0);
		dealerInitialCard = vo.getdealerCard1() + " "+ vo.getdealerCard2();
	}

	@Override
	public void calculation() {
		//int card1 = Integer.valueOf(card.k + 1);
		//int card2 = Integer.valueOf(card.k + 1);
		//vo.setUserCardSum(card1+card2);
	}
	
	
	@Override
	public void view() {
		System.out.println("게이머 카드\n" + userInitialCard);
		System.out.println("카드 합계>>" + vo.getUserCardSum());
		System.out.println("================================");
		System.out.println("딜러 카드\n" + dealerInitialCard);
		System.out.println("남은 카드 수량 :"+ reList.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
