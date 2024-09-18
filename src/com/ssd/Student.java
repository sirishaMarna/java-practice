package com.ssd;

public class Student {
	public static int telugu;
	public static int hindi;
	public static int english;
	public static int maths;
	public static int science;
	public static int social;

	public boolean isPassOrFail(int marks) {
		boolean isPass = false;
		if (marks >= 35) {
			isPass = true;
		} else {
			isPass = false;
		}
		return isPass;
	}

	public int totalMarks(int telugu, int hindi, int english, int maths, int science, int social) {
	int	totalMarks = telugu + hindi + english + maths + science + social;
		return totalMarks;
	}

	public String grade(int totalMarks) {
		String grade = " ";
		if (totalMarks > 360) {
			grade = "First class";

		} else if (totalMarks > 300 && totalMarks < 359) {
			grade = "Second class";
		} else if (totalMarks > 250 && totalMarks < 299) {
			grade = "Third class";

		} else {
			grade = "Fail...";
		}
		return grade;

	}

	public static void main(String[] args) {
		Student siri = new Student();
		siri.telugu = 98;
		siri.hindi = 86;
		siri.english = 95;
		siri.maths = 86;
		siri.science = 100;
		siri.social = 99;

		boolean istelugupass = siri.isPassOrFail(telugu);
		boolean ishindipass = siri.isPassOrFail(hindi);
		boolean isenlishpass = siri.isPassOrFail(english);
		boolean ismathspass = siri.isPassOrFail(maths);
		boolean issciencepass = siri.isPassOrFail(science);
		boolean issocialpass = siri.isPassOrFail(social);
		if (istelugupass && ishindipass && isenlishpass && ismathspass && issciencepass && issocialpass) {
			int allSubjectMarks = siri.totalMarks(telugu, hindi, english, maths, science, social);
			String studentClass = siri.grade(allSubjectMarks);
			System.out.println("pass with....😍" + allSubjectMarks +"...." + studentClass);
		} else {
			int allSubjectMarks = siri.totalMarks(telugu, hindi, english, maths, science, social);
			System.out.println("Fail with" );
		}
	}

}