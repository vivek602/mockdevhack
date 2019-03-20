package com.ing.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.ing.domain.ProductGroup;

@Transactional
public interface ProductGroupRepository  extends CrudRepository<ProductGroup, Long> {


}
