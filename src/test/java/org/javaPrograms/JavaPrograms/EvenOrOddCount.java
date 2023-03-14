package org.javaPrograms.JavaPrograms;
import java.util.Iterator;

public class EvenOrOddCount {

	public static void main(String[] args) {
		int evenCount = 0, oddCount = 0;

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}

		}
		System.out.println("even "+evenCount);
		System.out.println("odd "+oddCount);
	}

}
