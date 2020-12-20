package com.geovani.cursomc.domain;

import java.util.Date;

import com.geovani.cursomc.domain.enums.PaymentStatus;

public class PaymentWithTicket extends Payment {
	
	private static final long serialVersionUID = 1L;
	private Date expirationDate;
	private Date paymentDate;
	
	public PaymentWithTicket() {
		super();
	}
	
	public PaymentWithTicket(Integer id, PaymentStatus status, Order order, Date expirationdate, Date paymentDate) {
		super(id, status, order);
		this.expirationDate = expirationdate;
		this.paymentDate = paymentDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
	
	
}
