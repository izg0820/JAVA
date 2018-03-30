package Package;
import java.util.Scanner;

public class Exe2_1b {

	public static void main(String[] args) {
		
		double fah;
		double cel;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Fahrenheit degree");
		fah = keyboard.nextInt();
		cel= 5*(fah-32)/9;
		System.out.println("Celsius = " + cel);

	}

}
