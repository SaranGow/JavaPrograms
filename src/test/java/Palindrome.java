public class Palindrome {
	public static void main(String[] args) {
		String s = "madam";
		int size = s.length();
		char x[] = s.toCharArray();
		char a[] = new char[size];
		int i = 0;
		while (i != size) {
			a[size - 1 - i] = x[i];
			i++;
		}
		System.out.println(s);
		System.out.println(a);

		int j = 0;
		while (j != size) {
			if (a[j] != x[j]) {
				System.out.println("It is not a palindrome");
				System.exit(0);
			} else {
				j++;
				continue;
			}
		}
		System.out.println("It is a palindrome");
	}
}
