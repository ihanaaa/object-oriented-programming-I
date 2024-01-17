
public class OPUSCard {
	
// Attributes to track the opus card type, cardHolder and expiry (year & month)
	private String opusType;
	private String name;
	private int expiryMonth;
	private int expiryYear;

// default constructor method
	public OPUSCard() {

		opusType = null;
		name = null;
		expiryMonth = 0;
		expiryYear = 0;

	}
	
// constructor method with the 4 parameters
	public OPUSCard(String opusType, String name, int expiryMonth, int expiryYear) {

		this.opusType = opusType;
		this.name = name;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;

		if (this.expiryMonth < 1 || this.expiryMonth > 12)
			this.expiryMonth = 0;

	}
	
// copy method to copy card type, cardHolder and expiry (year & month)
	public OPUSCard(OPUSCard copy) {

		opusType = copy.opusType;
		name = copy.name;
		expiryMonth = copy.expiryMonth;
		expiryYear = copy.expiryYear;

	}
	
// get & set methods for all the attributes
	public String getOpusType() {
		return opusType;
	}

	public String getName() {
		return name;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
		if (this.expiryMonth < 1 || this.expiryMonth > 12)
			this.expiryMonth = 0;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	
// toString method to return any parameter to string
	public String Opus_toString() {

		if (expiryMonth < 10)

			return (this.opusType + "-" + this.name + "-0" + this.expiryMonth + "/" + this.expiryYear);

		else
			return (this.opusType + "-" + this.name + "-" + this.expiryMonth + "/" + this.expiryYear);
	}

//equal method to compare the equal tickets	
	public boolean opus_equals(OPUSCard same) {

		return (opusType == same.opusType) && (name == same.name) && (expiryMonth == same.expiryMonth)
				&& (expiryYear == same.expiryYear);
	}
}
