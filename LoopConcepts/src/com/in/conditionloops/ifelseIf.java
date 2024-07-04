package com.in.conditionloops;

import java.util.Scanner;

public class ifelseIf {
	public void findGrade() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark =sc.nextInt();
		if(mark>=90)
			System.out.println("Grade A+");
		else if (mark>=80 && mark <90)
			System.out.println("Grade A");
		else if (mark>=70 && mark <80)
			System.out.println("Grade B+");
		else if (mark>=60 && mark <70)
			System.out.println("Grade B");
		else if (mark>=50 && mark <60)
			System.out.println("Grade C+");
		else if (mark>=40 && mark <50)
			System.out.println("Grade C");
		else 
			System.out.println("Fail");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifelseIf obj1 =new ifelseIf();
		obj1.findGrade();

	}

}
