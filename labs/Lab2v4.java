
import java.util.Scanner;
public class Lab2v4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter 4 integer numbers? ");
        int nbOne = scanner.nextInt(); 
        int nbTwo = scanner.nextInt();
        int nbThree = scanner.nextInt();
        int nbFour = scanner.nextInt();
        
        if (nbOne > nbTwo && nbTwo > nbThree && nbThree > nbFour)
         { 
        	 System.out.println();
        	 System.out.println("All the four numbers are in decreasing order.");
         }
        else if (nbOne < nbTwo && nbTwo < nbThree && nbThree < nbFour)
         {
        	 System.out.println();
        	 System.out.println("All the four numbers are in increasing order.");
         }
        
        else 
         { 
        	System.out.println();
            System.out.println("The four numbers are not in order.");
         } 
        
	    scanner.close();
	}

}
