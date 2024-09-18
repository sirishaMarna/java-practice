package com.ssd;

public class Swap {

	public static void main(String[] args) {

		int a = 40;
		int b = 35;

		System.out.println("before swaping:"+a+","+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swaping:"+a+","+b);

	}

}
