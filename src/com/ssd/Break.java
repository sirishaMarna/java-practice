package com.ssd;

public class Break {
	public static void main(String[] args) {
		int n = 25;
		System.out.println("Break example program");
		for (int i = 0; i <= n; i++) {

			if (i == 7) {

				break;

			}
			System.out.println("break:" + i);

		}
		for (int i = 0; i <= n; i++) {

			if (i == 5) {

				continue;

			}
			System.out.println("continue:" + i);
		}
	}
}
