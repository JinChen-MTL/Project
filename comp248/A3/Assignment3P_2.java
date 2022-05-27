//Assignment3 - Question2
//
//Created by Jin Chen.Id:40162195
//
//For COMP248 - sections R- Fall 2021
//
/*In this question, we will write a complete Java program to prompt the user for a sequence of
items with its price in the format of "Item1$Price1,Item2$Price2,Item3$Price3,"as one string.*/
import java.util.Scanner;
public class Assignment3P_2 {
    public static void main(String[] args){
    	//welcome message
        System.out.println("-------****-------****-------****-------****-------");
        System.out.println("      Welcome to Shopping List Program!");
        System.out.println("-------****-------****-------****-------****-------");
        System.out.println("Please enter your shopping list (item$price and seperate by comma): ");
        
        //enter items info
        Scanner in = new Scanner(System.in);
        String list = in.next();

        if(list.equals("0")){
            System.out.println("\nYou have 0 items in the list now! ");
            System.out.println("\nThank you for using this program!!");
        }else{
            System.out.println("\nHere is the list of items:\n");
            //declare variables and constants;
            int totalprice=0;
            int indexOfitem,ItemNumber,indexOfletter;
            char[] price = new char[100];
            String[] temp  = list.split(",");//for 1D-array uses
            String[][] items = new String[100][100];//for 2D-array uses
            //for loop for print out the content
            for(indexOfitem=0;indexOfitem<temp.length;indexOfitem++){
                ItemNumber = indexOfitem+1;
                //1D-char array for storing all prices
                price[indexOfitem] = (char) Integer.parseInt(temp[indexOfitem].substring(temp[indexOfitem].indexOf("$")+1,temp[indexOfitem].length()));
                totalprice+=price[indexOfitem];
                System.out.print("No."+ItemNumber+" ");
                //2D-array for storing the names of Items,and print out.
                for(indexOfletter=0;indexOfletter<temp[indexOfitem].indexOf("$");indexOfletter++){
                    items[indexOfitem][indexOfletter] = temp[indexOfitem].substring(0+indexOfletter,1+indexOfletter);
                    System.out.print(items[indexOfitem][indexOfletter]);
                }
                System.out.println();
                //above display the constant of the shopping list
            }
            System.out.println("The total price is: "+totalprice+".\n\n");
            //above display the result of total price
            System.out.println("Thank you for using this program!!");
            //above display the closing message;
        }

        in.close();
    }
}
