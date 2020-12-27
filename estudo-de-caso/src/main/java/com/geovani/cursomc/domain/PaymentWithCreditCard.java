package com.geovani.cursomc.domain;

import javax.persistence.Entity;

import com.geovani.cursomc.domain.enums.PaymentStatus;

@Entity
public class PaymentWithCreditCard extends Payment{
	private static final long serialVersionUID = 1L;
	
	private Integer numberOfInstallments;

	public PaymentWithCreditCard() {
	}

	public PaymentWithCreditCard(Integer id, PaymentStatus status, Order order, Integer numberOfInstallments) {
		super(id, status, order);
		this.numberOfInstallments = numberOfInstallments;
	}

	public Integer getNumberOfInstallments() {
		return numberOfInstallments;
	}

	public void setNumberOfInstallments(Integer numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}
		
}
