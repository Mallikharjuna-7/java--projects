package com.xworkz.complaintsinformation.runner;

import java.util.Scanner;

import com.xworkz.complaintsinformation.dto.ComplaintDto;
import com.xworkz.complaintsinformation.repository.ComplaintRepoImplementation;
import com.xworkz.complaintsinformation.service.ComplaintService;
import com.xworkz.complaintsinformation.service.ComplaintServiceImplements;

public class ComplaintRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the choice below");
		System.out.println("1.save operation");
		System.out.println("2.read operation");
		System.out.println("3.update operation");
		System.out.println("4.delete operation");

		int choice = scanner.nextInt();

		ComplaintService service = new ComplaintServiceImplements(new ComplaintRepoImplementation());

		ComplaintDto dto = new ComplaintDto();
		ComplaintDto updateDto = new ComplaintDto();

		while ( choice >= 0) {

			switch (choice) {
			case 1:
				System.out.println("Save operation!!");
				
				System.out.println("Enter the Complaint Id");
				dto.setComplaintId(scanner.nextInt());

				System.out.println("Enter the User Id");
				dto.setUserId(scanner.nextInt());

				System.out.println("Enter the Complaint Type");
				dto.setComplaintType(scanner.next());

				System.out.println("Enter the Assigned to");
				dto.setAssignedTo(scanner.next());

				System.out.println(service.validate(dto));

				break;
			case 2:
				System.out.println("Read Opeartion");
				System.out.println(service.getAll());
				break;
			case 3:
				System.out.println("Enter the details to Update! If Complaint Id matched then only it will Update..");
				
				System.out.println("Enter the Complaint Id");
				updateDto.setComplaintId(scanner.nextInt());

				System.out.println("Enter the User Id");
				updateDto.setUserId(scanner.nextInt());

				System.out.println("Enter the Complaint Type");
				updateDto.setComplaintType(scanner.next());

				System.out.println("Enter the Assigned to");
				updateDto.setAssignedTo(scanner.next());

				String updateResult = service.updateById(updateDto.getComplaintId(), updateDto);
				System.out.println(updateResult);
				break;
			case 4:
				System.out.println("Delete operation");
				
				System.out.println("Enter the Complaint Id to Delete !! If complaint Id matched then only it will Delete..");
				System.out.println("Enter the Complaint Id");
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
