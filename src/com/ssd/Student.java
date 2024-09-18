package com.exampleskar;

import java.util.Comparator;
import java.util.Iterator;

public class Student implements Comparable<Student>  {
	
	
	public String name;
	public Integer rollNo;
	public String id;
	
	
	public Student(String name, Integer rollNo, String id) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.id = id;
	}
	
	

	public Student() {
		super();
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", id=" + id + "]";
	}



	/*@Override
	public int compareTo(Student o) {
		
		return this.rollNo-o.rollNo;
	}


*/
	//rollNo.compareTo(o.getRollNo());
	



	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.getName());
	}

	


	


	
	
	

}
