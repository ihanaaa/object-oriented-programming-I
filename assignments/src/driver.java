
// -------------------------------------------------------
// Assignment (4) 
// Written by: (Ihana Fahmy 40209686)
// Written by: (Monika Moanes 40188452)
// For COMP 248 Section (EC) – Fall 2021
// --------------------------------------------------------
// ********************************************************
// driver.java
// Demonstrates a ticketbooth containing tickets and their OPUS cards
// Input: Ticket and OPUS card methods for the way the user wants to handle their tickets
// Output: Based on the case the user decides to pick, either display of information or change of information
// ********************************************************
import java.util.Scanner;//import class for user input. 

public class driver {

	public static void main(String[] args) {

		// initialization (same values as sample)
		Tickets ticketB0 = new Tickets(5, 1, 0, 1, 1);
		Tickets ticketB1 = new Tickets(5, 1, 0, 1, 1);
		Tickets ticketB2 = new Tickets(5, 5, 5, 5, 5);
		Tickets ticketB3 = new Tickets(0, 1, 1, 1, 1);
		Tickets ticketB4 = new Tickets(0, 1, 1, 1, 1);

		OPUSCard[] opusArray0 = new OPUSCard[2];
		opusArray0[0] = new OPUSCard("STL", "M. Cola", 8, 2024);
		opusArray0[1] = new OPUSCard("RTL", "C. Venus", 3, 2025);
		OPUSCard[] opusArray1 = new OPUSCard[2];
		opusArray1[0] = new OPUSCard("STL", "M. Cola", 8, 2024);
		opusArray1[1] = new OPUSCard("STM", "Z. Poker", 10, 2022);
		OPUSCard[] opusArray2 = new OPUSCard[3];
		opusArray2[0] = new OPUSCard("RTL", "C. Max", 12, 2021);
		opusArray2[1] = new OPUSCard("REM", "T. Flona", 4, 2023);
		opusArray2[2] = new OPUSCard("TRAMREM", "S. EaFL", 11, 2021);
		OPUSCard[] opusArray3 = new OPUSCard[0];
		OPUSCard[] opusArray4 = new OPUSCard[0];

		Ticketbooth tBooth0 = new Ticketbooth(ticketB0, opusArray0);
		Ticketbooth tBooth1 = new Ticketbooth(ticketB1, opusArray1);
		Ticketbooth tBooth2 = new Ticketbooth(ticketB2, opusArray2);
		Ticketbooth tBooth3 = new Ticketbooth(ticketB3, opusArray3);
		Ticketbooth tBooth4 = new Ticketbooth(ticketB4, opusArray4);

		Ticketbooth[] tBoothArr = new Ticketbooth[5];
		tBoothArr[0] = tBooth0;
		tBoothArr[1] = tBooth1;
		tBoothArr[2] = tBooth2;
		tBoothArr[3] = tBooth3;
		tBoothArr[4] = tBooth4;

		// scanner declared
		Scanner scan = new Scanner(System.in);
		int userChoice;
		int k;

		// welcome message
		System.out.println("=====================================================================");
		System.out.println();
		System.out.println("  Welcome to Concordia 2021 Fall Geek's Ticketbooth Application");
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println();

		// do-while loop and switch case for the choices
		do {
			System.out.println("What would you like to do?");
			System.out.println("   1. See the content of all Ticketbooths");
			System.out.println("   2. See the content of one Ticketbooth");
			System.out.println("   3. List Ticketbooths with same amount of tickets' values");
			System.out.println("   4. List Ticketbooths with same Tickets amount");
			System.out.println("   5. List Ticketbooths with same amount of tickets values and same number of OPUS cards");
			System.out.println("   6. Add a OPUS card to an existing Ticketbooth");
			System.out.println("   7. Remove an existing OPUS card from a Ticketbooth");
			System.out.println("   8. Update the expiray date of an existing OPUS card");
			System.out.println("   9. Add Tickets to a Ticketbooth");
			System.out.println("   0. To quit");
			System.out.print("\nPlease enter your choice and press <Enter>:");

			userChoice = scan.nextInt();

			switch (userChoice) {

			// case1: displays content of all Ticketbooths
			case 1: {
				System.out.println("Content of each Ticketbooth:");
				System.out.println("---------------------");
				System.out.println("Ticketbooth #0:");
				System.out.println(tBooth0.All_toString());
				System.out.println("Ticketbooth #1:");
				System.out.println(tBooth1.All_toString());
				System.out.println("Ticketbooth #2:");
				System.out.println(tBooth2.All_toString());
				System.out.println("Ticketbooth #3:");
				System.out.println(tBooth3.All_toString());
				System.out.println("Ticketbooth #4:");
				System.out.println(tBooth4.All_toString());
			}
				break;
			// case2: displays content of one Ticketbooth
			case 2: {
				System.out.print("Which Ticketbooth do you want to see the content of? (Enter number 0 to 4): ");

				String redo;
				do {
					int content = scan.nextInt();
					redo = "";
					switch (content) {
					case 0: {
						System.out.println(tBooth0.All_toString());

					}
						break;
					case 1: {
						System.out.println(tBooth1.All_toString());

					}
						break;
					case 2: {
						System.out.println(tBooth2.All_toString());

					}
						break;
					case 3: {
						System.out.println(tBooth3.All_toString());

					}
						break;
					case 4: {
						System.out.println(tBooth4.All_toString());

					}
						break;

					default: {

						// when the users enter wrong number
						System.out.print("--> Try again: (Enter number 0 to 4): ");
						redo = "redo!";
					}
						break;
					}
				} while (redo.equalsIgnoreCase("redo!"));
			}
				break;
			// case3: displays a list of Ticketbooths with the same amount of money
			case 3: {
				System.out.println("List of Ticketbooths with same amount of money:");
				System.out.println();

				if (tBooth0.bothTicket(tBooth1))
					System.out.println("      Ticketbooths 0 and 1 both have " + tBooth0.total());
				if (tBooth0.bothTicket(tBooth2))
					System.out.println("      Ticketbooths 0 and 2 both have " + tBooth0.total());
				if (tBooth0.bothTicket(tBooth3))
					System.out.println("      Ticketbooths 0 and 3 both have " + tBooth0.total());
				if (tBooth0.bothTicket(tBooth4))
					System.out.println("      Ticketbooths 0 and 4 both have " + tBooth0.total());
				if (tBooth1.bothTicket(tBooth2))
					System.out.println("      Ticketbooths 1 and 2 both have " + tBooth1.total());
				if (tBooth1.bothTicket(tBooth3))
					System.out.println("      Ticketbooths 1 and 3 both have " + tBooth1.total());
				if (tBooth1.bothTicket(tBooth4))
					System.out.println("      Ticketbooths 1 and 4 both have " + tBooth1.total());
				if (tBooth2.bothTicket(tBooth3))
					System.out.println("      Ticketbooths 2 and 3 both have " + tBooth2.total());
				if (tBooth2.bothTicket(tBooth4))
					System.out.println("      Ticketbooths 2 and 4 both have " + tBooth2.total());
				if (tBooth3.bothTicket(tBooth4))
					System.out.println("      Ticketbooths 3 and 4 both have " + tBooth3.total());

				System.out.println();

			}
				break;
			// case4: displays the list of Ticketbooths with same amount of tickets
			case 4: {
				System.out.println("List of Ticketbooths with same Tickets amount:");
				System.out.println();

				if (tBooth0.bothType(tBooth1))
					System.out.println("      Ticketbooths 0 and 1 both have " + tBooth0.justTickets_toString());
				if (tBooth0.bothType(tBooth2))
					System.out.println("      Ticketbooths 0 and 2 both have " + tBooth0.justTickets_toString());
				if (tBooth0.bothType(tBooth3))
					System.out.println("      Ticketbooths 0 and 3 both have " + tBooth0.justTickets_toString());
				if (tBooth0.bothType(tBooth4))
					System.out.println("      Ticketbooths 0 and 4 both have " + tBooth0.justTickets_toString());
				if (tBooth1.bothType(tBooth2))
					System.out.println("      Ticketbooths 1 and 2 both have " + tBooth1.justTickets_toString());
				if (tBooth1.bothType(tBooth3))
					System.out.println("      Ticketbooths 1 and 3 both have " + tBooth1.justTickets_toString());
				if (tBooth1.bothType(tBooth4))
					System.out.println("      Ticketbooths 1 and 4 both have " + tBooth1.justTickets_toString());
				if (tBooth2.bothType(tBooth3))
					System.out.println("      Ticketbooths 2 and 3 both have " + tBooth2.justTickets_toString());
				if (tBooth2.bothType(tBooth4))
					System.out.println("      Ticketbooths 2 and 4 both have " + tBooth2.justTickets_toString());
				if (tBooth3.bothType(tBooth4))
					System.out.println("      Ticketbooths 3 and 4 both have " + tBooth3.justTickets_toString());

				System.out.println();
			}
				break;
			// case5: displays the list of Ticketbooths with same amount of tickets value
			// and same number of OPUS cards
			case 5: {
				System.out.println("List of Ticketbooths with same amount of tickets values and same number of OPUS cards:");
				System.out.println();

				if (tBooth0.equals(tBooth1))
					System.out.println("      Ticketbooths 0 and 1");
				if (tBooth0.equals(tBooth2))
					System.out.println("      Ticketbooths 0 and 2");
				if (tBooth0.equals(tBooth3))
					System.out.println("      Ticketbooths 0 and 3");
				if (tBooth0.equals(tBooth4))
					System.out.println("      Ticketbooths 3 and 4");
				if (tBooth1.equals(tBooth2))
					System.out.println("      Ticketbooths 1 and 2");
				if (tBooth1.equals(tBooth3))
					System.out.println("      Ticketbooths 1 and 3");
				if (tBooth1.equals(tBooth4))
					System.out.println("      Ticketbooths 1 and 4");
				if (tBooth2.equals(tBooth3))
					System.out.println("      Ticketbooths 2 and 3");
				if (tBooth2.equals(tBooth4))
					System.out.println("      Ticketbooths 2 and 4");
				if (tBooth3.equals(tBooth4))
					System.out.println("      Ticketbooths 3 and 4");

				System.out.println();
			}
				break;
			// case6: adds an OPUS card
			case 6: {
				int add;
				do {
					System.out.print("Which Ticketbooth do you want to add a OPUS card to? (Enter number 0 to 4): ");
					add = scan.nextInt();
				} while (add < 0 || add > 4); // loops if user input invalid number

				System.out.println("Please enter the following information so that we may compete the transaction-");
				// user input for the Type of Opus cards, full name, expiry month and year
				System.out.print(" --> Type of OPUS card (STL, RTL, etc ..): ");
				String opusType = scan.next();
				System.out.print(" --> Full name on OPUS card: ");
				String junk = scan.nextLine();
				String opusName = scan.nextLine();
				System.out.print(" --> Expiry month number and year (seperate by a space): ");
				int month = scan.nextInt();
				int year = scan.nextInt();

				OPUSCard moreOpus = new OPUSCard(opusType, opusName, month, year);
				if (add == 0) {

					k = opusArray0.length + 1;
					tBooth0.addOpus(moreOpus);
					System.out.println("You now have " + k + " OPUS cards");
				}
				if (add == 1) {
					k = opusArray1.length + 1;
					tBooth1.addOpus(moreOpus);

					System.out.println("You now have " + k + " OPUS cards");

				}
				if (add == 2) {
					k = opusArray2.length + 1;
					tBooth2.addOpus(moreOpus);
					System.out.println("You now have " + k + " OPUS cards");

				}

				if (add == 3) {
					k = opusArray3.length + 1;
					tBooth3.addOpus(moreOpus);
					System.out.println("You now have " + k + " OPUS cards");

				}
				if (add == 4) {

					k = opusArray4.length + 1;
					tBooth4.addOpus(moreOpus);
					System.out.println("You now have " + k + " OPUS cards");

				}

				System.out.println();
			}
				break;
			// case7: remove an OPUS card
			case 7: {
				int remove;
				int removeAgain;
				do {
					System.out.print("Which Ticketbooth do you want to remove a OPUS card from? (Enter number 0 to 4): ");
					remove = scan.nextInt();
				} while (remove < 0 || remove > 4); // loop if user input invalid number

				if (remove == 0) {
					if (opusArray0.length <= 0)
						System.out.println("Sorry that Ticketbooth has no cards");
					else {

						{
							do {
								System.out.println("(Enter card number 0 to " + (opusArray0.length - 1) + "):");
								removeAgain = scan.nextInt();
							} while (removeAgain > (opusArray0.length - 1) || removeAgain < 0);
							tBooth0.removeOpus(removeAgain);
							System.out.println("Card was removed successfully");

						}
					}
				}
				if (remove == 1) {
					if (opusArray1.length <= 0)
						System.out.println("Sorry that Ticketbooth has no cards");
					else {
						do {
							System.out.println("(Enter card number 0 to " + (opusArray1.length - 1) + "):");
							removeAgain = scan.nextInt();
						} while (removeAgain > (opusArray1.length - 1) || removeAgain < 0);
						tBooth1.removeOpus(removeAgain);
						System.out.println("Card was removed successfully");

					}
				}
				if (remove == 2) {
					if (opusArray2.length <= 0)
						System.out.println("Sorry that Ticketbooth has no cards");
					else {
						do {
							System.out.println("(Enter card number 0 to " + (opusArray2.length - 1) + "):");
							removeAgain = scan.nextInt();
						} while (removeAgain > (opusArray2.length - 1) || removeAgain < 0);
						tBooth2.removeOpus(removeAgain);
						System.out.println("Card was removed successfully");

					}
				}
				if (remove == 3) {
					if (opusArray3.length <= 0)
						System.out.println("Sorry that Ticketbooth has no cards");
					else {
						do {
							System.out.println("(Enter card number 0 to " + (opusArray3.length - 1) + "):");
							removeAgain = scan.nextInt();
						} while (removeAgain > (opusArray3.length - 1) || removeAgain < 0);
						tBooth3.removeOpus(removeAgain);
						System.out.println("Card was removed successfully");

					}
				}
				if (remove == 4) {
					if (opusArray4.length <= 0)
						System.out.println("Sorry that Ticketbooth has no cards");
					else {
						do {
							System.out.println("(Enter card number 0 to " + (opusArray4.length - 1) + "):");
							removeAgain = scan.nextInt();
						} while (removeAgain > (opusArray4.length - 1) || removeAgain < 0);
						tBooth4.removeOpus(removeAgain);
						System.out.println("Card was removed successfully");

					}
				}
				System.out.println();
			}
				break;
			// case8: update OPUS card month and year
			case 8: {
				int update;
				int updateAgain;
				do {
					System.out.print("Which Ticketbooth do you want to update a OPUS card from? (Enter number 0 to 4): ");
					update = scan.nextInt();
				} while (update < 0 || update > 4); // loop if user input invalid number

				if (update == 0) {
					if (opusArray0.length == 0) {
						System.out.println("Sorry that ticketbooth has no cards");
						System.out.println();
					} else {

						System.out.println("Which card do you want to update? (Enter card number 0 to "
								+ (opusArray0.length - 1) + "): ");
						updateAgain = scan.nextInt();
						while (updateAgain < 0 || updateAgain > opusArray0.length - 1) {
							System.out.println("Sorry but there is no card number " + updateAgain);
							System.out.println("--> Try Again: " + '\n' + "(Enter card number 0 to "
									+ +(opusArray0.length - 1) + "): ");
							updateAgain = scan.nextInt();
						}
						System.out.print("--> Enter new expiry month number and year (seperate by a space): ");
						int uMonth = scan.nextInt();
						int uYear = scan.nextInt();

						opusArray0[updateAgain].setExpiryMonth(uMonth);
						opusArray0[updateAgain].setExpiryYear(uYear);

						System.out.println("Expire date updated.");
						System.out.println();
					}
				}

				if (update == 1) {
					if (opusArray1.length == 0) {
						System.out.println("Sorry that ticketbooth has no cards");
						System.out.println();
					} else {
						System.out.println("Which card do you want to update? (Enter card number 0 to "
								+ (opusArray1.length - 1) + "): ");
						updateAgain = scan.nextInt();
						while (updateAgain < 0 || updateAgain > opusArray1.length - 1) {
							System.out.println("Sorry but there is no card number " + updateAgain);
							System.out.println("--> Try Again: " + '\n' + "(Enter card number 0 to "
									+ +(opusArray1.length - 1) + "): ");
							updateAgain = scan.nextInt();
						}
						System.out.print("--> Enter new expiry month number and year (seperate by a space): ");
						int uMonth = scan.nextInt();
						int uYear = scan.nextInt();

						opusArray1[updateAgain].setExpiryMonth(uMonth);
						opusArray1[updateAgain].setExpiryYear(uYear);

						System.out.println("Expire date updated.");
						System.out.println();
					}
				}
				if (update == 2) {
					if (opusArray2.length == 0) {
						System.out.println("Sorry that ticketbooth has no cards");
						System.out.println();
					} else {
						System.out.println("Which card do you want to update? (Enter card number 0 to "
								+ (opusArray2.length - 1) + "): ");
						updateAgain = scan.nextInt();
						while (updateAgain < 0 || updateAgain > opusArray2.length - 1) {
							System.out.println("Sorry but there is no card number " + updateAgain);
							System.out.println("--> Try Again: " + '\n' + "(Enter card number 0 to "
									+ +(opusArray2.length - 1) + "): ");
							updateAgain = scan.nextInt();
						}
						System.out.print("--> Enter new expiry month number and year (seperate by a space): ");
						int uMonth = scan.nextInt();
						int uYear = scan.nextInt();

						opusArray2[updateAgain].setExpiryMonth(uMonth);
						opusArray2[updateAgain].setExpiryYear(uYear);

						System.out.println("Expire date updated.");
						System.out.println();
					}
				}
				if (update == 3) {
					if (opusArray3.length == 0) {
						System.out.println("Sorry that ticketbooth has no cards");
						System.out.println();
					} else {
						System.out.println("Which card do you want to update? (Enter card number 0 to "
								+ (opusArray3.length - 1) + "): ");
						updateAgain = scan.nextInt();
						while (updateAgain < 0 || updateAgain > opusArray3.length - 1) {
							System.out.println("Sorry but there is no card number " + updateAgain);
							System.out.println("--> Try Again: " + '\n' + "(Enter card number 0 to "
									+ +(opusArray3.length - 1) + "): ");
							updateAgain = scan.nextInt();
						}
						System.out.print("--> Enter new expiry month number and year (seperate by a space): ");
						int uMonth = scan.nextInt();
						int uYear = scan.nextInt();

						opusArray3[updateAgain].setExpiryMonth(uMonth);
						opusArray3[updateAgain].setExpiryYear(uYear);

						System.out.println("Expire date updated.");
						System.out.println();

					}
				}
				if (update == 4) {
					if (opusArray4.length == 0) {
						System.out.println("Sorry that ticketbooth has no cards");
						System.out.println();
					} else {
						System.out.println("Which card do you want to update? (Enter card number 0 to "
								+ (opusArray4.length - 1) + "): ");
						updateAgain = scan.nextInt();
						while (updateAgain < 0 || updateAgain > (opusArray4.length - 1)) {
							System.out.println("Sorry but there is no card number " + updateAgain);
							System.out.println("--> Try Again: " + '\n' + "(Enter card number 0 to "
									+ +(opusArray4.length - 1) + "): ");
							updateAgain = scan.nextInt();
						}
						System.out.print("--> Enter new expiry month number and year (seperate by a space): ");
						int uMonth = scan.nextInt();
						int uYear = scan.nextInt();

						opusArray4[updateAgain].setExpiryMonth(uMonth);
						opusArray4[updateAgain].setExpiryYear(uYear);

						System.out.println("Expire date updated.");
						System.out.println();
					}
				}

			}
				break;
			// case9: adds tickets and displays new total price
			case 9: {
				int pickTB;
				do {
					System.out.print("Which Ticketbooth do you want to add Tickets to? (Enter number 0 to 4): ");
					pickTB = scan.nextInt();
				} while (pickTB < 0 || pickTB > 4);
				System.out.println("How many regular, junior, senior, daily, weekly do you want to add?");
				System.out.print("Enter 5 numbers seperated by a space): ");

				int regular = scan.nextInt();
				int junior = scan.nextInt();
				int senior = scan.nextInt();
				int daily = scan.nextInt();
				int weekly = scan.nextInt();

				if (pickTB == 0) {
					tBooth0.addTicket(regular, junior, senior, daily, weekly);
					System.out.println("$" + tBooth0.total());
				}
				if (pickTB == 1) {
					tBooth1.addTicket(regular, junior, senior, daily, weekly);
					System.out.println("$" + tBooth1.total());
				}
				if (pickTB == 2) {
					tBooth2.addTicket(regular, junior, senior, daily, weekly);
					System.out.println("$" + tBooth2.total());
				}
				if (pickTB == 3) {
					tBooth3.addTicket(regular, junior, senior, daily, weekly);
					System.out.println("$" + tBooth3.total());
				}
				if (pickTB == 4) {
					tBooth4.addTicket(regular, junior, senior, daily, weekly);
					System.out.println("$" + tBooth4.total());
				}
				System.out.println();

			}
				break;
			case 0: {
				// case0: prints thank you and closing message
				System.out.println("Thank you for using Concordia Fall Geek's Ticketbooth application");
			}
				break;
			// user inputs invalid number
			default: {
				System.out.println("Sorry that is not a valid choice. Try again.");
				System.out.println();
			}
				break;
			}
		} while (userChoice != 0);

		scan.close(); // close Scanner Object

	}// end of main()

} // end of Class driver
