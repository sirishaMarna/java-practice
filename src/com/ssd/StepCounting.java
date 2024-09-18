package com.ssd;

import java.util.Scanner;

public class StepCounting {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter your number=");
	int n=sc.nextInt();

	int noofsteps=0;
	
	while(n!=1) {
		noofsteps=noofsteps+1;
		if(n%2==0) {
			n=n/2;
		}
		else {
			n=(n*3)+1;
		}
	}
		System.out.println("No.of Steps="+noofsteps);
	
}
}
