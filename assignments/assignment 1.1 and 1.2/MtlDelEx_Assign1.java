
// ---------------------------------------------------------
// Assignment #1
// Written by: Ihana Fahmy 40209686
// For COMP 248 Section EC - Fall 2021
// ---------------------------------------------------------

// ---------------------------------------------------------
/*A program that a receipt for a delivery company, called "Montréal 
 * Delivery Express" that delivers goods to its clients. It will ask the 
 * client's full name, address (including street number, street name
 * and apt number), city, postal code, the date of 
 * delivery, the distance
 * from the source to the destination (in km) and the value of the goods.
 */
// ---------------------------------------------------------

package assign40209686;

import java.util.Scanner;

public class MtlDelEx_Assign1 {
//Importing the Scanner to ask the client's input.

	public static void main(String[] args) {

		System.out.println("Welcome to the Receipt Generator:");
		System.out.println("---------------------------------");
		System.out.println("Please enter the client info:");
		System.out.println();
		// Welcome message is displayed to the clients.
		// It is asking for the client's information.

		Scanner scan = new Scanner(System.in);

		System.out.print("First Name ? ");
		String fName = scan.next();
		System.out.print("Last Name ? ");
		String lName = scan.next();
		System.out.print("Address ? ");
		String junk = scan.nextLine();
		String address = scan.nextLine();
		System.out.print("City ? ");
		String city = scan.next();
		System.out.print("Postal Code ? ");
		String pCode = scan.next();
		System.out.println();
		// It is asking the client's full name, address, city, postal code.

		System.out.println("Please enter the delivery info:");
		System.out.println();

		System.out.print("Day Of delivery (between 1 and 31) ? ");
		int dayOD = scan.nextInt();
		System.out.print("Month Of delivery (between 1 and 12) ? ");
		int monthOD = scan.nextInt();
		System.out.print("Year Of delivery (between 2020 and 2021) ? ");
		int yearOD = scan.nextInt();
		System.out.print("Distance from source to destination in kilometers ? ");
		double distance = scan.nextDouble();
		System.out.print("Value of the goods ? ");
		double valueOG = scan.nextDouble();
		/*
		 * It is asking the client for the date of delivery, the distance from the
		 * source to the destination (in km) and the value of the goods.
		 */

		System.out.println(
				"_______________________________________________________________________________________________________");
		System.out.println("                                      Montréal Delivery Express                       "
				+ dayOD + " / " + monthOD + " / " + yearOD);
		System.out.println();
		System.out.println();

		System.out.println(fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase() + " "
				+ lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase());
		System.out.println(address);
		System.out.println(
				city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase() + ", QC, " + pCode.toUpperCase());
		// Displays the client's full name, address, city, province and postal code.

		System.out.println(
				"_______________________________________________________________________________________________________");
		System.out.println();

		final double FEE_KM = 0.55, FEE_TPS = 5.0 / 100, FEE_TVQ = 9.975 / 100;
		double deliFee, tpsFinal, tvqFinal, total;

		deliFee = distance * FEE_KM;
		tpsFinal = (valueOG + deliFee) * FEE_TPS;
		tvqFinal = (valueOG + deliFee) * FEE_TVQ;
		total = valueOG + deliFee + tpsFinal + tvqFinal;

		deliFee = Math.round(deliFee * 100.0) / 100.0;
		tpsFinal = Math.round(tpsFinal * 100.0) / 100.0;
		tvqFinal = Math.round(tvqFinal * 100.0) / 100.0;
		total = Math.round(total * 100.0) / 100.0;
		// This calculates the client's sub-total, delivery fees, TPS, TVQ and total.

		System.out.println(
				"Sub-total                                                                         " + valueOG + " $");
		System.out.println("Delivery Fees (55 Cents * " + distance
				+ " KM)                                                " + deliFee + " $");
		System.out.println(
				"TPS   No 12345 6789 RT0001 - 5 %                                                  " + tpsFinal + " $");
		System.out.println(
				"TVQ   No 1234567890 TQ0020 - 9.975 %                                              " + tvqFinal + " $");
		System.out.println();
		System.out.println(
				"Total                                                                             " + total + " $");
		// Displays the client's sub-total, delivery fees, TPS, TVQ and total.

		System.out.println(
				"_______________________________________________________________________________________________________");
		System.out.println();
		System.out.println();

		System.out.println("Thank you for choosing Montréal Delivery Express.");
		System.out.println();
		System.out.println("Receipt generated successfully.");
		// Displays the closing message.

		scan.close();

	}

}
