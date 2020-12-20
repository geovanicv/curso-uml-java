package com.geovani.cursomc.domain;

import com.geovani.cursomc.domain.enums.PaymentStatus;

public class PaymentWithCreditCard extends Payment{
	private static final long serialVersionUID = 1L;
	private Integer numberOfInstallments;

	public PaymentWithCreditCard() {
		super();
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
