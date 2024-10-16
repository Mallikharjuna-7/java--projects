package com.xworkz.productdetails.service;

import java.util.List;

import com.xworkz.productdetails.dto.ProductDto;
import com.xworkz.productdetails.repository.ProductRepoImplementation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductServiceImplementation implements ProductService {

	
private ProductRepoImplementation repoImp;
	
	@Override
	public String validate(ProductDto productDto) {
		System.out.println("validate is running");
		if(productDto != null) {
			if(repoImp.save(productDto)) {
				return "saved successfully";
			}
			return "not saved";
		}
		return "Not validated.. null";
	}

	@Override
	public List<ProductDto> getAll() {
		
		return repoImp.getAll();
	}

	@Override
	public String updateById(int productId, ProductDto productDto) {
		if(productId > 0) {
			if(repoImp.updateById(productId, productDto)) {
				return "updated successfully";
			}
		}
		return "not updated";
	}

	@Override
	public String deleteById(int productId, ProductDto productDto) {
		if(productId > 0) {
			if(repoImp.deleteById(productId, productDto)) {
				return "deleted successfully";
			}
		}
		return "not deleted";
	}
}
