package com.bhanu.cards.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bhanu.cards.model.Cards;

@Repository
public interface CardsRepository extends CrudRepository<Cards, Integer> {

	 List<Cards> findByCustomerId(int customerId);
	
	
}
