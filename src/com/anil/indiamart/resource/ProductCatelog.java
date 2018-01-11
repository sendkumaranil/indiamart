package com.anil.indiamart.resource;

import java.util.List;

import javax.jws.WebService;

import com.anil.indiamart.model.Product;

@WebService
public interface ProductCatelog {

	public List<String> getProductDetails();
	public Product getProduct();
	public String testHeartBeat();
}
