package com.logics.stringmethods.runner;

import java.nio.charset.StandardCharsets;

public class StringRunner {
	
	
	public static void main(String[] args) {
		
		System.out.println("1.no argument");
		String string1 = new String();
		System.out.println(string1);
		
		System.out.println("2.array of bytes using the platform's default charset");
		byte[] bytes = {72,101,108,108,111,72,72,72,111};
		String string2 = new String(bytes);
		System.out.println(string2);
		
		System.out.println("3.array of bytes using the specified charset");
		String string3 = new String(bytes,StandardCharsets.UTF_16LE);
		System.out.println(string3);
		
		System.out.println("4.byte,hibyte");
		String string4 = new String(bytes ,1);
		System.out.println(string4);
		
		System.out.println("5.byte,offset,length");
		String string5 = new String(bytes,0,bytes.length);
		System.out.println(string5);
		
		System.out.println("6.byte,offset,legth,charset");
		String string6 = new String(bytes,0,bytes.length,StandardCharsets.US_ASCII);
		System.out.println(string6);
		
		System.out.println("7.byte,hibyte,offset,count");
		String string7 = new String(bytes,1,2,4);
		System.out.println(string7);
		
		System.out.println("8.char");
		char[] value = {'A','B','C','D','E','F','G','H'};
		String string8 = new String(value);
		System.out.println(string8);
		
		System.out.println("9.char,offset,count");
		String string9 = new String(value,2,4);
		System.out.println(string9);
		
		System.out.println("10.codePoints,offset,count");
		int[] codePoints = {72,101,108,108,111,72};
		String string10 = new String(codePoints,2,4);
		System.out.println(string10);
		
		System.out.println("11.string");
		String original = "mallikharjun";
		String string11 = new String(original);
		System.out.println(string11);
		
		System.out.println("12.stringBuffer");
		StringBuffer stringBuffer = new StringBuffer("Hello,Good Morning");
		String string12 = new String(stringBuffer);
		System.out.println(string12);
		
		System.out.println("13.stringBuilder");
		StringBuilder stringBuilder = new StringBuilder("Hello,Good Evening");
		String string13 = new String(stringBuilder);
		System.out.println(string13);
		
		
	}

}
