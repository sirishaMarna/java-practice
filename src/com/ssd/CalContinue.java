
package com.ssd;

import java.util.Scanner;

public class CalContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter num1");
		int num1 = sc.nextInt();
		System.out.println("please enter num2");
		int num2 = sc.nextInt();
		System.out.println("please enter opertor");
		String operator = sc.next();

		Calculator cal = new Calculator();
		if (operator.equals("+")) {
			int sum = cal.add(num1, num2);
			System.out.println(sum);

		}
		if (operator.equals("-")) {
			int sum = cal.sub(num1, num2);
			System.out.println(sum);

		}
		if (operator.equals("*")) {
			int sum = cal.mul(num1, num2);
			System.out.println(sum);

		}
		if (operator.equals("/")) {
			if (num2 > 0) {
				int sum = cal.div(num1, num2);
				System.out.println(sum);
			} else {
				System.out.println("please enter valid number");
			}

		}

	}

}
