//---------------------------------------------------------------------
//Assignment 4
//Written by: jin chen(40162195);lin zhu(40126442)
//For Comp 248 Section (Section R) Fall 2021
//---------------------------------------------------------------------

//**********************************************************************
//Purpose:This program is to simulate a ticketbooth which holds tickets and OPUSCard
//with a Tickets class, a OPUSCard class, a Ticketbooth class and a driver.
//***********************************************************************

import java.util.Scanner;

public class driver {
	public static void main(String[] args) {

//objects data set up.
		// 2 ticketbooths have exactly the same ticket distribution and the same number
		// of OPUScards.
		Tickets tickets0 = new Tickets(5, 1, 0, 1, 1);
		OPUSCard[] opusCard0 = new OPUSCard[5];
		OPUSCard opusCard01 = new OPUSCard("STL", "M. Cola", 8, 2024);
		OPUSCard opusCard02 = new OPUSCard("RTL", "C.Venus", 3, 2025);
		opusCard0[0] = opusCard01;
		opusCard0[1] = opusCard02;
		Ticketbooth ticketbooth0 = new Ticketbooth(tickets0, opusCard0);

		// 2 ticketbooths have exactly the same ticket distribution and the same number
		// of OPUScards.
		Tickets tickets1 = new Tickets(5, 1, 0, 1, 1);
		OPUSCard[] opusCard1 = new OPUSCard[5];
		// objects that pre-setup as sample-run states;
		OPUSCard opusCard11 = new OPUSCard("STL", "M. Cola", 8, 2024);
		OPUSCard opusCard12 = new OPUSCard("STM", "Z. Poker", 10, 2022);
		opusCard1[0] = opusCard11;
		opusCard1[1] = opusCard12;
		Ticketbooth ticketbooth1 = new Ticketbooth(tickets1, opusCard1);

		// 1 ticketbooth with the same total value of tickets of another ticketbooth but
		// with a different configuration of tickets and this ticketbooth should have at
		// least 3 OPUS cards
		Tickets tickets2 = new Tickets(5, 5, 5, 5, 5);
		OPUSCard[] opusCard2 = new OPUSCard[5];
		OPUSCard opusCard21 = new OPUSCard("RTL", "M. Cola", 12, 2021);
		OPUSCard opusCard22 = new OPUSCard("REM", "Z. Poker", 04, 2023);
		OPUSCard opusCard23 = new OPUSCard("TRAMREM", "S. EaFL", 11, 2021);
		opusCard2[0] = opusCard21;
		opusCard2[1] = opusCard22;
		opusCard2[2] = opusCard23;
		Ticketbooth ticketbooth2 = new Ticketbooth(tickets2, opusCard2);

		// The last 2 ticketbooths have the same breakdown of tickets but different from
		// the other 3 and both have no OPUS cards.
		Tickets tickets3 = new Tickets(0, 1, 1, 1, 1);
		OPUSCard[] opusCard3 = new OPUSCard[5];
		Ticketbooth ticketbooth3 = new Ticketbooth(tickets3, opusCard3);

		// The last 2 ticketbooths have the same breakdown of tickets but different from
		// the other 3 and both have no OPUS cards.
		Tickets tickets4 = new Tickets(0, 1, 1, 1, 1);
		OPUSCard[] opusCard4 = new OPUSCard[5];
		Ticketbooth ticketbooth4 = new Ticketbooth(tickets4, opusCard4);

		Ticketbooth[] ticketbooths = new Ticketbooth[5];

		ticketbooths[0] = ticketbooth0;
		ticketbooths[1] = ticketbooth1;
		ticketbooths[2] = ticketbooth2;
		ticketbooths[3] = ticketbooth3;
		ticketbooths[4] = ticketbooth4;

		// welcome message
		System.out.println("==============================================================");
		System.out.println("Welcome to Concordia 2021 Fall Geek's Ticketbooth Application");
		System.out.println("==============================================================");
		System.out.println("");
		Scanner sc = new Scanner(System.in);

		A: while (true) {
			double[] boothticketsvalue = new double[5];
			for (int i = 0; i < boothticketsvalue.length; i++) {
				boothticketsvalue[i] = ticketbooths[i].tickets.ticketsTotals();
			}

			Tickets[] ticketsCompare = new Tickets[5];
			for (int i = 0; i < ticketsCompare.length; i++) {
				ticketsCompare[i] = ticketbooths[i].tickets;
			}

			int[] opuscardCount = new int[5];
			for (int i = 0; i < opuscardCount.length; i++) {
				opuscardCount[i] = ticketbooths[i].OPUSCardCount();
			}

			// Menu
			System.out.println("");
			System.out.println("What would you like to do?");
			System.out.println("   1. See the content of all Ticketbooths");
			System.out.println("   2. See the content of one Ticketbooth");
			System.out.println("   3. List Ticketbooths with same amount of tickets' values");
			System.out.println("   4. List Ticketbooths with same Tickets amount");
			System.out.println(
					"   5. List Ticketbooths with same amount of tickets values and same number of OPUS cards");
			System.out.println("   6. Add a OPUS card to an existing Ticketbooth");
			System.out.println("   7. Remove an existing OPUS card from a Ticketbooth");
			System.out.println("   8. Update the expiry date of an existing OPUS card");
			System.out.println("   9. Add Tickets to a Ticketbooth");
			System.out.println("   0. To quit");
			System.out.println("");
			System.out.print("Please enter your choice and press <Enter>:");
			int num = sc.nextInt();

			switch (num) {
			// to quit
			case 0:

				System.out.println("Thank you for using Concordia Fall Geek's Ticketbooth application!");

				break A;

			// Display the tickets and OPUS cards of each ticketbooth. Make sure all output
			// is clearlylabelled.
			case 1:

				System.out.println("Content of each Ticketbooth:");
				System.out.println("---------------------");

				System.out.println("Ticketbooth #0:");
				System.out.println(ticketbooths[0].tickets.toString());
				if (ticketbooth0.isEmpty(opusCard0) == false) {
					for (int i = 0; i < opusCard0.length; i++) {
						if (opusCard0[i] != null) {
							opusCard0[i].toString();

						}
					}
				} else {
					System.out.println("No OPUS cards");
				}
				System.out.println("");

				System.out.println("Ticketbooth #1:");
				System.out.println(ticketbooths[1].tickets.toString());
				if (ticketbooth1.isEmpty(opusCard1) == false) {
					for (int i = 0; i < opusCard1.length; i++) {
						if (opusCard1[i] != null) {
							opusCard1[i].toString();

						}
					}
				} else {
					System.out.println("No OPUS cards");
				}
				System.out.println("");

				System.out.println("Ticketbooth #2:");
				System.out.println(ticketbooths[2].tickets.toString());
				if (ticketbooth2.isEmpty(opusCard2) == false) {
					for (int i = 0; i < opusCard2.length; i++) {
						if (opusCard2[i] != null) {
							opusCard2[i].toString();

						}
					}
				} else {
					System.out.println("No OPUS cards");
				}
				System.out.println("");

				System.out.println("Ticketbooth #3:");
				System.out.println(ticketbooths[3].tickets.toString());
				if (ticketbooth3.isEmpty(opusCard3) == false) {
					for (int i = 0; i < opusCard3.length; i++) {
						if (opusCard3[i] != null) {
							opusCard3[i].toString();

						}
					}
				} else {
					System.out.println("No OPUS cards");
				}
				System.out.println("");

				System.out.println("Ticketbooth #4:");
				System.out.println(ticketbooths[4].tickets.toString());
				if (ticketbooth4.isEmpty(opusCard4) == false) {
					for (int i = 0; i < opusCard4.length; i++) {
						if (opusCard4[i] != null) {
							opusCard4[i].toString();

						}
					}
				} else {
					System.out.println("No OPUS cards");
				}
				break;

			// Ask the user which ticketbooth they wish to see the content of, and display
			// the ticketsand OPUS card(s) info for that ticketbooth.
			case 2:
				System.out.print("Which Ticketbooth do you want to see the content of? (Enter number 0 to 4):");
				while (true) {
					int num1 = sc.nextInt();
					if (num1 > 4) {
						System.out.println("Sorry but there is no Ticketbooth number 5");
						System.out.println("--> Try again: (Enter number 0 to 4):");
					} else {
						switch (num1) {
						case 0:
							System.out.println(ticketbooths[0].tickets.toString());
							if (ticketbooth0.isEmpty(opusCard0) == false) {
								for (int i = 0; i < opusCard0.length; i++) {
									if (opusCard0[i] != null) {
										opusCard0[i].toString();

									}
								}
							} else {
								System.out.println("No OPUS cards");
							}
							break;
						case 1:
							System.out.println(ticketbooths[1].tickets.toString());
							if (ticketbooth1.isEmpty(opusCard1) == false) {
								for (int i = 0; i < opusCard1.length; i++) {
									if (opusCard1[i] != null) {
										opusCard1[i].toString();

									}
								}
							} else {
								System.out.println("No OPUS cards");
							}
							break;
						case 2:
							System.out.println(ticketbooths[2].tickets.toString());
							if (ticketbooth2.isEmpty(opusCard2) == false) {
								for (int i = 0; i < opusCard2.length; i++) {
									if (opusCard2[i] != null) {
										opusCard2[i].toString();

									}
								}
							} else {
								System.out.println("No OPUS cards");
							}
							break;
						case 3:
							System.out.println(ticketbooths[3].tickets.toString());
							if (ticketbooth3.isEmpty(opusCard3) == false) {
								for (int i = 0; i < opusCard3.length; i++) {
									if (opusCard3[i] != null) {
										opusCard3[i].toString();

									}
								}
							} else {
								System.out.println("No OPUS cards");
							}
							break;
						case 4:
							System.out.println(ticketbooths[4].tickets.toString());
							if (ticketbooth4.isEmpty(opusCard4) == false) {
								for (int i = 0; i < opusCard4.length; i++) {
									if (opusCard4[i] != null) {
										opusCard4[i].toString();

									}
								}
							} else {
								System.out.println("No OPUS cards");
							}
							break;
						}
						break;
					}

				}
				break;

			// Compare all ticketbooths and display those pairs that have the same total
			// tickets¡¯ amountalong with the $ amount.
			case 3:
				System.out.println("List of Ticketbooths with same amount of money:");
				for (int i = 0; i < 5; i++) {
					for (int j = i + 1; j < 5; j++) {
						if (boothticketsvalue[i] == boothticketsvalue[j]) {
							System.out
									.println("Ticketbooths " + i + " and " + j + " both have " + boothticketsvalue[i]);
						}
					}
				}

				break;

			// Compare all ticketbooths and display the pairs that have the same ticket
			// distribution
			case 4:
				System.out.println("List of Ticketbooths with same Tickets amount: ");
				System.out.println("");

				for (int i = 0; i < 5; i++) {
					for (int j = i + 1; j < 5; j++) {
						if (ticketsCompare[i].equals(ticketsCompare[j])) {
							System.out.println(
									"Ticketbooths " + i + " and " + j + " both have " + ticketsCompare[i].toString());
						}
					}
				}
				break;

			// List all ticketbooth pairs that are equal based on the definition of equal in
			// the classTicketbooth.
			case 5:
				System.out.println(
						"List of Ticketbooths with same amount of tickets values and same number of OPUS cards:");
				System.out.println("");
				for (int i = 0; i < 5; i++) {
					for (int j = i + 1; j < 5; j++) {
						if (boothticketsvalue[i] == boothticketsvalue[j] && opuscardCount[i] == opuscardCount[j]) {
							System.out.println("Ticketbooths " + i + " and " + j);
						}
					}
				}
				break;

			// Ask the user which ticketbooth they want to add an OPUS card to
			case 6:

				System.out.print("Which Ticketbooth do you want to add a OPUS card to? (Enter number 0 to 4):");
				int num2 = sc.nextInt();
				System.out.println("Please enter the following information so that we may complete the transaction-");
				System.out.println("--> Type of OPUS card (STL,RTL,etc ..):");
				String tempType = sc.next();
				System.out.println("--> Full name on OPUS card:(seperate by space)");
				String firstname = sc.next();
				String lastname = sc.next();
				System.out.println("--> Expiry month number and year (seperate by a space):");
				String temp = sc.nextLine();
				String tempMandY = sc.nextLine();

				String[] array1 = tempMandY.split(" ");
				int tempMonth = Integer.parseInt(array1[0]);
				int tempYear = Integer.parseInt(array1[1]);
				String tempName = firstname + lastname;
				OPUSCard addCard = new OPUSCard(tempType, tempName, tempMonth, tempYear);
				ticketbooths[num2].addOPUSCard(addCard);

				break;

			// Ask the user which ticketbooth they want to remove an OPUS card from
			case 7:
				System.out.print("Which Ticketbooth do you want to remove a OPUS card from? (Enter number 0 to 4):");
				int num3 = sc.nextInt();
				if (ticketbooths[num3].OPUSCardCount() == 0) {
					System.out.println("Sorry that Ticketbooth has no cards");
				} else {
					int count = ticketbooths[num3].OPUSCardCount();
					System.out.print("(Enter card number 0 to " + (count - 1) + "):");
					int num4 = sc.nextInt();
					ticketbooths[num3].removeOPUSCard(num4);
					int fin = 0;
					for (int m = 0; m < ticketbooths[num3].opusCard.length; m++) {
						if (ticketbooths[num3].opusCard[m] != null) {
							fin++;
						}

					}
					for (int i = 0; i < (fin - num4); i++) {
						ticketbooths[num3].opusCard[num4 + i] = ticketbooths[num3].opusCard[num4 + i + 1];
						if (i == (fin - num4 - 1)) {
							ticketbooths[num3].opusCard[fin] = null;
						}

					}
				}

				break;

			// Ask the user which card from which ticketbooth they want to update.
			case 8:
				System.out.print("Which Ticketbooth do you want to update a OPUS card from? (Enter 0 to 4):");
				int num4 = sc.nextInt();
				int tempUpdate = ticketbooths[num4].OPUSCardCount();
				System.out.print("Which card do you want to update? (Enter card number 0 to " + (tempUpdate - 1) + ")");
				int num5 = sc.nextInt();
				if (num5 >= tempUpdate) {
					System.out.println("Sorry but there is no card number " + num5);
					System.out.println("--> Try again:");
					System.out.print("(Enter card number 0 to " + (tempUpdate - 1) + "):");
					num5 = sc.nextInt();

				}
				System.out.println("-->Enter new expiry month number and year (seperate by a space): ");
				String mm = sc.nextLine();
				String updateMandY = sc.nextLine();
				String[] array2 = updateMandY.split(" ");
				int upMonth = Integer.parseInt(array2[0]);
				int upYear = Integer.parseInt(array2[1]);
				ticketbooths[num4].updateMonthandYear(num5, upMonth, upYear);
				break;

			// Ask the user which ticketbooth¡¯s tickets they want to add to and the number
			// of eachtickets they want to add.
			case 9:
				System.out.print("Which Ticketbooth do you want to add Tickets to? (Enter number 0 to 4):");
				int num6 = sc.nextInt();
				System.out.println("How many regular,junior,senior,daily and weekly do you want to add?");
				System.out.println("(Enter 5 numbers seperated by a space):");
				String bb = sc.nextLine();
				String addTickets = sc.nextLine();
				String[] array3 = addTickets.split(" ");
				int r1 = Integer.parseInt(array3[0]);
				int j1 = Integer.parseInt(array3[1]);
				int s1 = Integer.parseInt(array3[2]);
				int d1 = Integer.parseInt(array3[3]);
				int w1 = Integer.parseInt(array3[4]);
				ticketbooths[num6].addTickets(r1, j1, s1, d1, w1);
				break;

			// enters an invalid choice,request a new choice
			default:
				System.out.println("Sorry that is not a valid choice. Try again.");
				System.out.println("");
				break;
			}
			System.out.println();

		}
		// closed
		sc.close();

	}
}
