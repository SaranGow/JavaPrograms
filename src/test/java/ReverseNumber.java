import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		// Approch 1
		/*
		 * int rev = 0; while (number != 0) { rev = rev * 10 + number % 10;// 4321
		 * number = number / 10;// 0 }
		 */

		// Approch 2
		/*
		 * StringBuffer sb = new StringBuffer(String.valueOf(number)); StringBuffer rev
		 * = sb.reverse();
		 */
		// Approch 3

		StringBuilder sbl = new StringBuilder();
		sbl.append(number);
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);
	}
}
