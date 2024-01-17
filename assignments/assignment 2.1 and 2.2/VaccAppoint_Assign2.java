// -------------------------------------------------------------------
// Assignment #2
// Written by: Ihana Fahmy 40209686
// For COMP 248 Section EC - Fall 2021
// -------------------------------------------------------------------

//********************************************************************
// VaccAppoint_Assign2.java
// Demonstrates a booking system for Covid-19 vaccine appointments
// Input: User's choice based on the vaccine menu for available slots, location and time, and the option of 1st and 2n shot
// Output: Confirmation message for the booked appointment or a reminder to make another appointment later 
//********************************************************************

package assign40209686;

import java.util.Scanner; // import class for user input

public class VaccAppoint_Assign2 {

	public static void main(String[] args) {
		// prints welcome message and Covid-19 vaccine menu
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("   Welcome to Covid19 Vaccine Appointment Program!   ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Here is the Covid-19 vaccine menu:");
		System.out.println("    1. Pfizer \n    2. Moderna \n    3. AstraZeneca \n    4. Johnson&Johnson "
				+ "\n    5. Sinovac \n    6. Gamaleya \n    7. Exit");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();

		// scanner declared
		Scanner scan = new Scanner(System.in);

		// string declared as yesOrNo and the start of the do-while loop
		String yesOrNo;
		do {

			// asking the user to enter their choice of vaccine from the menu
			System.out.print("Please enter your choice (1-7): ");
			int choice = scan.nextInt();

			// switch declared
			switch (choice) {

			case 1: { // If user input is 1 then Pfizer location menu is printed
				System.out.println("Your choice is: Pfizer.");
				System.out.println();
				System.out.println("Please choose the location of vaccine Pfizer: ");
				System.out.println("\t 1 - Pharmaprix \n \t 2 - Jean Coutu");
				System.out.print("Please enter your choice: ");
				int pfizer = scan.nextInt();
				System.out.println();
				yesOrNo = "no";

				// if user input is 1 then Pfizer location is Pharmaprix and the time slot is
				// printed
				if (pfizer == 1)

				{

					System.out.println("Please choose the time slots :");
					System.out.println("\t 1 - 2:00 - 2:15");
					System.out.println("\t 2 - 2:20 - 2:35");
					System.out.println("\t 3 - 2:40 - 2:55");
					System.out.println("\t 4 - 3:00 - 3:15");
					System.out.println("\t 5 - Quit");

					// asking user to pick a time slot
					System.out.print("Please enter your choice (1-5): ");
					int oneFivePfizer = scan.nextInt();

					// if user input is 1 then time slot 1 is chosen
					if (oneFivePfizer == 1)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotPfizer = scan.nextInt();

						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotPfizer == 1) {
							System.out.println("Your booked appointment is: Pfizer, 1st dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Pharmaprix.");
							System.out.println();
						}
						// if user input is 2 then appointment is for 2nd vaccine
						if (shotPfizer == 2) {
							System.out.println("Your booked appointment is: Pfizer, 2nd dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 2 then time slot 2 is chosen
					if (oneFivePfizer == 2)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotPfizer = scan.nextInt();

						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotPfizer == 1) {
							System.out.println("Your booked appointment is: Pfizer, 1st dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotPfizer == 2) {
							System.out.println("Your booked appointment is: Pfizer, 2nd dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 3 then time slot 3 is chosen
					if (oneFivePfizer == 3)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotPfizer = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotPfizer == 1) {
							System.out.println("Your booked appointment is: Pfizer, 1st dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotPfizer == 2) {
							System.out.println("Your booked appointment is: Pfizer, 2nd dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 4 then time slot 4 is chosen
					if (oneFivePfizer == 4)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotPfizer = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotPfizer == 1) {
							System.out.println("Your booked appointment is: Pfizer, 1st dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotPfizer == 2) {
							System.out.println("Your booked appointment is: Pfizer, 2nd dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Pharmaprix.");
							System.out.println();
						}

					}

					// if user input is 5 then quit has been chosen with a message asking the user
					// to try again
					if (oneFivePfizer == 5)

					{
						// asking user input whether to try again or not
						System.out.println();
						System.out.println(
								"Your appointment is not booked successfully! Would you like to try again? (yes or no)");

						yesOrNo = scan.next();
						System.out.println();
					}

				}
				// if user input is 2 then Pfizer location is Jean Coutu and the time slot is
				// printed
				if (pfizer == 2)

				{

					System.out.println("Please choose the time slots :");
					System.out.println("\t 1 - 2:00 - 2:15");
					System.out.println("\t 2 - 2:20 - 2:35");
					System.out.println("\t 3 - 2:40 - 2:55");
					System.out.println("\t 4 - 3:00 - 3:15");
					System.out.println("\t 5 - Quit");

					// asking user to pick a time slot
					System.out.print("Please enter your choice (1-5): ");
					int oneFivePfizer = scan.nextInt();

					// if user input is 1 then time slot 1 is chosen
					if (oneFivePfizer == 1)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotPfizer = scan.nextInt();

						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotPfizer == 1) {
							System.out.println("Your booked appointment is: Pfizer, 1st dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Jean Coutu.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotPfizer == 2) {
							System.out.println("Your booked appointment is: Pfizer, 2nd dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Jean Coutu.");
							System.out.println();
						}

					}
					// if user input is 2 then time slot 2 is chosen
					if (oneFivePfizer == 2)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotPfizer = scan.nextInt();

						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotPfizer == 1) {
							System.out.println("Your booked appointment is: Pfizer, 1st dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Jean Coutu.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotPfizer == 2) {
							System.out.println("Your booked appointment is: Pfizer, 2nd dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Jean Coutu.");
							System.out.println();
						}

					}
					// if user input is 3 then time slot 3 is chosen
					if (oneFivePfizer == 3)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotPfizer = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotPfizer == 1) {
							System.out.println("Your booked appointment is: Pfizer, 1st dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Jean Coutu.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotPfizer == 2) {
							System.out.println("Your booked appointment is: Pfizer, 2nd dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Jean Coutu.");
							System.out.println();
						}

					}
					// if user input is 4 then time slot 4 is chosen
					if (oneFivePfizer == 4)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotPfizer = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotPfizer == 1) {
							System.out.println("Your booked appointment is: Pfizer, 1st dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Jean Coutu.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotPfizer == 2) {
							System.out.println("Your booked appointment is: Pfizer, 2nd dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Jean Coutu.");
							System.out.println();
						}

					}
					// if user input is 5 then quit has been chosen with a message asking the user
					// to try again
					if (oneFivePfizer == 5)

					{
						// asking user input whether to try again or not
						System.out.println();
						System.out.println(
								"Your appointment is not booked successfully! Would you like to try again? (yes or no)");

						yesOrNo = scan.next();
						System.out.println();
					}

				}

			}
				break;

			case 2: { // If user input is 2 then Moderna location menu is printed
				System.out.println("Your choice is: Moderna.");
				System.out.println();
				System.out.println("Please choose the location of vaccine Moderna:");
				System.out.println("\t 1 - Pharmaprix");
				System.out.println("\t 3 - Uniprix Clinique");
				System.out.println("\t 4 - Health Center");
				System.out.print("Please enter your choice: ");
				int moderna = scan.nextInt();
				System.out.println();
				yesOrNo = "no";

				// if user input is 1 then Moderna location is Pharmaprix and the time slot is
				// printed
				if (moderna == 1)

				{
					System.out.println("Please choose the time slots :");
					System.out.println("\t 1 - 2:00 - 2:15");
					System.out.println("\t 2 - 2:20 - 2:35");
					System.out.println("\t 3 - 2:40 - 2:55");
					System.out.println("\t 4 - 3:00 - 3:15");
					System.out.println("\t 5 - Quit");

					// asking user to pick a time slot
					System.out.print("Please enter your choice (1-5): ");
					int oneFiveModerna = scan.nextInt();

					// if user input is 1 then time slot 1 is chosen
					if (oneFiveModerna == 1)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 2 then time slot 2 is chosen
					if (oneFiveModerna == 2)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 3 then time slot 3 is chosen
					if (oneFiveModerna == 3)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 4 then time slot 4 is chosen
					if (oneFiveModerna == 4)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 5 then quit has been chosen with a message asking the user
					// to try again
					if (oneFiveModerna == 5)

					{
						// asking user input whether to try again or not
						System.out.println();
						System.out.println(
								"Your appointment is not booked successfully! Would you like to try again? (yes or no)");

						yesOrNo = scan.next();
						System.out.println();
					}

				}
				// if user input is 3 then Moderna location is Uniprix Clinique and the time
				// slot is printed
				if (moderna == 3)

				{
					System.out.println("Please choose the time slots :");
					System.out.println("\t 1 - 2:00 - 2:15");
					System.out.println("\t 2 - 2:20 - 2:35");
					System.out.println("\t 3 - 2:40 - 2:55");
					System.out.println("\t 4 - 3:00 - 3:15");
					System.out.println("\t 5 - Quit");

					// asking user to pick a time slot
					System.out.print("Please enter your choice (1-5): ");
					int oneFiveModerna = scan.nextInt();

					// if user input is 1 then time slot 1 is chosen
					if (oneFiveModerna == 1)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Uniprix Clinique.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Uniprix Clinique.");
							System.out.println();
						}

					}
					// if user input is 2 then time slot 2 is chosen
					if (oneFiveModerna == 2)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Uniprix Clinique.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Uniprix Clinique.");
							System.out.println();
						}

					}
					// if user input is 3 then time slot 3 is chosen
					if (oneFiveModerna == 3)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Uniprix Clinique.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Uniprix Clinique.");
							System.out.println();
						}

					}
					// if user input is 4 then time slot 4 is chosen
					if (oneFiveModerna == 4)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Uniprix Clinique.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Uniprix Clinique.");
							System.out.println();
						}

					}
					// if user input is 5 then quit has been chosen with a message asking the user
					// to try again
					if (oneFiveModerna == 5)

					{
						// asking user input whether to try again or not
						System.out.println();
						System.out.println(
								"Your appointment is not booked successfully! Would you like to try again? (yes or no)");

						yesOrNo = scan.next();
						System.out.println();
					}

				}
				// if user input is 4 then Moderna location is Health Center and the time slot
				// is printed
				if (moderna == 4) {
					System.out.println("Please choose the time slots :");
					System.out.println("\t 1 - 2:00 - 2:15");
					System.out.println("\t 2 - 2:20 - 2:35");
					System.out.println("\t 3 - 2:40 - 2:55");
					System.out.println("\t 4 - 3:00 - 3:15");
					System.out.println("\t 5 - Quit");

					// asking user to pick a time slot
					System.out.print("Please enter your choice (1-5): ");
					int oneFiveModerna = scan.nextInt();

					// if user input is 1 then time slot 1 is chosen
					if (oneFiveModerna == 1)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Health Center.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Health Center.");
							System.out.println();
						}

					}
					// if user input is 2 then time slot 2 is chosen
					if (oneFiveModerna == 2)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Health Center.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Health Center.");
							System.out.println();
						}

					}
					// if user input is 3 then time slot 3 is chosen
					if (oneFiveModerna == 3)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Health Center.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Health Center.");
							System.out.println();
						}

					}
					// if user input is 4 then time slot 4 is chosen
					if (oneFiveModerna == 4)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotModerna = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotModerna == 1) {
							System.out.println("Your booked appointment is: Moderna, 1st dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Health Center.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotModerna == 2) {
							System.out.println("Your booked appointment is: Moderna, 2nd dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Health Center.");
							System.out.println();
						}

					}
					// if user input is 5 then quit has been chosen with a message asking the user
					// to try again
					if (oneFiveModerna == 5)

					{
						// asking user input whether to try again or not
						System.out.println();
						System.out.println(
								"Your appointment is not booked successfully! Would you like to try again? (yes or no)");

						yesOrNo = scan.next();
						System.out.println();
					}

				}
			}
				break;

			case 3: { // If user input is 3 then AstraZeneca location menu is printed
				System.out.println("Your choice is: AstraZeneca.");
				System.out.println();
				System.out.println("Please choose the location of vaccine AstraZeneca:");
				System.out.println("\t 2 - Jean Coutu");
				System.out.println("\t 3 - Uniprix Clinique");
				System.out.print("Please enter your choice: ");
				int astra = scan.nextInt();
				System.out.println();
				yesOrNo = "no";

				// if user input is 2 then AstraZeneca location is Jean Coutu and the time slot
				// is printed
				if (astra == 2)

				{
					System.out.println("Please choose the time slots :");
					System.out.println("\t 1 - 2:00 - 2:15");
					System.out.println("\t 2 - 2:20 - 2:35");
					System.out.println("\t 3 - 2:40 - 2:55");
					System.out.println("\t 4 - 3:00 - 3:15");
					System.out.println("\t 5 - Quit");

					// asking user to pick a time slot
					System.out.print("Please enter your choice (1-5): ");
					int oneFiveAstra = scan.nextInt();

					// if user input is 1 then time slot 1 is chosen
					if (oneFiveAstra == 1)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotAstra = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotAstra == 1) {
							System.out.println("Your booked appointment is: AstraZeneca, 1st dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotAstra == 2) {
							System.out.println("Your booked appointment is: AstraZeneca, 2nd dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 2 then time slot 2 is chosen
					if (oneFiveAstra == 2)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotAstra = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotAstra == 1) {
							System.out.println("Your booked appointment is: AstraZeneca, 1st dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotAstra == 2) {
							System.out.println("Your booked appointment is: AstraZeneca, 2nd dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 3 then time slot 3 is chosen
					if (oneFiveAstra == 3)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotAstra = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotAstra == 1) {
							System.out.println("Your booked appointment is: AstraZeneca, 1st dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotAstra == 2) {
							System.out.println("Your booked appointment is: AstraZeneca, 2nd dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 4 then time slot 4 is chosen
					if (oneFiveAstra == 4)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotAstra = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotAstra == 1) {
							System.out.println("Your booked appointment is: AstraZeneca, 1st dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Pharmaprix.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotAstra == 2) {
							System.out.println("Your booked appointment is: AstraZeneca, 2nd dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Pharmaprix.");
							System.out.println();
						}

					}
					// if user input is 5 then quit has been chosen with a message asking the user
					// to try again
					if (oneFiveAstra == 5)

					{
						// asking user input whether to try again or not
						System.out.println();
						System.out.println(
								"Your appointment is not booked successfully! Would you like to try again? (yes or no)");

						yesOrNo = scan.next();
						System.out.println();
					}

				}
				// if user input is 3 then AstraZeneca location is Uniprix Clinique and the time
				// slot is printed
				if (astra == 3)

				{
					System.out.println("Please choose the time slots :");
					System.out.println("\t 1 - 2:00 - 2:15");
					System.out.println("\t 2 - 2:20 - 2:35");
					System.out.println("\t 3 - 2:40 - 2:55");
					System.out.println("\t 4 - 3:00 - 3:15");
					System.out.println("\t 5 - Quit");

					// asking user to pick a time slot
					System.out.print("Please enter your choice (1-5): ");
					int oneFiveAstra = scan.nextInt();

					// if user input is 1 then time slot 1 is chosen
					if (oneFiveAstra == 1)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotAstra = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotAstra == 1) {
							System.out.println("Your booked appointment is: AstraZeneca, 1st dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Uniprix Clinique.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotAstra == 2) {
							System.out.println("Your booked appointment is: AstraZeneca, 2nd dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Uniprix Clinique.");
							System.out.println();
						}

					}
					// if user input is 2 then time slot 2 is chosen
					if (oneFiveAstra == 2)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotAstra = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotAstra == 1) {
							System.out.println("Your booked appointment is: AstraZeneca, 1st dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Uniprix Clinique.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotAstra == 2) {
							System.out.println("Your booked appointment is: AstraZeneca, 2nd dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Uniprix Clinique.");
							System.out.println();
						}

					}
					// if user input is 3 then time slot 3 is chosen
					if (oneFiveAstra == 3)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotAstra = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotAstra == 1) {
							System.out.println("Your booked appointment is: AstraZeneca, 1st dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Uniprix Clinique.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotAstra == 2) {
							System.out.println("Your booked appointment is: AstraZeneca, 2nd dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Uniprix Clinique.");
							System.out.println();
						}

					}
					// if user input is 4 then time slot 4 is chosen
					if (oneFiveAstra == 4)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotAstra = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotAstra == 1) {
							System.out.println("Your booked appointment is: AstraZeneca, 1st dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Uniprix Clinique.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotAstra == 2) {
							System.out.println("Your booked appointment is: AstraZeneca, 2nd dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Uniprix Clinique.");
							System.out.println();
						}

					}
					// if user input is 5 then quit has been chosen with a message asking the user
					// to try again
					if (oneFiveAstra == 5)

					{
						// asking user input whether to try again or not
						System.out.println();
						System.out.println(
								"Your appointment is not booked successfully! Would you like to try again? (yes or no)");

						yesOrNo = scan.next();
						System.out.println();
					}

				}
			}
				break;

			case 4:

			{ // If user input is 4 then Johnson & Johnson location menu is printed
				System.out.println("Your choice is: Johnson & Johnson.");
				System.out.println();
				System.out.println("Please choose the location of vaccine Johnson & Johnson:");
				System.out.println("\t 4 - Health Center");
				System.out.print("Please enter your choice: ");
				int jJ = scan.nextInt();
				System.out.println();
				yesOrNo = "no";

				// if user input is 4 then location is Health Center and the time slot is
				// printed
				if (jJ == 4)

				{
					System.out.println("Please choose the time slots :");
					System.out.println("\t 1 - 2:00 - 2:15");
					System.out.println("\t 2 - 2:20 - 2:35");
					System.out.println("\t 3 - 2:40 - 2:55");
					System.out.println("\t 4 - 3:00 - 3:15");
					System.out.println("\t 5 - Quit");

					// asking user to pick a time slot
					System.out.print("Please enter your choice (1-5): ");
					int oneFiveJJ = scan.nextInt();

					// if user input is 1 then time slot 1 is chosen
					if (oneFiveJJ == 1)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotJJ = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotJJ == 1) {
							System.out.println("Your booked appointment is: Johnson & Johnson, 1st dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Health Center.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotJJ == 2) {
							System.out.println("Your booked appointment is: Johnson & Johnson, 2nd dose.");
							System.out.println("Your schedule is: 2:00 - 2:15 @ Health Center.");
							System.out.println();
						}

					}
					// if user input is 2 then time slot 2 is chosen
					if (oneFiveJJ == 2)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotJJ = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotJJ == 1) {
							System.out.println("Your booked appointment is: Johnson & Johnson, 1st dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Health Center.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotJJ == 2) {
							System.out.println("Your booked appointment is: Johnson & Johnson, 2nd dose.");
							System.out.println("Your schedule is: 2:20 - 2:35 @ Health Center.");
							System.out.println();
						}

					}

					// if user input is 3 then time slot 3 is chosen
					if (oneFiveJJ == 3)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotJJ = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotJJ == 1) {
							System.out.println("Your booked appointment is: Johnson & Johnson, 1st dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Health Center.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotJJ == 2) {
							System.out.println("Your booked appointment is: Johnson & Johnson, 2nd dose.");
							System.out.println("Your schedule is: 2:40 - 2:55 @ Health Center.");
							System.out.println();
						}

					}

					// if user input is 4 then time slot 4 is chosen
					if (oneFiveJJ == 4)

					{
						// asking user for either the 1st or 2nd vaccine shot
						System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
						int shotJJ = scan.nextInt();
						System.out.println();

						// if user input 1 then appointment is for 1st vaccine
						if (shotJJ == 1) {
							System.out.println("Your booked appointment is: Johnson & Johnson, 1st dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Health Center.");
							System.out.println();
						}
						// if user input 2 then appointment is for 2nd vaccine
						if (shotJJ == 2) {
							System.out.println("Your booked appointment is: Johnson & Johnson, 2nd dose.");
							System.out.println("Your schedule is: 3:00 - 3:15 @ Health Center.");
							System.out.println();
						}

					}

					// if user input is 5 then quit has been chosen with a message asking the user
					// to try again
					if (oneFiveJJ == 5)

					{
						// asking user input whether to try again or not
						System.out.println();
						System.out.println(
								"Your appointment is not booked successfully! Would you like to try again? (yes or no)");

						yesOrNo = scan.next();
						System.out.println();
					}
				}
			}
				break;

			case 5:

			{ // If user input is 5 then message is displayed for unavailability of Sinovac
				// and asking user whether to try again or not
				System.out.println(
						"Sorry, Sinovac is not available now!" + "\nYour appointment is not booked successfully!"
								+ " Would you like to try again? (yes or no) ");
				yesOrNo = scan.next();
				System.out.println();

				break;
			}

			case 6:

			{ // If user input is 6 then message is displayed for unavailability of Gamaleya
				// and asking user whether to try again or not
				System.out.println(
						"Sorry, Gamaleya is not available now!" + "\nYour appointment is not booked successfully! "
								+ "Would you like to try again? (yes or no) ");
				yesOrNo = scan.next();
				System.out.println();

				break;
			}

			case 7:

			{ // If user input is 7 then message is displayed for unsuccessful booking and
				// asking user whether to try again or not
				System.out.println();
				System.out.println(
						"Your appointment is not booked succesfully! " + "Would you like to try again? (yes or no)");
				yesOrNo = scan.next();
				System.out.println();

				break;
			}

			default:

			{ // if user input is an integer smaller or equal to 0 or bigger or equal to 8 an
				// error message is printed making the user start again
				System.out.println();
				System.out.println("This is a wrong input. Please try again!");

				yesOrNo = "yes";
			}
			}

		}
		// end of the do-wile loop in which the loop starts again from the top whenever
		// the user inputs yes to a "try again" question
		while (("yes").equalsIgnoreCase(yesOrNo));

		// Closing message
		System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");

		// Close Scanner Object
		scan.close();
	} // end of main()
} // end of class VaccAppoint_Assign2.java
