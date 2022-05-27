import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

  public class cellistutilization {
	public static cellphone parseCellphone(Scanner read ) {
		String readLine=read.nextLine();
		StringTokenizer token = new StringTokenizer(readLine);  
		String [] form=new String[4];
		int place = 0;
	    while (token.hasMoreTokens()) {  
	    	form[place]=token.nextToken();
	    	place++;
 	     }  
 		return  new cellphone(Long.parseLong(form[0]),form[1], Double.parseDouble(form[2]), Integer.parseInt(form[3]));
		
	}
	public static long returncheckserial(celllist k) {
		Scanner input1 = new Scanner(System.in);
 		boolean tempoo = true;
		long k13 = 0;
 			try {
				System.out.println("enter serial number(must be not seen before):");
				k13 = input1.nextLong();
				if (!k.contains(k13))
					tempoo = false;

			} catch (InputMismatchException e) {
				System.out.println("wrong input,system end---from returncheckserial method");
				System.exit(0);
			} catch (NoSuchElementException e) {
				System.out.println("why");
				System.exit(0);
			}

		input1.close();
		return k13;
	}
	public static cellphone objectcreater(celllist k){

		Scanner input = new Scanner(System.in);
		String brand = "";
		long price = 0;
		long serial1 = 0;

		int years = 0;
		try{
			System.out.println("enter brand:");
			 brand=input.next();
			System.out.println("enter price:");
			 price=input.nextLong();
			System.out.println("enter years:");
			 years=input.nextInt();
			 while(true){
				 System.out.println("enter serial number(must be not seen before):");
				 serial1=input.nextLong();
				 if (!k.contains(serial1)){
					 System.out.println("it didnt contain previous serial");
					 break;

				 }

			 }
		}catch(InputMismatchException e){
			System.out.println("wrong input,system end");
			System.exit(0);
		}
		input.close();
		return new cellphone( serial1,brand,   price,  years );

	}

	public static <k5> void main(String[] args)   {

		// TODO Auto-generated method stub
		celllist emptylist1 = new celllist();
		//celllist emptylist2    = new celllist();
		Scanner read=null;
		try {
			 read= new Scanner(new FileInputStream("Cell_Info.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Cell_Info.txt not found,ended.");
			System.exit(0);
		}
		
 		while (read.hasNextLine())
		{
		
 			cellphone cellPhoneperLine = parseCellphone(read);
			System.out.println("Created successfully");
			System.out.println("Checking serial number...");
			// Only add if the serial number doesn't exist
			if (!emptylist1.contains(cellPhoneperLine.getSerialnum()))
			{
				System.out.println("Adding to   list...");
				emptylist1.add(cellPhoneperLine);
 
			}
			else
			{
				System.out.println("Duplicate entry: ignoring...");
			}
			System.out.println("Add successful");

		
	}
		read.close();

		System.out.println("adding done");
		Scanner input = new Scanner(System.in);


 		System.out.println("===============================================");
		System.out.println("check content");
		emptylist1.showcontents();
		System.out.println("\n"+"===============================================");
		System.out.println("\n"+"input serial,then check whether contains?");
  		Long serial=input.nextLong();
		System.out.println(emptylist1.contains(serial));
 		System.out.println("===============================================");
		System.out.println("add to start check:");
  		emptylist1.addtostart(objectcreater(emptylist1));
		emptylist1.showcontents();
 	 	System.out.println("===============================================");
		System.out.println("insert at index 2 :");
		System.out.println("which index pos u wanna add to?");
		cellphone demmm1= new cellphone(123214124,"hello",   20001,  2023 );
		emptylist1.insertatindex(demmm1,1);
		emptylist1.showcontents();
		System.out.println("===============================================");
		System.out.println("delete from  index :");
 		int a1=input.nextInt();

		try{
			emptylist1.deletefromindex(a1);
			emptylist1.showcontents();
		}catch(NoSuchElementException  e){
			System.out.println("not in range");
			System.exit(0);
		}



		System.out.println("===============================================");
		System.out.println("delete from start :");
		emptylist1.deleteFromStart();
		emptylist1.showcontents();

		System.out.println("===============================================");
		System.out.println("replace at index:");
		System.out.println("which index pos u wanna replace?");
		int a2=0;

			Scanner input1 = new Scanner(System.in);
			a2=input1.nextInt();
			input1.close();

		try{
			emptylist1.replaceatindex(new cellphone(123214124,"hello",   20001,  2023 ),a2);//return wont do anything
			emptylist1.showcontents();
		} catch(NoSuchElementException  e){
			System.out.println("contains that serial,system ends");
			System.exit(0);
		}


 		System.out.println("===============================================");
		System.out.println("find object");
		System.out.println("type serial:");


 			emptylist1.find( 9873330 );
			System.out.println("found,it's:");
			emptylist1.getindexprint(emptylist1.find(9873330));

		try{
			emptylist1.find( 9873331 );
			System.out.println("found,it's:");
			emptylist1.getindexprint(emptylist1.find(9873331));
		}catch(NoSuchElementException e){
			System.out.println("didn't found it");
		}

		System.out.println("===============================================");
		System.out.println("check whether object is in list by serial number:");
		System.out.println("type serial:9873331");
		System.out.println("the answer is :"+emptylist1.contains(9873331) );
		System.out.println("type serial:51");
		System.out.println("the answer is :"+emptylist1.contains(51) );
		System.out.println("===============================================");
		System.out.println("show equals:");
		System.out.println("type serial:");




		try{
			System.out.println("clone start:");
			celllist clone1= new celllist( emptylist1);
			System.out.println("clone done");
			System.out.println("Are they equal(havent changed something yet)?");
 			System.out.println(	clone1.equals(emptylist1));
			 //just change serial
			System.out.println("changed serial only,and then?");
			clone1.replaceatindex(new cellphone(2787988,"Acer",572.20,2013),1);//return wont do anything
			System.out.println(	clone1.equals(emptylist1));
			//just replace brand
			System.out.println("changed brand ,and then?");
			clone1.replaceatindex(new cellphone(2787988,"cer",572.20,2013),1);//return wont do anything
			System.out.println(	clone1.equals(emptylist1));

			clone1.equals(emptylist1);
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println("===============================================");
		System.out.println("Cellphone's method:");
		System.out.println("default Cellphone...");
		cellphone demo1 = new cellphone();
		System.out.println(demo1);
		System.out.println("para Cellphone:");
		cellphone demo2 = new cellphone(165465, "lambo",256.1,2022);
		System.out.println(demo2);
		System.out.println("copy Cellphone:(copy default)");
		cellphone demo3 = new cellphone(demo1,22222 );
		System.out.println(demo3);
		System.out.println("clone Cellphone:(clone second one)");
		cellphone demo4 = demo2.clone();
		System.out.println(demo4);






	}}
