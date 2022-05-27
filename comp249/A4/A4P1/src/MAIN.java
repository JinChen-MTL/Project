//Jin Chen ID 40162195 Lin Zhu ID 40126442
//COMP249
//Assignment # 4
//Due Date 2022/04/15
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MAIN {

	public static void main(String[] args) {
		Scanner dictionary = null;
		PrintWriter text = null;
		System.out.println("what's the address of your file?");
		Scanner input = new Scanner(System.in);
		String inputaddress = input.next();

		try {
			dictionary = new Scanner(new FileInputStream(inputaddress));
			System.out.println("files found!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String outputaddress = input.next();
		try {
			text = new PrintWriter(new FileOutputStream(outputaddress));
			System.out.println("files found!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		input.close();
		ArrayList<String> RAW = new ArrayList<String>();
		while (dictionary.hasNext()) {
			String s = dictionary.next();

			// STEP 3: cannot be recorded with any of the punctuation;
			if (s.contains("?") || s.contains(":") || s.contains(",") || s.contains("=") || s.contains(";")
					|| s.contains("!") || s.contains(".")) {
				s = s.replaceAll("\\p{Punct}", "");
			}

			// STEP 4: No numbers or words that have digits
			if (s.contains("0") || s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4")
					|| s.contains("5") || s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9")) {
				continue;
			}

			// STEP 5: No single characters (i.e. k, M, t, etc.), with the exception of A
			// and I
			if (s.length() == 1 && !(s.toUpperCase().equals("A") || s.toUpperCase().equals("i"))) {
				continue;
			}
			// STEP 6: ' CHARACTER NEGLECT
			if (s.toUpperCase().contains("'T")) {
				s = s.toUpperCase().replaceAll("'T", "");
			}
			if (s.toUpperCase().contains("'LL")) {
				s = s.toUpperCase().replaceAll("'LL", "");
			}
			if (s.toUpperCase().contains("'RE")) {
				s = s.toUpperCase().replaceAll("'RE", "");
			}
			if (s.toUpperCase().contains("'D")) {
				s = s.toUpperCase().replaceAll("'D", "");
			}
			if (s.toUpperCase().contains("'NT")) {
				s = s.toUpperCase().replaceAll("'NT", "");
			}
			if (s.toUpperCase().contains("'VE")) {
				s = s.toUpperCase().replaceAll("'VE", "");
			}
			if (s.toUpperCase().contains("'M")) {
				s = s.toUpperCase().replaceAll("'M", "");
			}
			if (s.toUpperCase().contains("'N")) {
				s = s.toUpperCase().replaceAll("'N", "");
			}
			if (s.toUpperCase().contains("'S")) {
				s = s.toUpperCase().replaceAll("'S", "");
			}
			// STEP 1 :recorded only once
			if (RAW.contains(s.toUpperCase()) || s.equals("")) {
				continue;
			}
			// STEP 2: recorded only in UPPER CASE
			String s1 = s.toUpperCase();

			RAW.add(s1);
		}
		System.out.println("----------------");
		// ==========================
		boolean isSwapped = false;

		do {
			isSwapped = false;
			for (int i = 0; i < RAW.size() - 1; i++) {
				if (RAW.get(i).substring(0, 1).compareTo(RAW.get(i + 1).substring(0, 1)) > 0) {
					String temp = RAW.get(i + 1);
					RAW.set(i + 1, RAW.get(i));
					RAW.set(i, temp);
					isSwapped = true;
				}
			}

		} while ((isSwapped));
		text.println("The document produced this sub-dictionary, which includes " + RAW.size());
		System.out.println("The document produced this sub-dictionary, which includes " + RAW.size());

		char previousFirstChar = 0;

		if (RAW.size() != 0) {
			for (String wordToPrint : RAW) {
				// Check if it's a new first letter, and add heading if true
				char firstCharOfWordToPrint = wordToPrint.charAt(0);
				if (firstCharOfWordToPrint != previousFirstChar) {
					// Change the First Char for the next iteration
					previousFirstChar = firstCharOfWordToPrint;

					// Print the header
					text.println("\n" + firstCharOfWordToPrint + "\n==");
					System.out.println("\n" + firstCharOfWordToPrint + "\n==");

				}
				// Print the word into the file
				text.println(wordToPrint);
				System.out.println(wordToPrint);
			}
			text.close();
		}

	}
}
