package com.ing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.domain.ProductGroup;
import com.ing.service.ProductGroupService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("13.233.208.167:9080/bankING/api/v1/")
public class ProductGroupController {

	@Autowired
	ProductGroupService productGroupService;

	@GetMapping("/groups")
	public ResponseEntity<List<ProductGroup>> getGroups() {
		List<ProductGroup> list = productGroupService.getAllProductGroups();
		return ResponseEntity.ok().body(list);
	}

}
