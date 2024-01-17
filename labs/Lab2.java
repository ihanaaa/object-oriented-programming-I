import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an odd length word: ");
		String input = scan.next();
		
		char[] word_array = input.toCharArray();
		char swap = word_array[0];
		word_array[0]=word_array[(input.length()/2)];
		word_array[(input.length()/2)] = swap;
		
		String swapped_word = new String(word_array);
		System.out.println(swapped_word);
		
		int j = 0;
		for (int i = 0; i < swapped_word.length(); i++) {
			if (i != 0)
				j++;

			for (int k = j; k < swapped_word.length(); k++) {

				System.out.print(swapped_word.substring(k, k + 1).concat("@") + '\t');

			}
			System.out.println();

		}
		
		System.out.println("\nBravo!");
		scan.close();

	}

}
