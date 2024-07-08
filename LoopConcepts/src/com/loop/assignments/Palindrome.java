package com.loop.assignments;

import java.util.Scanner;

public class Palindrome {
	int rev =0;
	public int palindromeCheck(int num) {
		int reversed_n =0;
		while(num>0)
		{			
			reversed_n =reversed_n *10 + num%10;
			num =num/10;
		}
		return reversed_n;
	}

	public static void main(String[] args) {
		
		Palindrome obj1 =new Palindrome();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int  a =sc.nextInt();
		int rev = obj1.palindromeCheck(a);
		if (a==rev)			
			System.out.println("The number is Palindrome: "+ a );
		else
			System.out.println("The number is not palindrome: " +a);		
	}

}
