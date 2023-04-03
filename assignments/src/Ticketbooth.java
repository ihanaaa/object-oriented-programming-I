
public class Ticketbooth {

// Attributes 
	private Tickets tickets;
	private OPUSCard[] opusCards;

// default constructor 
	public Ticketbooth() {
		tickets = null;
		opusCards = null;
	}

// constructor of 2 parameters to set the initial value of each attribute	
	public Ticketbooth(Tickets tickets, OPUSCard[] opusCards) {

		// first attribute of type Tickets
		this.tickets = tickets;

		// second attribute of type OPUScards
		this.opusCards = opusCards;

		if (opusCards == null)
			this.opusCards = null;

	}

//#1 method to compare the total value of the tickets of two ticketbooth objects and returns boolean
	public boolean bothTicket(Ticketbooth sameVal) {

		return (this.tickets.ticketsTotal() == sameVal.tickets.ticketsTotal());

	}

//#2  method to compare the number of each type ticket of two ticketbooth objects and return boolean
	public boolean bothType(Ticketbooth sameNbType) {
		return (this.tickets.tickets_equals(tickets) == sameNbType.tickets.tickets_equals(tickets));

	}

//#3 method to return the total value of tickets and return double
	public double total() {
		return tickets.ticketsTotal();
	}

//#4 method to return the number of opus cards and return int
	public int totalNbOpus() {

		return this.opusCards.length;
	}

//#5 method for adding new opus card using array & return the length in int
	public int addOpus(OPUSCard opusArray) {
		OPUSCard[] tempAdd = new OPUSCard[opusCards.length + 1];
		for (int i = 0; i < opusCards.length; i++)
			tempAdd[i] = opusCards[i];
		int k = tempAdd.length - 1;
		tempAdd[k] = opusArray;
		opusCards = tempAdd;
		return tempAdd.length;
	}

//#6 method to remove an opus card and return boolean
	public boolean removeOpus(int opusArray) {

		if (opusCards.length > 0) {
			int k = 0;
			OPUSCard[] tempRemove = new OPUSCard[opusCards.length - 1];
			for (int i = 0; i < opusCards.length; i++) {
				if (i == opusArray)
					continue;
				else {
					if (k != 0)
						k++;
					tempRemove[k] = opusCards[i];

				}
			}
			opusCards = tempRemove;
			return true;
		} else
			return false;
	}

//#7 update method for expiry year and month in the opus card 
	public void updateExpiry(int newExpM, int newExpY) {

		for (int i = 0; i < opusCards.length; i++) {
			opusCards[i].setExpiryMonth(newExpM);
			opusCards[i].setExpiryYear(newExpY);
		}
	}

//#8 method for adding tickets to ticketbooth using the 5 parameters & return the new total value of tickets in double
	public double addTicket(int regularTicket, int juniorTicket, int seniorTicket, int dailyTicket, int weeklyTicket) {
		this.tickets.addTickets(regularTicket, juniorTicket, seniorTicket, dailyTicket, weeklyTicket);
		return total();
	}

// #9 method to compare the total value of tickets & the number of opus cards and return a boolean
	public boolean equals(Ticketbooth totalTicketOpus) {
		return (this.bothTicket(totalTicketOpus)) && (this.totalNbOpus() == totalTicketOpus.totalNbOpus());
	}

//#10 method to return the number of each ticket and everything for opus card to be string
	public String All_toString() {

		String everything = (tickets.Tickets_toString() + '\n');
		// case if the opus card greater than zero will return everything

		if (opusCards.length > 0) {

			for (int i = 0; i < opusCards.length; i++)
				everything = everything + (opusCards[i].Opus_toString() + '\n');
			return everything;
		} else {
			// if less than zero no opus card
			everything = everything + ("No OPUS cards" + '\n');
			return everything;
		}
	}

// #11 method to return a string with the breakdown of just the tickets

	public String justTickets_toString() {
		return this.tickets.Tickets_toString();
	}

}
