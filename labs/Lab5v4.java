import java.util.Scanner;

public class Lab5v4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = scan.next();

		int j = 0;
		for (int i = 0; i < word.length(); i++) {
			if (i != 0)
				j++;

			for (int k = j; k < word.length(); k++) {

				System.out.print(word.substring(k, k + 1).concat("#") + '\t');

			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Pretty triangle!");
		scan.close();
	}

}
