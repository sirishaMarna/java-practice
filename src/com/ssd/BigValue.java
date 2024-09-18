package com.ssd;

public class BigValue {

	public static void main(String[] args) {
		int array[] = { 78, 55, 101, 56, 23, 87, 23 };

		System.out.println("big number:");
		int big = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > big) {
				big = array[i];
			}
		}
		System.out.println(big);
	}

}
