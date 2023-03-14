public class ReverseTheWord {
	public static void main(String[] args) {
		String s = "Today is Monday";

		String revWholeWord = "";

		String word[] = s.split(" ");

		for (int i = 0; i < word.length - 1; i++) {
			String eachWord = word[i];
			String rev = " ";
			for (int j = eachWord.length() - 1; j >= 0; j--) {
				char c = eachWord.charAt(j);
				rev = rev + c;
			}
			revWholeWord = revWholeWord + rev + " ";

		}

		System.out.println(revWholeWord);
	}
}
