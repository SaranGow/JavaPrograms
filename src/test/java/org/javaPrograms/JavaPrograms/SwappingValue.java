package org.javaPrograms.JavaPrograms;

public class SwappingValue {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("before swap");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		int c = a;
			a = b;
			b = c;
			
			System.out.println("after swap");
			System.out.println("a is "+a);
			System.out.println("b is "+b);	
			System.out.println("c is "+c);
			
	}
}
