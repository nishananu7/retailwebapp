package com.example.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


@RequestMapping(path="/products")
	public String listProducts() {
		
		String productName="Three Seater Sofa";
		
		return "productName";
	}

}
