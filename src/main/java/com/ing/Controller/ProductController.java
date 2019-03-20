package com.ing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.domain.Product;
import com.ing.service.ProductService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("api/v1/")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductDetails(@PathVariable Long id) {
		Product product  = productService.getProductDetails(id);
		return ResponseEntity.ok().body(product);
	}

}
