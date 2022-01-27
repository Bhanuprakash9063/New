package com.bhanu.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhanu.cards.model.Cards;
import com.bhanu.cards.service.CardsService;

@RestController
public class CardsController {

	@Autowired
	private CardsService cardsService;
	
	@GetMapping("/getMyCards")
	public List<Cards> getAllCardsById(@RequestBody Cards cards){
		int customerId = cards.getCustomerId();
		List<Cards> cardsByCustomerId = cardsService.CardsByCustomerId(customerId);
		if(cardsByCustomerId!=null){
			return cardsByCustomerId;
		}else {
			return null;
		}
		
		
	}
	
}
