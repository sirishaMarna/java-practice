package com.ssd;

import java.util.Scanner;

public class PrimeAndPalindromCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number:");
		int number = sc.nextInt();
		PrimeAndPalindromCount pp = new PrimeAndPalindromCount();
		pp.PrimeAndPalindromNumber(number);
	}

	public void PrimeAndPalindromNumber(int number) {
		int primeCount = 0;
		int palindromCount = 0;
		for (int i = 1; i <= number; i++) {
			if (isPrime(i)) {
				primeCount = primeCount + 1;
				System.out.println("prime number is:" + i);

			}
			if (isPalindrom(i)) {
				palindromCount = palindromCount + 1;

			}
		}
		System.out.println("prime count=" + primeCount);
		System.out.println("palindrom count=" + palindromCount);
	}

	public boolean isPrime(int n) {
		int factorCount = 0;
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					factorCount = factorCount + 1;

				}
				if (factorCount > 2) {
					break;
				}
			}
		}
		if (factorCount == 2) {
			return true;
		} else {
			return false;
		}
	}

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

}
