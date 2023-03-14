import java.util.Scanner;

public class PositiveOrNegativeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//Type1
		/*
		 * if (n > 0) { System.out.println(n + " is Positive Number"); } else if (n < 0)
		 * { System.out.println(n + " is Negative Number"); } else {
		 * System.out.println("given Number is " + n); }
		 */
		//Type2
		if (n == 0) {
			System.out.println("given Number is " + n);
		} else {
			String result = n > 0 ? "Positive Number" : "Negative Number";
			System.out.println(result);
		}
		sc.close();
	}
}
