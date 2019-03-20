package com.ing.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="product_group")
public class ProductGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long groupId;
	String groupName;
	
	@OneToMany(fetch = FetchType.EAGER,cascade= CascadeType.ALL)
	@JoinColumn(name = "group_id")
	List<Product> productName;

	public ProductGroup(Long groupId) {
		super();
		this.groupId = groupId;
	}

	public ProductGroup() {
		super();
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Product> getProductName() {
		return productName;
	}

	public void setProductName(List<Product> productName) {
		this.productName = productName;
	}

}
