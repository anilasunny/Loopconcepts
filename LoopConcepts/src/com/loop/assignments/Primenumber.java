package com.loop.assignments;

import java.util.Scanner;

public class Primenumber {

	public boolean prime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		Primenumber obj1 = new Primenumber();
		if (obj1.prime(a)) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime");
		}

	}

}
