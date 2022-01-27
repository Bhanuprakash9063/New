package com.bhanu.cards.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cards {
	
	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getTotalLimit() {
		return totalLimit;
	}

	public void setTotalLimit(int totalLimit) {
		this.totalLimit = totalLimit;
	}

	public int getAmountUsed() {
		return amountUsed;
	}

	public void setAmountUsed(int amountUsed) {
		this.amountUsed = amountUsed;
	}

	public int getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(int availableAmount) {
		this.availableAmount = availableAmount;
	}

	public LocalDate getCreatDt() {
		return creatDt;
	}

	public void setCreatDt(LocalDate creatDt) {
		this.creatDt = creatDt;
	}

	@Column(name="card_id") 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cardId;
	
	@Column(name="card_number") 
	private String cardNumber;
	
	@Column(name="customer_id") 
	private int customerId;

	@Column(name="card_type")
	private String cardType;
	
	@Column(name="total_limit")
	private int totalLimit;
	
	@Column(name="amount_used")
	private int amountUsed;
	
	@Column(name="available_amount")
	private int availableAmount;
	
	@Column(name="create_dt")
	private LocalDate creatDt;
	
}
