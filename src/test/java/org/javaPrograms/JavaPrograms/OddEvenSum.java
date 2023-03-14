package org.javaPrograms.JavaPrograms;

public class OddEvenSum {

	public static void main(String[] args) {

				int evenCount = 0, oddCount = 0;

				for (int i = 10; i > 0; i--) {
					if (i % 2 == 0) {
						evenCount=evenCount+i;
					} else {
						oddCount=oddCount+i;
					}

				}
				System.out.println("even "+evenCount);
				System.out.println("odd "+oddCount);
			}

		



}
