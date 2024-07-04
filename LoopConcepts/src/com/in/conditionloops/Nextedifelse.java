package com.in.conditionloops;

import java.util.Scanner;

public class Nextedifelse {
	public void nextedLoop() {
	System.out.println("Enter a number");
	Scanner sc =new Scanner(System.in);
	int a= sc.nextInt();
	if(a>0) {
		if(a%2 ==0)
			System.out.println("even number");
		else
			System.out.println("Odd number");
	}
	else
		System.out.println("Enter a posive number");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nextedifelse obj1 =new Nextedifelse();
		obj1.nextedLoop();
	}

}
