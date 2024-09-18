package com.ssd;

public class ParticularTable {

	public static void main(String[] args) {
		int i=134;
		if( i>=100 && i<=250) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			
		}else {
			System.out.println("please enter valid number:");
		}

	}

}
