package com.xworkz.exceptionblocks.runner;

import com.xworkz.exceptionblocks.service.ArrayExeception;

//unchecked exception with try-finally

public class ArrayExeceptionRunner {

	public static void main(String[] args) throws ArrayExeception {
		

		try {
			int[] scores = {45,95,34,67,86};
			System.out.println("index of 7: "+scores[7]);
			throw new ArrayExeception("Array out of bound Exception");
			
		}finally {
			System.out.println("final block.. it will always print");
		}

	}

}
