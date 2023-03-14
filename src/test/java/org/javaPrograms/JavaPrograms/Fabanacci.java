package org.javaPrograms.JavaPrograms;

public class Fabanacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for (int i = 0; i < 7; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}

}

//i= 0 1 
//a = 1 b=1   i= 1
//2 a =1 b=2	i=2
//3 a= 2 b=3	i=3
//5 a=3 b=5
