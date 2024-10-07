package com.xworkz.clonemethod.runner;

//shallow cloning 

public class Properties implements Cloneable {

	public String name;
	public int price;

	@Override
	public Properties clone() throws CloneNotSupportedException {
		System.out.println("Clone method invoked");
		return (Properties)super.clone();
	}

	@Override
	public String toString() {
		return "Properties [name=" + name + ", price=" + price + "]";
	}

}
