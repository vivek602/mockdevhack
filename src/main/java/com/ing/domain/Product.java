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
	private int id;
	private String name;
	private String interest_rate;
	private double percentage;
	private String special;
	private String putinandwithdrawel;
	private double mininvestment;
	private double maxinvestment;
	private String duration;
	//private String product_type;
	//private Long balance;
	//private Long max_limit;

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

	/*
	 * public String getProduct_type() { return product_type; }
	 * 
	 * public void setProduct_type(String product_type) { this.product_type =
	 * product_type; }
	 * 
	 * public Long getBalance() { return balance; }
	 * 
	 * public void setBalance(Long balance) { this.balance = balance; }
	 * 
	 * public Long getMax_limit() { return max_limit; }
	 * 
	 * public void setMax_limit(Long max_limit) { this.max_limit = max_limit; }
	 */

	public String getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate(String interest_rate) {
		this.interest_rate = interest_rate;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getPutinandwithdrawel() {
		return putinandwithdrawel;
	}

	public void setPutinandwithdrawel(String putinandwithdrawel) {
		this.putinandwithdrawel = putinandwithdrawel;
	}

	public double getMininvestment() {
		return mininvestment;
	}

	public void setMininvestment(double mininvestment) {
		this.mininvestment = mininvestment;
	}

	public double getMaxinvestment() {
		return maxinvestment;
	}

	public void setMaxinvestment(double maxinvestment) {
		this.maxinvestment = maxinvestment;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Product(int id) {
		super();
		this.id = id;
	}

	public Product() {
		super();
	}
}
