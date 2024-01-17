
import java.util.Scanner;

public class Bike {
	private String brand;
	private int wheels;
	private boolean isElectric;

	public Bike() {
		brand = null;
		wheels = 0;
		isElectric = false;
	}

	public Bike(String brand, int wheels, boolean isElectric) {

		this.brand = brand;
		this.wheels = wheels;
		this.isElectric = isElectric;

	}

	public String getbrand() {

		return brand;

	}

	public int getwheels() {
		return wheels;

	}

	public boolean getIsElectric() {

		return isElectric;
	}

	public void setbrand(String brand) {
		this.brand = brand;

	}

	public void setwheels(int wheels) {
		this.wheels = wheels;
	}

	public void setIsElectric(boolean isElectric) {

		this.isElectric = isElectric;
	}

	public boolean equals(Bike secondBike) {
		return brand == secondBike.brand && wheels == secondBike.wheels && isElectric == secondBike.isElectric;

	}

	public boolean bothElectric(Bike t) {

		if (this.isElectric && t.isElectric) {
			return true;
		}
		return false;

	}

	public String toString() {
		return "The bike of brand " + this.brand + " has " + this.wheels + " inch wheels and is electric is "
				+ this.isElectric;
	}

	public static void main(String[] args) {

		Scanner keyIn = new Scanner(System.in);
		String brand;
		int wheels;
		boolean isElectric;
		System.out.print("what is the brand of this Bike? ");
		brand = keyIn.nextLine();
		System.out.print("what is the size of the wheels ? ");
		wheels = keyIn.nextInt();
		System.out.print("Is it an electric Bike? (true or false) ");
		isElectric = keyIn.nextBoolean();
		Bike t1 = new Bike();
		Bike t2 = new Bike(brand, wheels, isElectric);

		System.out.println("The two Bikes are:");
		System.out.print(t1 + "\n" + t2);

		// Let's set up the 2nd Bike

		System.out.print("\n\nLet's set up the 1st Bike ...\n\tWhat brand is it? ");
		brand = keyIn.nextLine();
		brand = keyIn.nextLine();

		System.out.print("\tWhat is the size of the wheels? ");
		wheels = keyIn.nextInt();
		System.out.print("\tIs it an electric Bike (true or false)? ");
		isElectric = keyIn.nextBoolean();
		t1.setbrand(brand);
		t1.setwheels(wheels);
		t1.setIsElectric(isElectric);
		System.out.println("Bike 1: " + t1);

		System.out.println("Are the 2 Bike objects equal?" + (t1.equals(t2) ? " Yes" : " No"));
		System.out.println("Are they both electric Bikes? " + t1.bothElectric(t2));
		t1.setIsElectric((!t1.getIsElectric()));

		System.out.print("Now are they both electric Bikes? " + t1.bothElectric(t2));
		keyIn.close();
	}
}
