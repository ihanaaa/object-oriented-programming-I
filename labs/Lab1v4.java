
import java.util.Scanner;

public class Lab1v4 {

	public static void main(String[] args) {
		
		final int PRICE = 2;
		int amount, cups, balance;		
	Scanner mKeyboard = new Scanner(System.in);
		
	System.out.print("Amount you wish to prepay: $");
	amount = mKeyboard.nextInt();
	System.out.println("");
	
	cups = amount/PRICE;
	balance = amount%PRICE;
	System.out.println("With $" + amount + " you can buy " + 
	                       cups + " cups and will have a balance of $" +
			                    balance + ".");
	
	mKeyboard.close();
		
	}

}
