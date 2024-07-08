package com.loop.assignments;

import java.util.Scanner;

public class FibnocciSeries {
	public void fibnocci(int n) {
		int first=1;
		int second=1;
		int temp =0;
		System.out.println(first);
		System.out.println(second);
		for(int i=1;i<=n;i++) {
			
			int sum =first+second;
			System.out.println(sum);
			first =second;
			second=sum;			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibnocciSeries obj1 =new FibnocciSeries();
		System.out.println("Enter a number");
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		obj1.fibnocci(num);

	}

}
