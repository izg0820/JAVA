package myPackage;
import java.util.Scanner;

public class MotorBoatDemo {

	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);

		MotorBoat test = new MotorBoat();

		int t=0;
		System.out.print("Insert the time: ");
		t=keyboard.nextInt();
		System.out.print("Insert the Maximum speed: ");
		test.M= keyboard.nextDouble();
		System.out.print("Insert the Current speed: ");
		test.s= keyboard.nextDouble();
		System.out.print("Insert the capacity of fuel tank: ");
		test.C= keyboard.nextDouble();
		System.out.print("Insert the amount of fuel in the tank: ");
		test.f= keyboard.nextDouble();
		System.out.print("Insert the Efficiency of the motor boat: ");
		test.e= keyboard.nextDouble();

		test.writeOutPut(t);
	}

}
