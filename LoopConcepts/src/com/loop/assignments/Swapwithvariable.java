package com.loop.assignments;

import java.util.Scanner;

public class Swapwithvariable {
	int c =0;
	public void swap(int a, int b)
	{
		c=a;
		a=b;
		b=c;
	System.out.println("After swap");
	System.out.println("First number: "+a);
	System.out.println("Second number: "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapwithvariable obj1 =new Swapwithvariable();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		int firstnum =sc.nextInt();
		System.out.println("Enter Second number");
		int secondnum = sc.nextInt();
		System.out.println("The numbers before swap");
		System.out.println("First number "+firstnum);
		System.out.println("Second number "+secondnum);
		obj1.swap(firstnum, secondnum);
				

	}

}
