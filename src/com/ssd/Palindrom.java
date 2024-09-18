package com.ssd;

import java.util.Scanner;

public class Palindrom {

	public boolean isPalindrom(int n) {
		int x = n;
		int sum = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		if (sum == x) {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Palindrom pd = new Palindrom();
		System.out.println("Please enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = pd.isPalindrom(n);
		if (result) {
			System.out.println("given number is palindrom");

		} else {
			System.out.println("given number not a palindrom");
		}

	}

}
