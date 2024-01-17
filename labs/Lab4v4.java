


import java.util.Scanner;

public class Lab4v4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one word:");
		String word = scan.next();
		System.out.print("The new word is: ");
		for (int i = 0; i < word.length() + 1; i++) {

			if (i == 1) {

				System.out.print(word.substring(word.length() - (i)) + word.substring(word.length() - (i)));

			} else if (i > 1) {

				System.out.print(word.substring(word.length() - (i), word.length() - (i - 1))
						+ word.substring(word.length() - (i), word.length() - (i - 1)));
			}

		}
		System.out.println();

		System.out.println("What a cool word!");
		scan.close();
	}

}
