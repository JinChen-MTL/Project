
//Assignment3 - Question1
//
//Created by Jin Chen.Id:40162195
//
//For COMP248 - sections R- Fall 2021
//
/* This program is to prompt the user for a leap or common year and display all the dates of the month are NOT the multiple of the month.*/
import java.util.Scanner;

public class Assignment3P1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// welcome message
		System.out.println("-------****-------****-------****-------****-----");
		System.out.println("      Welcome to Calendar Program!");
		System.out.println("-------****-------****-------****-------****-----\n");
		System.out.println("Please enter a 4-digit year:");
		// declare variable
		int year, monthNumber, date, numberInline;
		year = in.nextInt();
		// creates a string array for all months.
		String[] month = new String[13];
		month[0] = "";// for making the array more clearly;
		month[1] = "January";
		month[2] = "February";
		month[3] = "March";
		month[4] = "April";
		month[5] = "May";
		month[6] = "June";
		month[7] = "July";
		month[8] = "August";
		month[9] = "September";
		month[10] = "October";
		month[11] = "November";
		month[12] = "December";
//validate the year input.
		while (year < 999 || year > 9999) {
			System.out.println("please enter a 4-digit year:");
			year = in.nextInt();
		}
		System.out.println("");
		System.out.println("");
		// nested loop for print out the months.
		for (monthNumber = 1; monthNumber <= 12; monthNumber++) {
			// for January
			if (monthNumber == 1) {
				System.out.println("In " + month[monthNumber] + ", the dates are not multiple of 1 are: ");
				System.out.println("No dates are found in this month! ");
				System.out.println("");
			}
			// for January
			else if (monthNumber == 2) {
				// when it's a leap year
				if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
					System.out.println("In " + month[monthNumber] + ",in a leap year, the dates are not multiple of "
							+ monthNumber + " are: ");
					// display all the dates of the month are NOT the multiple of the month.
					for (date = 1, numberInline = 0; date <= 29; date++) {
						if (date % monthNumber != 0) {
							System.out.print(date + ", ");
							// for auto go to next line if has 15 numbers in a line.
							numberInline++;
							if (numberInline % 15 == 0) {
								System.out.println("\n");
							}
						}
					}
				}
				// when it's a common year
				else {
					System.out.println("In " + month[monthNumber] + ",in a common year, the dates are not multiple of "
							+ monthNumber + " are: ");
					// display all the dates of the month are NOT the multiple of the month.
					for (date = 1, numberInline = 0; date <= 28; date++) {
						if (date % monthNumber != 0) {
							System.out.print(date + ", ");
							// for auto go to next line if has 15 numbers in a line.
							numberInline++;
							if (numberInline % 15 == 0) {
								System.out.print("\n");
							}
						}
					}
					System.out.println("\n");
				}
			}
			// for April,June,September,November;as they all have 30 days.
			else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
				System.out.println(
						"In " + month[monthNumber] + ", the dates are not multiple of " + monthNumber + " are: ");
				// display all the dates of the month are NOT the multiple of the month.
				for (date = 1, numberInline = 0; date <= 30; date++) {
					if (date % monthNumber != 0) {
						System.out.print(date + ", ");
						// for auto go to next line if has 15 numbers in a line.
						numberInline++;
						if (numberInline % 15 == 0) {
							System.out.println("");
						}
					}
				}
				System.out.println("\n");
			}
			// for March,May,July,August,September,October and December;As only 12 months
			// As the outer loop stated, the "else" part will be them;
			else {
				System.out.println(
						"In " + month[monthNumber] + ", the dates are not multiple of " + monthNumber + " are: ");
				// display all the dates of the month are NOT the multiple of the month.
				for (date = 1, numberInline = 0; date <= 31; date++) {
					if (date % monthNumber != 0) {
						System.out.print(date + ", ");
						// for auto go to next line if has 15 numbers in a line.
						numberInline++;
						if (numberInline % 15 == 0) {
							System.out.println("");
						}
					}
				}
				System.out.println("\n");

			}
		}
		in.close();
		// closing message
		System.out.print("Thank you for using this program!!");
	}
}
