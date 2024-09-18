package com.ssd;

public class Cube {

	public static void main(String[] args) {
		int result=0;
		int sum=0;
		int array[]= {2,5,7,8,3,1,9};
		for(int i=0;i<array.length;i++) {
			result=(array[i]*array[i]*array[i]);
			sum=sum+(array[i]*array[i]*array[i]);
			System.out.println("cube of num:"+result);
			if(result%2==0) {
				System.out.println("even num:"+result);
			}else {
				System.out.println("odd num:"+result);
			}
			System.out.println("total cube sum:"+sum);
			if(sum%2==0) {
				System.out.println("even sum:"+sum);
			}else {
				System.out.println("odd sum:"+sum);
			}
			
		}

	}

}
