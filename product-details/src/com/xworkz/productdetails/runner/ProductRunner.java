package com.xworkz.productdetails.runner;

import java.util.Scanner;

import com.xworkz.productdetails.dto.ProductDto;
import com.xworkz.productdetails.repository.ProductRepoImplementation;
import com.xworkz.productdetails.service.ProductService;
import com.xworkz.productdetails.service.ProductServiceImplementation;


public class ProductRunner {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the choice below");
		System.out.println("1.save operation");
		System.out.println("2.read operation");
		System.out.println("3.update operation");
		System.out.println("4.delete operation");

		int choice = scanner.nextInt();

		ProductService service = new ProductServiceImplementation(new ProductRepoImplementation());

		ProductDto dto = new ProductDto();
		ProductDto updateDto = new ProductDto();

		while ( choice >= 0) {

			switch (choice) {
			case 1:
				System.out.println("Save operation!!");
				
				System.out.println("Enter the Product Id");
				dto.setProductId(scanner.nextInt());

				System.out.println("Enter the Product Name");
				dto.setProductName(scanner.next());

				System.out.println("Enter the Product Type");
				dto.setProductType(scanner.next());

				System.out.println("Enter the Product Color");
				dto.setProductColor(scanner.next());

				System.out.println("Enter the Product Price");
				dto.setProductPrice(scanner.nextInt());

				System.out.println(service.validate(dto));

				break;
			case 2:
				System.out.println("Read Opeartion");
				System.out.println(service.getAll());
				break;
			case 3:
				System.out.println("Enter the details to Update! If Product Id matched then only it will Update..");
				
				System.out.println("Enter the Product Id");
				updateDto.setProductId(scanner.nextInt());

				System.out.println("Enter the Product Name");
				updateDto.setProductName(scanner.next());

				System.out.println("Enter the Product Type");
				updateDto.setProductType(scanner.next());

				System.out.println("Enter the Product Color");
				updateDto.setProductColor(scanner.next());

				System.out.println("Enter the Product Price");
				updateDto.setProductPrice(scanner.nextInt());

				String updateResult = service.updateById(updateDto.getProductId(), updateDto);
				System.out.println(updateResult);
				break;
			case 4:
				System.out.println("Delete operation");
				
				System.out.println("Enter the Product Id to Delete !! If Product Id matched then only it will Delete..");
				System.out.println("Enter the Product Id");
				int id = scanner.nextInt();
				String deleteResult = service.deleteById(id, updateDto);
				System.out.println(deleteResult);
				break;
			default:
				System.out.println("Enter proper value from 1 to 4");
			}
			System.out.println("----------------------------------");
			System.out.println("Enter the choice below to continue ");
			System.out.println("1.save");
			System.out.println("2.read");
			System.out.println("3.update");
			System.out.println("4.delete");
			choice = scanner.nextInt();
		}
		scanner.close();
	}
}

