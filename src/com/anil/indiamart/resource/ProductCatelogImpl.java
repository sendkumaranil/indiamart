package com.anil.indiamart.resource;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.anil.indiamart.model.Product;

@WebService
public class ProductCatelogImpl implements ProductCatelog {

	@Override
	public List<String> getProductDetails() {
		List<String> products=new ArrayList<>();
		products.add("Laptop");
		products.add("Mobile");
		products.add("TV");
		products.add("Dish TV");
		products.add("Washing Machine");
		products.add("Refrogrator");
		products.add("Ceiling Fan");
		products.add("Cooler");
		products.add("Table Fan");
		products.add("AC");
		products.add("Home Theatre");
		return products;
	}

	@Override
	public Product getProduct() {
		Product product=new Product();
		product.setProductname("Horlicks");
		product.setPrice("125.00");
		product.setMfgdate("12/12/2017");
		product.setExpdate("02/06/2018");
		return product;
	}

	@Override
	public String testHeartBeat() {
		
		return "indiamart service is up!!";
	}
	
}
