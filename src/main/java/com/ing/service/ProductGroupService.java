package com.ing.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.ProductGroup;
import com.ing.repository.ProductGroupRepository;

@Service
@Transactional
public class ProductGroupService {
	
	@Autowired
	ProductGroupRepository productGroupRepository;

	public List<ProductGroup> getAllProductGroups() {
		 List<ProductGroup> data = new ArrayList<>();
		Iterable<ProductGroup> list = productGroupRepository.findAll();
		for(ProductGroup productGroup:list) {
			data.add(productGroup);
		}
		return data;
	}

}
