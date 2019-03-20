package com.ing.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.ing.domain.Product;

@Transactional
public interface ProductRepository  extends CrudRepository<Product, Long> {


}
