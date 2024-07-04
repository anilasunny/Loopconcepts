package com.in.conditionloops;

import java.util.Scanner;

public class Ifstatement {
	public void oddorEven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numer");
		
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("even number " + a);
		} else
			System.out.println("odd number " + a);
	}

	public static void main(String[] args) {
		Ifstatement obj1 = new Ifstatement();
		obj1.oddorEven();
		// TODO Auto-generated method stub

	}

}
