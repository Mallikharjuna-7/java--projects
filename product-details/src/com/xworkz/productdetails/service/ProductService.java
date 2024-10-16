package com.xworkz.productdetails.service;

import java.util.List;

import com.xworkz.productdetails.dto.ProductDto;

public interface ProductService {
	
String validate(ProductDto productDto);
	
	List<ProductDto> getAll();
	
	String updateById(int productID, ProductDto productDto);
	
	String deleteById(int productID, ProductDto productDto);


}
