package com.ssd;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("please enter number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int primeCount = 0;
		for (int i = 1; i <= num; i++) {
			int factorCount = 0;
			if (i >= 1) {
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						factorCount = factorCount + 1;

					}
					if (factorCount > 2) {
						break;
					}
				}
				if (factorCount == 2) {
					primeCount = primeCount + 1;
					System.out.println("prime number=" + i);
				} else {
					// System.out.println("not a prime number");
				}
			}
		}

		System.out.println("primecount.." + primeCount);
	}
}
