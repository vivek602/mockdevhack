package com.ing.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pruduct")
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String product_type;
	private Long balance;
	private Long max_limit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Long getMax_limit() {
		return max_limit;
	}

	public void setMax_limit(Long max_limit) {
		this.max_limit = max_limit;
	}

	public Product(int id) {
		super();
		this.id = id;
	}

}
