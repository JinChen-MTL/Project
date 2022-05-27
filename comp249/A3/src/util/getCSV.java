// -----------------------------------------------------
// Assignment A3
// CSV INTO HTML
// Written by:Lin Zhu 40126442;Jin Chen 40162195
// -----------------------------------------------------
package util;

import java.util.Scanner;
/**
 * Gets csv info
 *

 */
public class getCSV {
	/**
	 * Gets csv info
	 *
	 * @param inputf A Scanner object for storing the info of a file in to a
	 *               string(original format)
	 * @return return a string that stored the original value
	 */
	public static String GETCSV(Scanner inputf) {
		String inputcontent = "";
		try {
			while (inputf.hasNextLine()) {
				inputcontent = inputcontent.concat(inputf.nextLine()) + "\n";
			}
			inputcontent = inputcontent.replaceAll("\uFEFF", "");
			System.out.println(inputcontent);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return inputcontent;
	}

}
