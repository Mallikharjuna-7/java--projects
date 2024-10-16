package com.xworkz.productdetails.repository;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.productdetails.dto.ProductDto;

public class ProductRepoImplementation implements ProductRepo {

	LinkedList<ProductDto> productList = new LinkedList<ProductDto>();

	@Override
	public boolean save(ProductDto productDto) {
		System.out.println("save method running");
		return productList.add(productDto);
	}

	@Override
	public List<ProductDto> getAll() {

		return productList;
	}

	@Override
	public boolean updateById(int productId, ProductDto productDto) {
		if (!productList.isEmpty()) {
			for (int i = 0; i < productList.size(); i++) {
				if (productList.get(i).getProductId() == productId) {
					productList.set(i, productDto);
					return true;
				} else {
					System.out.println("Product Id not Matched to update ");
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int productId, ProductDto productDto) {
		if (!productList.isEmpty()) {
			for (int i = 0; i < productList.size(); i++) {
				if (productList.get(i).getProductId() == productId) {
					productList.remove();
					return true;
				} else {
					System.out.println("Product Id not Matched to delete ");
				}
			}
		}
		return false;
	}
}
