
public class Tickets {

// Attributes for prices & number of tickets
	private static double regularTicket = 3.50;
	private static double juniorTicket = 2.50;
	private static int seniorTicket = 1;
	private static int dailyTicket = 10;
	private static int weeklyTicket = 40;
	private int nbRegularTicket;
	private int nbJuniorTicket;
	private int nbSeniorTicket;
	private int nbDailyTicket;
	private int nbWeeklyTicket;

// default constructor (no parameters)
	public Tickets() {

		nbRegularTicket = 0;
		nbJuniorTicket = 0;
		nbSeniorTicket = 0;
		nbDailyTicket = 0;
		nbWeeklyTicket = 0;

	}

// constructor with the 5 int parameters
	public Tickets(int nbRegularTicket, int nbJuniorTicket, int nbSeniorTicket, int nbDailyTicket, int nbWeeklyTicket) {
		this.nbRegularTicket = nbRegularTicket;
		this.nbJuniorTicket = nbJuniorTicket;
		this.nbSeniorTicket = nbSeniorTicket;
		this.nbDailyTicket = nbDailyTicket;
		this.nbWeeklyTicket = nbWeeklyTicket;
	}

// copy method 
	public Tickets(Tickets copy) {
		this.nbRegularTicket = copy.nbRegularTicket;
		this.nbJuniorTicket = copy.nbJuniorTicket;
		this.nbSeniorTicket = copy.nbSeniorTicket;
		this.nbDailyTicket = copy.nbDailyTicket;
		this.nbWeeklyTicket = copy.nbWeeklyTicket;
	}

// Accessor & mutator methods for non-constant attributes
	public int getNbRegularTicket() {
		return nbRegularTicket;
	}

	public int getNbJuniorTicket() {
		return nbJuniorTicket;
	}

	public int getNbSeniorTicket() {
		return nbSeniorTicket;
	}

	public int getNbDailyTicket() {
		return nbDailyTicket;
	}

	public int getNbTicket() {
		return nbWeeklyTicket;
	}

	public void setNbRegularTicket(int nbRegularTicket) {
		this.nbRegularTicket = nbRegularTicket;
	}

	public void setNbJuniorTicket(int nbJuniorTicket) {
		this.nbJuniorTicket = nbJuniorTicket;
	}

	public void setNbSeniorTicket(int nbSeniorTicket) {
		this.nbSeniorTicket = nbSeniorTicket;
	}

	public void setNbDailyTicket(int nbDailyTicket) {
		this.nbDailyTicket = nbDailyTicket;
	}

	public void setNbWeeklyTicket(int nbWeeklyTicket) {
		this.nbWeeklyTicket = nbWeeklyTicket;
	}

// method to increase the number of each ticket
	public void addTickets(int nbRegularTicket, int nbJuniorTicket, int nbSeniorTicket, int nbDailyTicket,
			int nbWeeklyTicket) {
		this.nbRegularTicket += nbRegularTicket;
		this.nbJuniorTicket += nbJuniorTicket;
		this.nbSeniorTicket += nbSeniorTicket;
		this.nbDailyTicket += nbDailyTicket;
		this.nbWeeklyTicket += nbWeeklyTicket;

	}

// method for calculating the total tickets and return double
	public double ticketsTotal() {
		return (regularTicket * nbRegularTicket) + (juniorTicket * nbJuniorTicket) + (seniorTicket * nbSeniorTicket)
				+ (dailyTicket * nbDailyTicket) + (weeklyTicket * nbWeeklyTicket);

	}

// creating toString method to return a string
	public String Tickets_toString() {
		return nbRegularTicket + " x $3.50 + " + nbJuniorTicket + " x $2.50 + " + nbSeniorTicket + " x $1 + "
				+ nbDailyTicket + " x $10 + " + nbWeeklyTicket + " x $40";

	}

// method for comparing the tickets and return boolean
	public boolean tickets_equals(Tickets equal) {
		return (this.nbRegularTicket == equal.nbRegularTicket) && (this.nbJuniorTicket == equal.nbJuniorTicket)
				&& (this.nbSeniorTicket == equal.nbSeniorTicket) && (this.nbDailyTicket == equal.nbDailyTicket)
				&& (this.nbWeeklyTicket == equal.nbWeeklyTicket);

	}

}
