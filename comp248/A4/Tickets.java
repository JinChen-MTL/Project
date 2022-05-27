public class Tickets {

	private int Regular_ticket;
	private int Junior_ticket;
	private int Senior_ticket;
	private int Daily_ticket;
	private int Weekly_ticket;

//default constructor
	public Tickets() {
	}
//CONSTRUCTOR WITH 5 INTEGER
	public Tickets(int Regular_ticket, int Junior_ticket, int Senior_ticket, int Daily_ticket, int Weekly_ticket) {
		this.Daily_ticket = Daily_ticket;
		this.Junior_ticket = Junior_ticket;
		this.Senior_ticket = Senior_ticket;
		this.Regular_ticket = Regular_ticket;
		this.Weekly_ticket = Weekly_ticket;
	}
//ACCESSOR AND MUTATOR
	public int getRegular_ticket() {
		return Regular_ticket;
	}

	public void setRegular_ticket(int Regular_ticket) {
		this.Regular_ticket = Regular_ticket;
	}

	public int getJunior_ticket() {
		return Junior_ticket;
	}

	public void setJunior_ticket(int Junior_ticket) {
		this.Junior_ticket = Junior_ticket;
	}

	public int getDaily_ticket() {
		return Daily_ticket;
	}

	public void setDaily_ticket(int Daily_ticket) {
		this.Daily_ticket = Daily_ticket;
	}

	public int getSenior_ticket() {
		return Senior_ticket;
	}

	public void setSenior_ticket(int Senior_ticket) {
		this.Senior_ticket = Senior_ticket;
	}

	public int getWeekly_ticket() {
		return Weekly_ticket;
	}

	public void setWeekly_ticket(int Weekly_ticket) {
		this.Weekly_ticket = Weekly_ticket;
	}
//INCREASE NUM OF EACH TICKETS BY INDICATED NUM
	public void addTickets(int one, int two, int three, int four, int five) {
		setRegular_ticket(getRegular_ticket() + one);
		setJunior_ticket(getJunior_ticket() + two);
		setSenior_ticket(getSenior_ticket() + three);
		setDaily_ticket(getDaily_ticket() + four);
		setWeekly_ticket(getWeekly_ticket() + five);

	}
//RETURN A DOUBLE INDICAT TOTAL VALUE OF TICKETS IN TICKETBOOTH
	public double ticketsTotals() {
		return (this.Daily_ticket * 10 + this.Junior_ticket * 2.5 + this.Regular_ticket * 3.5 + this.Senior_ticket * 1
				+ this.Weekly_ticket * 40);
	}
//RETURN A STRING CLEARLY INDICATING THE COUNT OF EACH TICKET IN THE TICKETBOOTH
	public String toString() {
//        System.out.println(Regular_ticket + " × $3.50 + " + Junior_ticket + " × $2.50 + " + Senior_ticket + " × $1.0 + " + Daily_ticket + " × $10 + " + Weekly_ticket + " × $40  ");
		return Regular_ticket + "x$3.50 + " + Junior_ticket + "x$2.50 + " + Senior_ticket + "x$1.0 + " + Daily_ticket
				+ "x$10 + " + Weekly_ticket + "x$40  ";
	}
//return true if the two objects of type Tickets being compared have the same breakdown of tickets and false otherwise.
	public boolean equals(Tickets anotherTickets) {
		return ((this.Daily_ticket == anotherTickets.Daily_ticket)
				&& (this.Senior_ticket == anotherTickets.Senior_ticket)
				&& (this.Junior_ticket == anotherTickets.Junior_ticket)
				&& (this.Regular_ticket == anotherTickets.Regular_ticket)
				&& (this.Weekly_ticket == anotherTickets.Weekly_ticket));
	}

}
