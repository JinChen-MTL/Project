import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class cellphone  implements Cloneable {

	private long serialnum;
	private String brand;
	private int year;
	private double price;

	public cellphone() {
		System.out.println("nothing,it's the default constructor-----------cellphone class");
	}

	public long getSerialnum() {
		return serialnum;
	}

	public void setSerialnum(long serialnum) {
		this.serialnum = serialnum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public cellphone(long serialnum, String brand, double price,int year ) {
		this.serialnum = serialnum;
		this.brand = brand;
		this.year = year;
		this.price = price;
	}
	public cellphone(String brand, double price,int year,celllist k) {
		Scanner input = new Scanner(System.in);
		long serial=0;
		boolean tempoo=true;
		while(tempoo){
			System.out.println("enter serial number(must be not seen before):");
			  serial=input.nextLong();
			if(!k.contains(serial))
				tempoo=false;
		}
		input.close();
		new cellphone( serial,brand,   price,  year );

	}

	public cellphone(cellphone k, long value) {
		brand = k.brand;
		year = k.year;
		price = k.price;
		serialnum = value;// need to be different than others
	}

	public cellphone( String brand, double price,int year ) {
		Scanner input = new Scanner(System.in);
		long serial=0;
 			System.out.println("enter serial number(must be not seen before):");
		serial=input.nextLong();
		this.serialnum=serial;
		this.brand = brand;
		this.year = year;
		this.price = price;
		input.close();
	}

	public cellphone clone() {
		cellphone user = null;
 		long a1=0;
 
 		try {
			user = (cellphone) super.clone();
		} catch (CloneNotSupportedException e) {
			cellphone  user1 = new cellphone(  this.brand, this.price, this.year );
			 return user1;
		}
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter serialnum?");
 		long a12 = input2.nextLong();
 		user.setSerialnum(a12) ;
		System.out.println("clone object done!");
        input2.close();
		return user;

	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof cellphone)) {
			return false;
		}
		cellphone other = (cellphone) obj;
		return this.brand.equals(other.brand)&& Double.compare(other.price, price) == 0 && year == other.year;
		//serial number will be different 
	}


	@Override
	public String toString() {
		return "[" + serialnum + ": " + brand + " "+price+"$ "+year+"]---> ";
	}
	
 
}
