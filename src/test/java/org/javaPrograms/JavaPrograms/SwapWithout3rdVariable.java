package org.javaPrograms.JavaPrograms;

public class SwapWithout3rdVariable {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("before swap");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("after swap");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
	}
}
