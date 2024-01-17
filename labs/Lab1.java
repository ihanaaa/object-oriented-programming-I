import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		StringBuilder word = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");

		String originalWord = scan.next();
		word.append(originalWord);

		word.reverse();
		int i, k;
		String sub = word.toString().substring(0, word.length() - 1);

		System.out.println("Here are the substrings of " + sub + ":");
		System.out.println(sub.toUpperCase());

		for (i = 1; i < sub.length(); i++) {
			for (k = 0; k < sub.length() - i; k++) {

				if (i % 2 == 0) {
					System.out.print(sub.toUpperCase().charAt(k));

				}

				if (i % 2 != 0) {
					System.out.print(sub.toLowerCase().charAt(k));

				}

			}
			System.out.println();
		}

		System.out.println("Nice one!");
		scan.close();
	}

}
