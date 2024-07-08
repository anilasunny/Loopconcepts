package com.in.conditionloops;

public class WhileLoop {
	
	public void whileLoop() {
		
		int a=0;
		while(a<10) {
			System.out.println("Number is " +a);
			a=a+1;	
		}
		
	}
	
	public void doWhileLoop() {
		int a=0;
		do {
			System.out.println("Number is "+a);
			a=a+1;
		}while(a<10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop obj1 =new WhileLoop();
		obj1.whileLoop();
		System.out.println("############################");
		obj1.doWhileLoop();
	}

}
