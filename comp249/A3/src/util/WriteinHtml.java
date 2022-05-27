// -----------------------------------------------------
// Assignment A3
// CSV INTO HTML
// Written by:Lin Zhu 40126442;Jin Chen 40162195
// -----------------------------------------------------
package util;
import java.io.PrintWriter;

/**
 * Write the string in to the html file(load in)
 *
 */
public class WriteinHtml {
	/**
	 * Write the string in to the html file(load in)
	 * 
	 * @param content    formatted HTML code
	 * @param outputfile output file object for loading info into html uses
	 */
	public static void WritetoHtml(String content, PrintWriter outputfile) {
		try {
			outputfile.write(content);
			outputfile.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("print successfully");
		}
	}
}
