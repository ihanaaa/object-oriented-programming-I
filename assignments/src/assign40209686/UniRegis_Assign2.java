// -------------------------------------------------------------------
// Assignment #2
// Written by: Ihana Fahmy 40209686
// For COMP 248 Section EC - Fall 2021
// -------------------------------------------------------------------

//********************************************************************
// UniRegis_Assign2.java
// Demonstrates a registration program for new coming Concordia University students 
// Input: Personal info of the student such as their full name, date of birth, vaccine passport and department
// Output: Welcome back message for non-new students and congratulation message with a the students ID for new coming students
//********************************************************************

package assign40209686;

import java.util.Scanner; //import class for user input. 
import java.lang.Math; //import class to use Math.random(), a random number generator

public class UniRegis_Assign2 {
	// we define a method named randomWithRange of int
	int randomWithRange(int min, int max) {

		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}

	public static void main(String[] args) {
		// prints welcome message
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("   Welcome to Concordia University          ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		// scanner declared
		Scanner scan = new Scanner(System.in);

		// asking the user whether or not they are a student at Concordia
		System.out.print("Are you a new coming student at Concordia? (yes or no)");
		String userAns = scan.next();

		// if user inputs no then another welcome message and a closing message are
		// printed
		if (userAns.equalsIgnoreCase("no")) {

			System.out.println();
			System.out.println("Welcome back! Hope you are having a great semester!");
			System.out.println();
			System.out.println("Thank you for using this Program!");

		}
		// if user inputs yes then user input will be asked
		if (userAns.equalsIgnoreCase("yes")) {
			// First and last name info (with a comma included)
			System.out.println();
			System.out.print("Please enter your name (Lastname, Firstname seperated by comma): ");
			String fullName = scan.next();

			// Date of birth info
			System.out.println();
			System.out.print("Please enter your date of birth: ");
			String dob = scan.next();

			// User input on whether or not they have a Covid-19 passport
			System.out.println();
			System.out.print("Do you have covid19 vaccine passport? (true or false): ");
			String trOrFa = scan.next();

			// User's department info
			System.out.println();
			System.out.print("Please enter your department: ");
			String departm = scan.next();

			// Congratulation message with full name output
			System.out.println();
			System.out.println("Congratulations, " + fullName.substring(fullName.indexOf(',') + 1).concat(" ")
					+ fullName.substring(0, fullName.indexOf(',')) + "!"
					+ " You have successlly registered at Concordia University!");
			// Student ID output
			UniRegis_Assign2 obj1 = new UniRegis_Assign2();
			int rand = obj1.randomWithRange(0000000, 9999999);

			System.out.println();
			System.out.println("Your student ID is " + rand + ".");
			System.out.println();

			// if false for the Covid-19 passport then message is printed
			if (trOrFa.equalsIgnoreCase("false")) {

				System.out.println(" Hope you will get your vaccine passport soon! Take care!");
				System.out.println();
			}

			// Closing message
			System.out.println("Thank you for using this Program!");
		}

		// Close Scanner Object
		scan.close();
	} // end of main()
} // end of class UniRegis_Assign2
