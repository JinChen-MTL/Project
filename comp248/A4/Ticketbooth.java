public class Ticketbooth {

    Tickets tickets = new Tickets();

    OPUSCard[] opusCard = new OPUSCard[5];
    
    //DEFAULT CONSTRUCTOR
    public Ticketbooth() {
    	
    }
    //CONSTRUCTOR
    public Ticketbooth(Tickets tickets, OPUSCard[] opusCard) {
        this.tickets = tickets;
        this.opusCard = opusCard;
    }
    //AVOID RISKS AND DETECT NULL
    boolean isEmpty(OPUSCard[] o){
        String temp = "";
        int size = o.length;
        for (int i=0;i<size;i++){
            if(o[i]!=null){
                temp +=o[i].getCard_holder();
            }
        }
        if(temp == ""){
            return true;
        }else{
            return false;
        }
    }

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    public OPUSCard[] getOpusCard() {
        return opusCard;
    }

    public void setOpusCard(OPUSCard[] opusCard) {
        this.opusCard = opusCard;
    }
//return true if total value of both OBJECTS' tickets are equal
     boolean priceEquals(Tickets anotherTicketbooth){
        if(tickets.ticketsTotals() == anotherTicketbooth.ticketsTotals()){
            return true;
        }else{
            return false;
        }
    }
//return true if number of each type of tickets of two objects are equal 
    boolean countEquals(Tickets anotherTicketbooth){
        return(this.tickets.equals(anotherTicketbooth));
    }     
//return the total value of the tickets in a ticketbooth
    public double ticketsPrice(){
        return (this.tickets.ticketsTotals());
    }
  //number of opus card in a teethbooth
    public int OPUSCardCount(){
        int a = 0;
        for(int i = 0;i<this.opusCard.length;i++){
            if(this.opusCard[i]!=null){
                a++;
                
            }
        }
        return a;
    }
    
//add a new opus card
    public int addOPUSCard(OPUSCard opusCard){
        for(int i = 0;i<this.opusCard.length;i++){
            if(this.opusCard[i]==null){
                this.opusCard[i] = opusCard;
                break;
            }
        }
        int res = this.OPUSCardCount();
        System.out.println("You now have "+res+" OPUS cards");
        return res;
    }
   //remove an OPUS card form a ticketbooth
    public boolean removeOPUSCard(int temp){//example

            this.opusCard[temp] = null;
            System.out.println("Card was removed successfully");
            return true;

    }
    //update the expiry month and year
    public void updateMonthandYear(int temp,int month,int year){
        this.opusCard[temp].setExpiry_month(month);
        this.opusCard[temp].setExpiry_year(year);
        System.out.println("Expiry date updated.");
    }
    //add tickets to a ticketbooth
    public double addTickets(int Re,int Ju,int Se,int Da,int We){
        this.tickets.setRegular_ticket(this.tickets.getRegular_ticket()+Re);
        this.tickets.setJunior_ticket(this.tickets.getJunior_ticket()+Ju);
        this.tickets.setSenior_ticket(this.tickets.getSenior_ticket()+Se);
        this.tickets.setDaily_ticket(this.tickets.getDaily_ticket()+Da);
        this.tickets.setWeekly_ticket(this.tickets.getWeekly_ticket()+We);
        System.out.println("You now have $"+ticketsPrice());
        return (ticketsPrice());
}
    //if Tvalue of both object and number of cards tickets equal. 
    boolean equals(Ticketbooth anotherTicketbooth){
        return ((this.ticketsPrice()==anotherTicketbooth.ticketsPrice())&&(this.OPUSCardCount()==anotherTicketbooth.OPUSCardCount()));
    }

//tostring 
    public String toString() {
        String base = "";
        int size = opusCard.length;

        for (int i = 0; i < size; i++) {
            base += opusCard[i].toString()+"\n";
        }
        return this.tickets.toString()+
                base;}
    
    //RETURING A STRING WITH JUST THE BREAKDOWN OF THE TICKETS
        public String returnTickets() {
        	  return this.tickets.toString();
        	 }
        
    }
    



