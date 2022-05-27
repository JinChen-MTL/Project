// -----------------------------------------------------
// Assignment A3
// CSV INTO HTML
// Written by:Lin Zhu 40126442;Jin Chen 40162195
// -----------------------------------------------------
package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * Print the html in to the console
 *
 */
public class printHTML {
	/**
	 * Print the html in to the console
	 * 
	 */
	public static void read() {
		String contenthtml = "";
		int i = 1;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("type your address for input to console");
			String address = input.nextLine();
			BufferedReader reader=null;
			try {
				reader = new BufferedReader(new FileReader(address));
				while ((reader.readLine()) != null) {
					contenthtml += reader.readLine() + "\n";
				}
				System.out.print(contenthtml);
				input.close();
				System.out.print("loading done,byebye!");
				System.exit(0);
			} catch (FileNotFoundException e) {
				System.out.println("wrong address,do it again");
				if (i == 2) {
					System.out.print("No chance left,byebye!");
					input.close();
					System.exit(0);
				}
			} catch (NoSuchElementException e) {
				System.out.println("wrong!!!");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				i++;
			}
		}

	}
}
