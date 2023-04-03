
// ---------------------------------------------------------
// Assignment #1
// Written by: Ihana Fahmy 40209686
// For COMP 248 Section EC - Fall 2021
// ---------------------------------------------------------

// ---------------------------------------------------------
/*A program that generates a report of proof of vaccination against
 * COVID-19 for the people who received their dose of vaccination. 
 * It will be asking the user's full name, date of birth, the date of the
 * vaccination, the name of the vaccination they received, the location of the
 * center of the vaccination and the lot of vaccination. */
// ---------------------------------------------------------

package assign40209686;

import java.util.Scanner;

public class ProofVacc_Assign1 {
//Importing the scanner to ask the user's input.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the COVID-19 Report generator:");
		System.out.println("-----------------------------------------");
		System.out.println("Please enter the client info:");
		System.out.println();
		// A welcome message is displayed to the user.
		// It is asking for the user's information.

		System.out.print("First Name ? ");
		String fName = scan.next();
		System.out.print("Last Name ? ");
		String lName = scan.next();
		System.out.println();
		// It is asking for the user's first name and last name.

		System.out.print("Day Of Birth (between 1 and 31) ? ");
		int dOB = scan.nextInt();
		System.out.print("Month Of Birth (between 1 and 12) ? ");
		int mOB = scan.nextInt();
		System.out.print("Year Of Birth (between 1920 and 2006) ? ");
		int yOB = scan.nextInt();
		System.out.println();
		// It is asking for the user's day, month and year of birth.

		System.out.print("Day Of vaccination (between 1 and 31) ? ");
		int dOV = scan.nextInt();
		System.out.print("Month Of vaccination (between 1 and 12) ? ");
		int mOV = scan.nextInt();
		System.out.print("Year Of vaccination (between 2019 and 2021) ? ");
		int yOV = scan.nextInt();
		System.out.println();
		// It is asking for the user's day, month and year of birth.

		System.out.print("Name of vaccination (Pfizer, Moderna, AstraZeneca, etc.) ? ");
		String nVacc = scan.next();
		System.out.print("Location of the center of the vaccination ? ");
		String locaVacc = scan.next();
		System.out.print("Lot of vaccination ? ");
		String lotVacc = scan.next();
		/*
		 * It is asking the user for the name of the vaccination they received, the
		 * location of the center of the vaccination and the lot of vaccination.
		 */

		System.out.println(
				"_______________________________________________________________________________________________________");
		System.out.println(
				"Health and Social Services                                        Proof of Vaccination against COVID-19");
		System.out.println();
		System.out.println("User Information");
		System.out.println();
		// Displays the start of the report that the user will receive.

		System.out.println("Name       " + lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase() + ", "
				+ fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase());
		System.out.println("DOB        " + dOB + "/" + mOB + "/" + yOB);
		// Displays the user's full name and date of birth.

		System.out.println(
				"_______________________________________________________________________________________________________");
		System.out.println();

		System.out.println("Vaccince Administered");
		System.out.println();
		System.out.println("Name       " + "PB COVID-19");
		System.out.println("Code       " + nVacc.substring(0, 1).toUpperCase() + nVacc.substring(1).toLowerCase());
		System.out.println("Lot        " + lotVacc.toUpperCase());
		System.out.println("Date       " + dOV + "/" + mOV + "/" + yOV);
		System.out
				.println("Location   " + locaVacc.substring(0, 1).toUpperCase() + locaVacc.substring(1).toLowerCase());
		// Displays the user's vaccination information such as the name, code, lot, date
		// and location.

		System.out.println(
				"_______________________________________________________________________________________________________");
		System.out.println();
		System.out.println("Thank you for choosing our services.");
		System.out.println();
		System.out.println("Report generated successfully.");
		// Displays the closing message.
		scan.close();
	}

}
