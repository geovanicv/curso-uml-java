package com.geovani.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date instant;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "order")
	private Payment payment;

	private Client client;

	private Address addressDelivery;

	public Order() {
	}

	public Order(Integer id, Date instant, Client client, Address addressDelivery) {
		super();
		this.id = id;
		this.instant = instant;
		this.client = client;
		this.addressDelivery = addressDelivery;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instant;
	}

	public void setInstante(Date instante) {
		this.instant = instante;
	}

	public Payment getPagamento() {
		return payment;
	}

	public void setPagamento(Payment payment) {
		this.payment = payment;
	}

	public Client getCliente() {
		return client;
	}

	public void setCliente(Client client) {
		this.client = client;
	}

	public Address getEnderecoDeEntrega() {
		return addressDelivery;
	}

	public void setEnderecoDeEntrega(Address addressDelivery) {
		this.addressDelivery = addressDelivery;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



}