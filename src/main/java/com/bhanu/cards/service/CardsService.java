package com.bhanu.cards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhanu.cards.model.Cards;
import com.bhanu.cards.repository.CardsRepository;

@Service
@Transactional
public class CardsService {
	
	@Autowired
	private CardsRepository cardsRepository;
	
	public List<Cards> CardsByCustomerId(int customerId){
		return cardsRepository.findByCustomerId(customerId);
		}
	
	
	}
