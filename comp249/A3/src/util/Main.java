// -----------------------------------------------------
// Assignment A3
// CSV INTO HTML
// Written by:Lin Zhu 40126442;Jin Chen 40162195
// -----------------------------------------------------
package util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Main method for executing the file
 */
public class Main {
	/**
	 * Main method for executing the file
	 */
	public static void main(String[] args) {
		Scanner openfile1 = null;
		Scanner openfile2 = null;

		PrintWriter outputfile1 = null;
		PrintWriter outputfile2 = null;

		PrintWriter outputlog = null;
		Scanner input = new Scanner(System.in);
		System.out.println("input the address of the log file?");
		String logfile = input.nextLine();
		try {
			outputlog = new PrintWriter(new FileOutputStream(logfile, true));
		} catch (FileNotFoundException e) {
			System.out.println("Could not open log file " + logfile + " for reading.\r\n"
					+ "Please check that the file exists and is readable. This program will terminate after closing any opened files,and delete all previous open html file");
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Input the address of thy 2 csv file that you need to transfer in to html?");
		String inputaddress1 = input.nextLine();
		String inputaddress2 = input.nextLine();
		try {
			openfile1 = new Scanner(new FileInputStream(inputaddress1), "UTF-8");
		} catch (FileNotFoundException e) {
			System.out.println("Could not open input file " + inputaddress1 + " for reading.\r\n"
					+ "Please check that the file exists and is readable. This program will terminate after closing any opened files.");
			outputlog.write("Could not open input file " + inputaddress1 + " for reading.\r\n"
					+ "Please check that the file exists and is readable. This program will terminate after closing any opened files."
					+ "\n");
			outputlog.close();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			openfile2 = new Scanner(new FileInputStream(inputaddress2), "UTF-8");
		} catch (FileNotFoundException e) {
			String s = "Could not open input file " + inputaddress2 + " for reading.\r\n"
					+ "Please check that the file exists and is readable. This program will terminate after closing any opened files.";
			System.out.println(s);
			outputlog.write(s + "\n");
			outputlog.close();
			openfile1.close();
			outputlog.close();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/// output
		System.out.println("input the address of the  html files wanna transfer to #1?");
		String outputaddress1 = input.nextLine();
		try {
			outputfile1 = new PrintWriter(new FileOutputStream(outputaddress1));
		} catch (FileNotFoundException e) {
			String s = "Could not open html file " + outputaddress1 + " for output.\r\n"
					+ "Please check that the file exists and is readable. This program will terminate after closing any opened files,and delete all previous open html file";
			System.out.println(s);
			outputlog.write(s + "\n");
			openfile1.close();
			openfile2.close();
			outputlog.close();

			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("input the address of the  html files wanna transfer to #2?");
		String outputaddress2 = input.nextLine();
		try {
			outputfile2 = new PrintWriter(new FileOutputStream(outputaddress2));
		} catch (FileNotFoundException e) {
			String s = "Could not open html file " + outputaddress2 + " for output.\r\n"
					+ "Please check that the file exists and is readable. This program will terminate after closing any opened files,and delete all previous open html file";
			System.out.println(s);
			outputlog.write(s + "\n");
			openfile1.close();
			openfile2.close();
			outputlog.close();
			outputfile1.close();
			File A = new File(outputaddress1);
			A.delete();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}


		try {
			String k = getCSV.GETCSV(openfile1);
			int index = 0;
			if (gethtml.ConvertCSVtoHTML(k, inputaddress1, outputaddress1, outputfile1, outputlog)) {
				System.out.println("----------------------" + inputaddress1 + "-------------------------------");
				System.out.println(inputaddress1 + "has converted to HTML FILE:" + outputaddress1);
			} else {
				index++;

			}

			k = getCSV.GETCSV(openfile2);
			if (gethtml.ConvertCSVtoHTML(k, inputaddress2, outputaddress2, outputfile2, outputlog)) {
				System.out.println("----------------------" + inputaddress2 + "-------------------------------");
				System.out.println(inputaddress2 + "has converted to HTML FILE:" + outputaddress2);
			} else {
				index++;

			}
			System.out.println("----------------------print html to console -------------------------------");
			if (0 <= index && index <= 1) {
				System.out.println(
						"Atleast one html file has been sucessfully created and loaded,hence printHTML to file is initiated");
				printHTML.read();

			} else {
				System.out.println(
						"Missing data/attribute for both csv files,cant generate even one html for output to console,hence program terminates.");
				input.close();
				System.exit(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		input.close();

	}
}
