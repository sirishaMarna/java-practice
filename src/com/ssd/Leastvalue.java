package com.ssd;

public class Leastvalue {

	public static void main(String[] args) {
		int array[] = { 85, 25, 45, 78, 23, 11, 5 };
		int leastvalue = 85;
		for (int i = 1; i < array.length; i++) {
			if (array[i] <leastvalue) {
				leastvalue = array[i];
			}
		}
		System.out.println("Least value:" + leastvalue);

	}
}