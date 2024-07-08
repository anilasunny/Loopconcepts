package com.loop.assignments;

import java.util.Scanner;

public class Factorial {
	
	public void fact(int n) {
		int f=1 ,i=1;
		while(i<=n)
		{
			 f = f*i;
			 i++;
			
		}
		System.out.println("Factorial is: "+f);
	}

	public static void main(String[] args) {
		Factorial obj1 =new Factorial();
		System.out.println("Enter a number");
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		obj1.fact(num);
		// TODO Auto-generated method stub

	}

}
