package com.ing.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue
	private Long productId;
	private String productName;
	private String product_type;
	private Long balance;
	private Long max_limit;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public Product(Long productId) {
		super();
		this.productId = productId;
	}

	public Product() {
		super();
	}
}
