package com.xworkz.exception.runner;

public class MyArrayOutOfBoundExceptionRunner {

	public static void main(String[] args) {
		
		int[] score = {54,76,32,};
		
		try {
			System.out.println("Score at index 4:"+score[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			throw new ArrayIndexOutOfBoundsException("array index out of bound");
			
		}

	}

}
