// -------------------------------------------------------------------
// Assignment #3
// Written by: Ihana Fahmy 40209686
// For COMP 248 Section EC - Fall 2021
// -------------------------------------------------------------------

//********************************************************************
// Calender_Assign3.java
// Demonstrates a calendar that displays all the dates of the month that are not the multiple of the month of a leap or common year
// Input: A valid 4 digit year
// Output: All the dates of the months in the year that are NOT the multiple of the month
//********************************************************************

package assign40209686;

import java.util.Scanner; //import class for user input. 

public class Calender_Assign3 {

	public static void main(String[] args) {

		// scanner declared
		Scanner scan = new Scanner(System.in);

		// prints welcome message
		System.out.println("-------****-------****-------****-------****-----");
		System.out.println("      Welcome to Calendar Program!");
		System.out.println("-------****-------****-------****-------****-----");
		System.out.println();

		int incr;
		int year;
		do {

			// asking the user for a 4-digit year
			System.out.println("Please enter a 4-digit year:");
			year = scan.nextInt();

		} while (year < 1000 || year > 10000);

		// Prints that there are no dates that are not a multiple of 1 up to 31 for
		// January
		System.out.println();
		System.out.println();
		System.out.println("In January, the dates are not multiple of 1 are:\n" + "No dates are found in this month!");
		System.out.println();

		// depending on the user's year input it prints out whether it's a leap or
		// common year
		boolean leap = true;
		if (year % 400 == 0) {

			System.out.println("In February in a leap year, the dates are not multiple of 2 are:");
			leap = true;

		} else if (year % 100 != 0) {
			System.out.println("In February in a common year, the dates are not multiple of 2 are:");
			leap = false;

		} else if (year % 4 == 0) {
			System.out.println("In February in a leap year, the dates are not multiple of 2 are:");
			leap = true;
		} else {
			System.out.println("In February in a common year, the dates are not multiple of 2 are:");
			leap = false;
		}

		// prints out the dates that are not a multiple of 2 for February, up to 28 if
		// common year
		// and up to 29 if leap year
		if (leap) {

			for (int i = 1; i <= 29; i++) {

				if (i % 2 != 0)
					System.out.print(i + ", ");
			}
		}
		if (!leap) {

			for (int i = 1; i <= 28; i++) {

				if (i % 2 != 0)
					System.out.print(i + ", ");
			}
		}

		// prints out the dates that are not a multiple of 3 up to 31 for March
		System.out.println();
		System.out.println();
		System.out.println("In March, the dates are not multiple of 3 are:");

		incr = 0;
		for (int i = 1; i <= 31; i++) {

			if (i % 3 != 0) {

				incr++;
				if (incr % 16 == 0)
					System.out.print('\n');

				System.out.print(i + ", ");
			}
		}

		// prints out the dates that are not a multiple of 4 up to 30 for April
		System.out.println();
		System.out.println();
		System.out.println("In April, the dates are not multiple of 4 are:");

		incr = 0;
		for (int i = 1; i <= 30; i++) {

			if (i % 4 != 0) {

				incr++;
				if (incr % 16 == 0)
					System.out.print('\n');

				System.out.print(i + ", ");
			}
		}

		// prints out the dates that are not a multiple of 5 up to 31 for May
		System.out.println();
		System.out.println();
		System.out.println("In May, the dates are not multiple of 5 are:");

		incr = 0;
		for (int i = 1; i <= 31; i++) {

			if (i % 5 != 0) {

				incr++;
				if (incr % 16 == 0)
					System.out.print('\n');

				System.out.print(i + ", ");
			}
		}

		// prints out the dates that are not a multiple of 6 up to 30 for June
		System.out.println();
		System.out.println();
		System.out.println("In June, the dates are not multiple of 6 are:");

		incr = 0;
		for (int i = 1; i <= 30; i++) {

			if (i % 6 != 0) {

				incr++;
				if (incr % 16 == 0)
					System.out.print('\n');

				System.out.print(i + ", ");
			}
		}

		// prints out the dates that are not a multiple of 7 up to 31 for July
		System.out.println();
		System.out.println();
		System.out.println("In July, the dates are not multiple of 7 are:");

		incr = 0;
		for (int i = 1; i <= 31; i++) {

			if (i % 7 != 0) {

				incr++;
				if (incr % 16 == 0)
					System.out.print('\n');

				System.out.print(i + ", ");
			}
		}

		// prints out the dates that are not a multiple of 8 up to 31 for August
		System.out.println();
		System.out.println();
		System.out.println("In August, the dates are not multiple of 8 are:");

		incr = 0;
		for (int i = 1; i <= 31; i++) {

			if (i % 8 != 0) {

				incr++;
				if (incr % 16 == 0)
					System.out.print('\n');

				System.out.print(i + ", ");
			}
		}

		// prints out the dates that are not a multiple of 9 up to 30 for September
		System.out.println();
		System.out.println();
		System.out.println("In September, the dates are not multiple of 9 are:");

		incr = 0;
		for (int i = 1; i <= 30; i++) {

			if (i % 9 != 0) {

				incr++;
				if (incr % 16 == 0)
					System.out.print('\n');

				System.out.print(i + ", ");
			}
		}

		// prints out the dates that are not a multiple of 10 up to 31 for October
		System.out.println();
		System.out.println();
		System.out.println("In October, the dates are not multiple of 10 are:");

		incr = 0;
		for (int i = 1; i <= 31; i++) {

			if (i % 10 != 0) {

				incr++;
				if (incr % 16 == 0)
					System.out.print('\n');

				System.out.print(i + ", ");
			}
		}

		// prints out the dates that are not a multiple of 11 up to 30 for November
		System.out.println();
		System.out.println();
		System.out.println("In November, the dates are not multiple of 11 are:");

		incr = 0;
		for (int i = 1; i <= 30; i++) {

			if (i % 11 != 0) {

				incr++;
				if (incr % 16 == 0)
					System.out.print('\n');

				System.out.print(i + ", ");
			}
		}

		// prints out the dates that are not a multiple of 12 up to 31 for December
		System.out.println();
		System.out.println();
		System.out.println("In December, the dates are not multiple of 12 are:");

		incr = 0;
		for (int i = 1; i <= 31; i++) {

			if (i % 12 != 0) {

				incr++;
				if (incr % 16 == 0)
					System.out.print('\n');

				System.out.print(i + ", ");
			}
		}

		// prints closing message
		System.out.println();
		System.out.println();
		System.out.println("Thank you for using this program!!");

		// close Scanner Object
		scan.close();
	} // end of main()

} // end of Class Calender_Assign3
