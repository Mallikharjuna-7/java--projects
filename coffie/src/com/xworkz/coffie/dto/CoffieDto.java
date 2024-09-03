package com.xworkz.coffie.dto;


public class CoffieDto {

	//properties
	private String coffieName;
	private String flavour;
	private int price;
	private long customerPhoneNumber;
	private int quantity;
	
	public CoffieDto() {
		
	}
	
	public CoffieDto(String coffieName, String flavour, int price, long customerPhoneNumber, int quantity) {
		super();
		this.coffieName = coffieName;
		this.flavour = flavour;
		this.price = price;
		this.customerPhoneNumber = customerPhoneNumber;
		this.quantity = quantity;
	}

	public String getCoffieName() {
		return coffieName;
	}

	public void setCoffieName(String coffieName) {
		this.coffieName = coffieName;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(long customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	@Override
	public String toString() {
		return "Coffie Details:[Coffie Name:"+coffieName+", Flavour:"+flavour+", Price:"+price+
				", Customer PhoneNumber:"+customerPhoneNumber+", Quantity:"+quantity+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// null check
		if(obj == null) 
			return false;
		// same or not
		if(this != obj)
			return false;
		if(!(obj instanceof CoffieDto))
			return false;
		
		//downcasting
		CoffieDto coffeeDto = (CoffieDto)obj;
		
		if(coffeeDto.getCoffieName() != null && !coffeeDto.coffieName.equals(this.coffieName)
				|| this.customerPhoneNumber != coffeeDto.getCustomerPhoneNumber() ) 
			return false;
		
		if(coffeeDto.getFlavour() != null && !coffeeDto.flavour.equals(this.flavour))
			return false;
		
		if(coffeeDto.getPrice() != 0 && coffeeDto.getPrice() != this.price)
			return false;
		
		if(coffeeDto.getCustomerPhoneNumber() != this.customerPhoneNumber)
			return false;
		
		if(coffeeDto.getQuantity() != 0 && coffeeDto.getQuantity() != this.quantity)
			return false;
		
		return true;
	}
	
}
