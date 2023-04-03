// -------------------------------------------------------------------
// Assignment #3
// Written by: Ihana Fahmy 40209686
// For COMP 248 Section EC - Fall 2021
// -------------------------------------------------------------------

//********************************************************************
// ShopList_Assign3.java
// Demonstrates a shopping lists based on the user's items and prices 
// Input: Sequence of items and price
// Output: The list of the items and the total price
//********************************************************************

package assign40209686;

import java.util.Scanner; //import class for user input. 

public class ShopList_Assign3 {

	public static void main(String[] args) {

		// scanner declared
		Scanner scan = new Scanner(System.in);

		// prints welcome message
		System.out.println("-------****-------****-------****-------****-----");
		System.out.println("      Welcome to Shopping List Program!");
		System.out.println("-------****-------****-------****-------****-----");
		System.out.println();

		// asks for user input of item and item prices
		System.out.println("Please enter your shopping list (item$price and seperate by comma):");
		String itemPrice = scan.next();
		scan.close(); // close Scanner Object

		int i, k, n;
		int totalPrice = 0;
		int col = 0;
		int[] price;
		int count = 0;
		char[][] items;
		String shorter = itemPrice;
		int maxLength = 0;

		// prints out a message for 0 items if user inputs 0
		if (itemPrice.equals("0")) {
			System.out.println();
			System.out.println("You have 0 items in the list now!");
		}

		else {

			// determines the size of the integer 1D array and the row of the char 2D array
			for (i = 0; i < itemPrice.length(); i++) {

				if (itemPrice.charAt(i) == '$') {
					count++;
				}
			}

			// the size of the integer 1D array is determined
			price = new int[count];

			/*
			 * places the price into an integer 1D array and determines the size of the
			 * longest string
			 */
			for (k = 0; k < price.length; k++) {
				String fullPrice = shorter.substring(shorter.indexOf('$') + 1, shorter.indexOf(','));
				int fullPriceInt = Integer.parseInt(fullPrice);

				price[k] = fullPriceInt;

				int stringLength = shorter.substring(0, shorter.indexOf('$')).length();
				if (maxLength < stringLength)
					maxLength = stringLength;

				shorter = shorter.substring(shorter.indexOf(',') + 1);
			}

			shorter = itemPrice;

			items = new char[count][maxLength];

			// places the characters into the char 2D array
			for (k = 0; k < price.length; k++) {
				col = 0;
				String fullItems = shorter.substring(0, shorter.indexOf('$'));
				for (n = 0; n < fullItems.length(); n++) {
					items[k][col] = fullItems.charAt(n);
					col++;

				}
				shorter = shorter.substring(shorter.indexOf(',') + 1);
			}

			// prints the list of items and the total price
			System.out.println("\nHere is the list of items:\n");

			for (i = 0; i < items.length; i++) {
				System.out.print("No." + (i + 1) + " ");
				for (k = 0; k < items[i].length; k++) {
					System.out.print(items[i][k]);
				}
				System.out.println();
			}
			for (i = 0; i < price.length; i++) {
				totalPrice += price[i];
			}
			System.out.println("The total price is: $" + totalPrice + ".\n");
		}

		// prints closing message
		System.out.println();
		System.out.println("Thank you for using this program!!");

	} // end of main()

} // end of Class ShopList_Assign3
