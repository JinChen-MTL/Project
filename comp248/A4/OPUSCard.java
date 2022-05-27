public class OPUSCard {

	private String card_type;
	private String card_holder;
	// private int expiry_month;
	private int expiry_month;
	// private int expiry_year;
	private int expiry_year;

	//DEFAULT CONSTRUCTOR
	public OPUSCard() {
	}

	//CONTSRUCTOR WITH 4 INTEGER PARAMETERS
	public OPUSCard(String card_type, String card_holder, int expiry_month, int expiry_year) {
		this.card_type = card_type;
		//MONTH BETWEEN 1 and 12
		if(1<=expiry_month&&expiry_month<=12)
				this.expiry_month = expiry_month;
		else this.expiry_month=0;
		this.card_holder = card_holder;
		this.expiry_year = expiry_year;
	}
	//COPY CONSTRUCTOR
	public OPUSCard(OPUSCard OPUSCard1) {
		this.card_type = OPUSCard1.card_type;
		this.card_holder = OPUSCard1.card_holder;
		this.expiry_month = OPUSCard1.expiry_month;
		this.expiry_year = OPUSCard1.expiry_year;
	}
	
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}



	public void setCard_holder(String card_holder) {
		this.card_holder = card_holder;
	}



	//Accessor for all
	
	public String getCard_holder() {
		return card_holder;
	}
	public String getCard_type() {
		return card_type;
	}

	public int getExpiry_month() {
		return expiry_month;
	}
	public int getExpiry_year() {
		return expiry_year;
	}
	
	//mutator for only expiry month and expiry year.
      public void setExpiry_month(int expiry_month) {
    	  //not btw 1 and 12,set 0
		if (expiry_month > 0 && expiry_month < 13) {
			this.expiry_month = expiry_month;
		} else {
			this.expiry_month = 0;
		}

	}
	public void setExpiry_year(int expiry_year) {
		this.expiry_year = expiry_year;
	}
//return a string indeicating type,name and expire date
	public String toString() {
		if(expiry_month<10)
		System.out.println(card_type + "-" + card_holder + "-" +"0"+expiry_month + "/" + expiry_year);
		else
		System.out.println(card_type + "-" + card_holder + "-" +expiry_month + "/" + expiry_year);
		return card_type + "-" + card_holder + "-" + expiry_month + "/" + expiry_year;

	}
//which will return true if the two objects of type OPUSCard are identical,otherwise false.
	public boolean equals(OPUSCard opuscard) {
		return (this.getCard_holder().equals(opuscard.getCard_holder())
				&& this.getCard_type().equals(opuscard.getCard_type())
				&& this.getExpiry_month() == opuscard.getExpiry_month()
				&& this.getExpiry_year() == opuscard.getExpiry_year());

		
	}

}
