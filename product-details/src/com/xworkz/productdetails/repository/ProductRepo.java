package com.xworkz.productdetails.repository;

import java.util.List;

import com.xworkz.productdetails.dto.ProductDto;

public interface ProductRepo {

	boolean save(ProductDto productDto);

	List<ProductDto> getAll();
	
	boolean updateById(int productId, ProductDto productDto);
	
	boolean deleteById(int productId, ProductDto productDto);
}
