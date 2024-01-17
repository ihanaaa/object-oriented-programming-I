
import java.util.Scanner;

public class Lab6v4 {

	public static void main(String[] args) {
		StringBuilder word2 = new StringBuilder();
		Scanner scan = new Scanner(System.in);

		int i;
		int j;
		
		System.out.print("Enter a word of odd length: ");
		String word = scan.next();
		System.out.println();
		
		word2.append(word);
		word2.reverse();
        int space = 0;
        
		for (i = 1; i <= word2.length()/ 2+1; i++) {
			for (j =1; j <= word2.length(); j++) {
				
				if (i == j || (i+j) == (word2.length()+1)) {
					
				System.out.print(word2.charAt(space));
				}
				
				else { 
					System.out.print(" ");
				}
			}
			space++;
			System.out.println();	
		}
		
		for (i = 1; i <= word2.length()/ 2; i++) {
			
			for (int k =1; k <= word2.length()/2-i; k++) 
				System.out.print(" ");
			
				System.out.print(word2.toString().charAt(space));
			
			for (int k = 1; k <= 2*i-1; k++) 
				System.out.print(" ");
			System.out.println(word2.charAt(space++));
		}
		
		System.out.println("\nGood job!");
		System.out.println();

		scan.close();
	}

}
