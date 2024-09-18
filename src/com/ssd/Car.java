package com.ssd;

public class Car {
public  String name;
public   String colour;
public  float speed;
public float getCarSpeed( int distance,int time) {
	float speed=0.0f;
 	speed=distance/time;
	return speed;
	
}
	public void getCarDetails() {
		System.out.println("Car name="+name);
		System.out.println("Car colour="+colour);
		System.out.println("Car speed="+speed);
		
	}
	public static void main(String[] args) {
		Car swift=new Car();
		swift.name="Swift";
		swift.colour="Blue";
		
		swift.speed=swift.getCarSpeed(2589,25);
		swift.getCarDetails();
		
		Car tata=new Car();
		tata.name="TATA";
		tata.colour="Black";
		tata.speed=tata.getCarSpeed(5896,21);
		tata.getCarDetails();
		
		
		
		
	}
	
	
}
