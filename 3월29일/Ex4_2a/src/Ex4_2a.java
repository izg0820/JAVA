import java.util.Scanner;

public class Ex4_2a {
	public double C=300;
	public double M=150;
	private double e;
	private double f;
	private double s;

	Scanner keyboard  = new Scanner(System.in);
	
	public void readInput() {
		System.out.print("Insert the Current speed: ");
		s= keyboard.nextDouble();
		this.setS(s);
		System.out.print("Insert the amount of fuel in the tank: ");
		f= keyboard.nextDouble();
		this.setF(f);
		System.out.println("Insert the Efficiency of the motor boat: ");
		e= keyboard.nextDouble();
		this.setE(e);
	}

	public void setF(double f) {
		if(f>this.C){
			System.out.println("Amount of fuel in the tank bigger than capacity!!");
			System.exit(0);
		}
		else
			this.f = f;
	}
	public void setS(double s) {
		if(s>this.M){
			System.out.println("Current speed is faster than maximun speed!!");
			System.exit(0);
		}
		else 
			this.s = s;
	}
	public void setE(double e) {
		if(e<0) {
			System.out.println("Efficiency is non-negative!!");
			System.exit(0);
		}
		else
			this.e=e;
	}

	
	public double getfuelM(int t) {
		return e*M*M*t;
	}

	public double getfuelC(int t) {
		return e*s*s*t;
	}
	public double getDis1(int t) {
		return s*t;
	}
	public double getDis2() {
		return f/(s*e);
	}

}


