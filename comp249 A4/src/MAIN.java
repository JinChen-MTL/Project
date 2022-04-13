import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class MAIN {


    public static void main(String[] args) {
        Scanner dictionary = null;
        System.out.println("what's the address of your file?");
       // Scanner input= new Scanner(System.in);
       // String  address = input.next();
        try
        {
            dictionary=new Scanner(new FileInputStream("demo.txt"));
            System.out.println("files found!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> RAW = new ArrayList<String>();
        while (dictionary.hasNext()){
            String s = dictionary.next();

          /*  if(s.substring(0,1).equals("!")){
                continue;
            }*/


            // }
            //STEP 1 :recorded only once
            if(RAW.contains(s.toUpperCase())){
                continue;
            }

            //STEP 3: cannot be recorded with any of the punctuation;
            String computerExclamation="!";
            if(s.contains(computerExclamation)){
                 s=s.replaceAll(computerExclamation,"");
            }
            //STEP 4: No numbers or words that have digits
            if(s.matches("[0-9]+")/*s.contains*/){
                continue;
            }

            //STEP 5: No single characters (i.e. k, M, t, etc.), with the exception of A and I
            if(s.length()==1 &&!(s.toUpperCase().equals("A")||s.toUpperCase().equals("i"))){
                continue;
            }
            //STEP 6: ' CHARACTER NEGLECT
            if(s.toUpperCase().contains("’T"))
            {
                s=s.toUpperCase().replaceAll("’T","");
            }
            if(s.toUpperCase().contains("’LL"))
            {
                    s=s.toUpperCase().replaceAll("’LL","");
            }
            if(s.toUpperCase().contains("’RE"))
            {
                s=s.toUpperCase().replaceAll("’RE","");
            }
            if(s.toUpperCase().contains("’D"))
            {
                s=s.toUpperCase().replaceAll("’D","");
            }
            if(s.toUpperCase().contains("’NT"))
            {
                s=s.toUpperCase().replaceAll("’NT","");
            }
            if(s.toUpperCase().contains("’VE"))
            {
                s=s.toUpperCase().replaceAll("’VE","");
            }
            if(s.toUpperCase().contains("’M"))
            {
                s=s.toUpperCase().replaceAll("’M","");
            }
            if(s.toUpperCase().contains("’N"))
            {
                s=s.toUpperCase().replaceAll("’N","");
            }
            if(s.toUpperCase().contains("’S"))
            {
                s=s.toUpperCase().replaceAll("’S","");
            }
            //STEP 2: recorded only in UPPER CASE
            String s1=s.toUpperCase();
            System.out.println(s1);
            RAW.add(s1);
         }
        System.out.println("----------------");
        Collections.sort(RAW);
        for (String  word : RAW) {
            System.out.println(word);
        }
        char previousFirstChar = 0;

        // Print intro message to outputFile (size of entries and all)
        System.out.println("The document produced this sub-dictionary, which includes "
                + RAW.size() + " entries.");

        if (RAW.size() != 0)
        {
            for (String wordToPrint : RAW)
            {
                // Check if it's a new first letter, and add heading if true
                char firstCharOfWordToPrint = wordToPrint.charAt(0);
                if (firstCharOfWordToPrint != previousFirstChar)
                {
                    // Change the First Char for the next iteration
                    previousFirstChar = firstCharOfWordToPrint;

                    // Print the header
                    System.out.println("\n" + firstCharOfWordToPrint + "\n==");
                }
                // Print the word into the file
                System.out.println(wordToPrint);
            }
        }

        /*int index=0;
        int rollup=0;
        while(true)
            RAW.set(rollup,RAW.get(rollup+1).substring(0,1));
            while(RAW.get(index).substring(0,1).equals(RAW.get(rollup).substring(0,1))){
                rollup++;
            }
            RAW.set(rollup,RAW.get(rollup+1).substring(0,1));
            RAW.set(rollup+1,"==");
            index=rollup+2;
            if()*/




    }
}
