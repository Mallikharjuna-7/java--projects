package com.flipkart.sandwichmaker.service;

import com.flipkart.sandwichmaker.dto.SandwichMakerDto;
import com.flipkart.sandwichmaker.util.SanwichMakerUtil;

public class SandwichMaker {

	private int index = 0;
	private SandwichMakerDto[] listOfSandwichMakerDto;
	
	//constructor
	public SandwichMaker(int arraySize) {
	this.listOfSandwichMakerDto = new SandwichMakerDto[arraySize];
	}
	
	//method for array length
	public int getArrayLength() {
		return listOfSandwichMakerDto.length;
	}
	
	//save operation
	public String onSave(SandwichMakerDto sandwichMakerDto) {
		boolean checkDuplicate = SanwichMakerUtil.checkDuplicate(listOfSandwichMakerDto, sandwichMakerDto);
		if(sandwichMakerDto != null ) {
			if(!checkDuplicate) {
				if(this.index < listOfSandwichMakerDto.length) {
					listOfSandwichMakerDto[index] = sandwichMakerDto;
					index++;
					return "Saved Successfully";
				}
			}
		}
		return "Not Saved";
	}
	//read
		public SandwichMakerDto read() {
			if(index < listOfSandwichMakerDto.length) {
				for(SandwichMakerDto dto : listOfSandwichMakerDto)
			return dto;
			}
		return null;
		}
	
	//search
//	public SandwichMakerDto search(SandwichMakerDto brand) {
//		for(SandwichMakerDto dto : listOfSandwichMakerDto) {
//			if( dto != null && brand != null ) {
//			return ;
//			}
//		}
//	}
}
