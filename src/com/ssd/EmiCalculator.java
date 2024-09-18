package com.ssd;

public class EmiCalculator {

	public int getYearlyEmi(int p,int t,int r) {
	return	(p*r*t)/100;
		
	}
	public int getMonthlyEmi(int p,int r) {
		return p*r/100;
	}
	public static void main(String[] args) {
		EmiCalculator emiy=new EmiCalculator();
		int emiy1=emiy.getYearlyEmi(20000,12,3);
		
		System.out.println("Yearly Emi="+emiy1);
				
		int emim=emiy.getMonthlyEmi(20000,3);
		System.out.println("Monthly Emi="+emim);
	}
}
