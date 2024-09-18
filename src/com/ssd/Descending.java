package com.ssd;

public class Descending {

	public static void main(String[] args) {
		int array[]= {7,98,52,2,45,11,8};
		System.out.println("Descending order:");
		for(int i=0;i<array.length;i++) {
			int temp=0;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]<array[j]) {
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
				
			}
			System.out.println(array[i]);
		}
		
		
	}

}
