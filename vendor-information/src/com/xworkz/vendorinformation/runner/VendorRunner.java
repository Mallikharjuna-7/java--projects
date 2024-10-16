package com.xworkz.vendorinformation.runner;

import java.util.Scanner;

import com.xworkz.vendorinformation.dto.VendorDto;
import com.xworkz.vendorinformation.repository.VendorRepoImplimentation;
import com.xworkz.vendorinformation.service.VendorService;
import com.xworkz.vendorinformation.service.VendorServiceImplementation;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class VendorRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the choice below");
		System.out.println("1.save");
		System.out.println("2.read");
		System.out.println("3.update");
		System.out.println("4.delete");

		int choice = scanner.nextInt();

		VendorService service = new VendorServiceImplementation(new VendorRepoImplimentation());

		VendorDto dto = new VendorDto();
		VendorDto newDto = new VendorDto();

		while ( choice >= 0) {

			switch (choice) {
			case 1:
				System.out.println("Save operation!!");
				
				System.out.println("Enter the Vendor Id");
				dto.setVendorId(scanner.nextInt());

				System.out.println("Enter the Vendor Name");
				dto.setVendorName(scanner.next());

				System.out.println("Enter the Product Type");
				dto.setProductType(scanner.next());

				System.out.println("Enter the Vendor Email Id");
				dto.setVendorEmailId(scanner.next());

				System.out.println("Enter the Vendor Contact Number");
				dto.setVendorContactNumber(scanner.nextLong());

				System.out.println(service.validate(dto));

				break;
			case 2:
				System.out.println("Read Opeartion");
				System.out.println(service.getAll());
				break;
			case 3:
				System.out.println("Enter the details to Update! If Vendor Id matched then only it will Update..");
				
				System.out.println("Enter the Vendor Id");
				newDto.setVendorId(scanner.nextInt());

				System.out.println("Enter the Vendor Name");
				newDto.setVendorName(scanner.next());

				System.out.println("Enter the Product Type");
				newDto.setProductType(scanner.next());

				System.out.println("Enter the Vendor Email Id");
				newDto.setVendorEmailId(scanner.next());

				System.out.println("Enter the Vendor Contact Number");
				newDto.setVendorContactNumber(scanner.nextLong());

				String updateResult = service.updateById(newDto.getVendorId(), newDto);
				System.out.println(updateResult);
				break;
			case 4:
				System.out.println("Delete operation");
				
				System.out.println("Enter the Vendor Id to Delete !! If Vendor Id matched then only it will Delete..");
				System.out.println("Enter the Vendor Id");
				int id = scanner.nextInt();
				String deleteResult = service.deleteById(id, newDto);
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
