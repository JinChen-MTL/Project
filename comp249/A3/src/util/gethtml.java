// -----------------------------------------------------
// Assignment A3
// CSV INTO HTML
// Written by:Lin Zhu 40126442;Jin Chen 40162195
// -----------------------------------------------------
package util;

import java.io.File;
import java.io.PrintWriter;

/**
 * self-made exception class for missing attribute
 */
@SuppressWarnings("serial")
class CSVAttributeMissing extends Exception {

	public CSVAttributeMissing(String s) {
		super(s);
	}
}

/**
 * self-made exception class for missing data
 */
@SuppressWarnings("serial")
class CSVDataMissing extends Exception {

	public CSVDataMissing(String s) {
		super(s);
	}
}

/**
 * class for getting html
 */
public class gethtml {
	static int count;
	private static String allmissingdata;
	static String filename;
	static int MissingLine;
	private static int nAttributeEr;

	/**
	 * method for checking attribute missing
	 * 
	 * @param strings       arrays of Lines of the inputting file
	 * @param inputfilename name of the input file
	 * @exception CSVAttributeMissing if attribute missing
	 * 
	 */
	public static void checkattribute(String[] strings, String inputfilename) throws CSVAttributeMissing {
		filename = inputfilename;
		boolean check = false;
		for (int t = 0; t < strings.length; t++) {
			if (strings[t].trim().equals("")) {
				nAttributeEr++;
				check = true;
			}
		}
		if (check)
			throw new CSVAttributeMissing("ERROR:In file " + inputfilename + ",missing: " + nAttributeEr
					+ "attribute.File is not converted to HTML" + "\n");
	}

//---------------------------------------------------------------------------
	/**
	 * obtain missing data's name
	 * 
	 * @param j      the data's name located column
	 * @param header array of headers,header[index] locates the value of data's
	 *               missing name
	 * @return data's name
	 */
	public static String Getmissingdataname(int j, String[] header) {
		allmissingdata = header[j];
		return allmissingdata;
	}

	/**
	 * method for checking data missing
	 * 
	 * @param line   arrays of Lines of the inputting file
	 * @param header array of headers,header[index] locates the value of data's
	 *               missing name
	 * @exception CSVDataMissing if data missing
	 * 
	 */
	public static void checkdata(String[] line, String[] header) throws CSVDataMissing {
		boolean check = false;
		String sentence = "";
		String[][] data = new String[line.length][header.length];
		for (int i = 2; i < line.length - 1; i++) {
			data[i] = line[i].split(",");
			for (int j = 0; j < header.length; j++) {
				if (data[i][j].trim().equals("")) {
					sentence = sentence + "WARNNING:In file " + filename + ".line #" + i
							+ " is not converted to HTML--missing data:" + Getmissingdataname(j, header) + "." + "\n";
					check = true;
				}
			}
		}
		if (check)
			throw new CSVDataMissing(sentence);
		else
			System.out.println("no missing from checking data method");
	}

	/**
	 * convert csv to html
	 * 
	 * @param inputfilecontent file content
	 * @param inputfilename    input csv files name
	 * @param outputfilename   output html name
	 * @param outputfile       output html object
	 * @param logfile          exception log page for recording error
	 * @return return a boolean value if its false,then as least one file missing
	 *         attribute or/and data,then that missing data/attributes html file
	 *         will be deleted
	 */
	public static boolean ConvertCSVtoHTML(String inputfilecontent, String inputfilename, String outputfilename,
			PrintWriter outputfile, PrintWriter logfile) {

		String[] csvValues = inputfilecontent.split("\n");// get all lines
		String[] header = csvValues[1].split(",");// get each lines all object separated by comma
		boolean check = true;

		try {
			checkattribute(header, inputfilename);
			System.out.println("no missing attirbutes");
		} catch (CSVAttributeMissing e) {
			System.out.println(e.getMessage());
			logfile.write(e.getMessage());
			logfile.flush();
			check = false;
		} catch (Exception e) {
			e.getStackTrace();
		}

		try {
			checkdata(csvValues, header);
			System.out.println("no missing data");
			System.out.println("------------Yes,no data/attribute missing at all!-------------");
			System.out.println("");
			System.out.println("--------Start converting in to regarding html file!-------------");
		} catch (CSVDataMissing k) {
			System.out.println(k.getMessage());
			logfile.write(k.getMessage() + "\n" + "----------File execptions check finished------------");
			logfile.flush();
			check = false;
		} catch (Exception k) {
			k.getStackTrace();
		}
		if (!check) {
			outputfile.close();
			File A = new File(outputfilename);
			System.out.println("As missing attribute/data,html file cannot be generated,so created default html file:"
					+ outputfilename + "has been deleted");
			if(A.delete()) {
				System.out.println("Delete successfully!");
				System.out.println("-----------------------------------------------------------------------");

			}
			logfile.write("\n" + "As missing attribute/data,html file cannot be generated,so created default html file:"
					+ outputfilename + "has been deleted");
			logfile.close();
		}

		// A1+A2+A3+A4+A5+A6
		while (check) {
			String A1 = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<style>\r\n"
					+ "table {font-family: arial, sans-serif;border-collapse: collapse;}\r\n"
					+ "td, th {border: 1px solid #000000;text-align: left;padding: 8px;}\r\n"
					+ "tr:nth-child(even) {background-color: #dddddd;}\r\n" + "span{font-size: small}\r\n"
					+ "</style>\r\n" + "<body>\r\n" + "\r\n" + "<table>\r\n" + "<caption>";
			String A2 = csvValues[0].replace(",", "") + "</caption>" + "\n";
			// String A3
			String A3 = "";// tr th

			String[] LINES = inputfilecontent.split("\n");
			for (int j = 1; j < LINES.length; j++) {
				String A4 = "";
				String[] DATA = LINES[j].split(",");
				if (j == 1) {
					for (int k = 0; k < DATA.length; k++) {
						A4 += "<th>" + DATA[k] + "</th>" + "\n";
					}
					A3 += "<tr>" + "\n" + A4 + "</tr>" + "\n";
				} else if (j > 1 && j < LINES.length - 1) {
					for (int k = 0; k < DATA.length; k++) {
						A4 += "<td>" + DATA[k] + "</td>" + "\n";
					}
					A3 += "<tr>" + "\n" + A4 + "</tr>" + "\n";
				} else {
					A3 += "</table>\r\n" + "<span>" + csvValues[csvValues.length - 1].replace(",", "") + "</span>\r\n"
							+ "</body>\r\n" + "</html>";
				}
			}
			String html = A1 + A2 + A3;
			WriteinHtml.WritetoHtml(html, outputfile);
			break;
		}
		return check;

	}
}
