// -------------------------------------------------------
// Assignment 2 part 1 
// Written by: Jin Chen Id 40162195
// For COMP 248 Section (your section) – Fall 2021
// Purpose:a registration program for new coming Concordia University students.
// --------------------------------------------------------

//set up Scanner for keyboard inputting.
import java.util.Scanner; 

public class assignmentp1 {

	public static void main(String[] args) {
		
		//Welcoming sentences
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("    Welcome to Concordia University    ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");		     
		 
		 //string variables for name,department,have passport or not,birth date,whether student or not.    
		 String firstname,lastname,department,birth,WhetherNewStudent,Fullname;
		 //save a boolean
		 boolean passport;
		
		 //index of Comma,use to subtract first and last name,then relocate their position.  Student ID stores in id.
		 int indexOfComma,id;
		 
		 //set up Scanner features.
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("\nAre you a new coming student student at Concordia? (yes or no)");
		 WhetherNewStudent = sc.next();		
         //when student answer no
		 if(WhetherNewStudent.equals("no"))
			{
			System.out.println("\nWelcome back! Hope you are having a great semester!");
		    System.out.println("\nThank you for using this Program!");
		    }

		
         //when student answer yes
		 else if(WhetherNewStudent.equals("yes"))
		 {
			 //get the name of the student,store it in String name.
			System.out.print("\nPlease enter your name(Lastname,Firstname seperated by comma):");
			Fullname = sc.next();
			
			//attain the index of","use  substring to "split" first and last name from a whole name.
			indexOfComma = Fullname.indexOf(",");
			firstname = Fullname.substring(indexOfComma+1);
			lastname=Fullname.substring(0,indexOfComma);
			
			//transform leading letter into Uppercase for both.
			lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1);
			firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
			
			//Strong the whole name in one string(as required),position has been altered.
			Fullname  =  firstname+" "+lastname;
			
			//ask for birth
			System.out.print("\nPlease enter your date of birth: ");
		    birth = sc.next();
			
			//ask for vaccine passport,store in String passport.
		    System.out.print("\nDo you have covid19 vaccine passport?(true or false): ");
			passport = sc.nextBoolean();			
			
			//ask for department,store in String dept.
		    System.out.print("\nPlease enter your department: ");
			department = sc.next();
			
			//greeting sentence,String name is used.
		    System.out.println("");
		    System.out.println("Congratulations, "+Fullname+" !  You have seccessfully registered at Concordia University!");
		   
		    //calculate random 7 digits id using math.random,as Int will dismiss leading zero,if statement is used.
		    //transfer the value to int since Math.random generates double type number.
		    //since it might generate a 7 digits number with 0 as leading,as the leading one will be dismissed by int,set up while if statement is needed
		    //set that it will loop if id is smaller than 1000000 (int will negelect first leading zero,sometimes wont give 7 digits),then loop will break once its a 7 digits.
		    while(true) {
			    id =(int)(Math.random()*10000000); 
				if(id>=1000000){
				   System.out.println("\nYour student ID is "+id+".");
				   break;
			   }else{
				   continue;
				   }
		    }
		    //Line 55th's answer will reflect on following.To validate correctness of user’s passport.
		    if(!passport)
		        {
		        System.out.println("\nHope you will get your vaccine passport soon! Take care!");
		        }
		    
		   //closing message
		    System.out.print("\nThank you for using this program!");
		 } 
		
		 //Scanner closed,finished.
		sc.close();
	}
}