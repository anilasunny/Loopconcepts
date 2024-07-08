package com.loop.assignments;

import java.util.Scanner;

public class Swapwithoutvariable {
	
	public void swap(int a, int b)
	{
		a =a+b;
		b =a-b;
		a =a-b;
		System.out.println("After swap without a temp variable");
		System.out.println("First number: "+a);
		System.out.println("Second number: "+b);
	}

	public static void main(String[] args) {
		Swapwithoutvariable obj1 =new Swapwithoutvariable();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		int firstnum =sc.nextInt();
		System.out.println("Enter Second number");
		int secondnum = sc.nextInt();
		System.out.println("The numbers before swap");
		System.out.println("First number "+firstnum);
		System.out.println("Second number "+secondnum);
		obj1.swap(firstnum, secondnum);
		// TODO Auto-generated method stub

	}

}
