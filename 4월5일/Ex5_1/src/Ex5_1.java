import java.util.Scanner;

public class Ex5_1 {
	public double M=300;
	public double C=1000;
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
		System.out.print("Insert the Efficiency of the motor boat: ");
		e= keyboard.nextDouble();
		this.setE(e);
		System.out.println("");
	}
	
	public void setS(double s)
	{
		if(this.M<s){
			System.out.println("Error!!");
			System.exit(0);
		}
		else 
			this.s = s;
	}
	public void setF(double f)
	{
		if(this.C<f){
			System.out.println("Error!");
			System.exit(0);
		}
		else
			this.f=f;
	}
	public void setE(double e)
	{
		if(e<0){
			System.out.println("Error!");
			System.exit(0);
		}
		else 
			this.e=e;
	}

	public boolean equals(Ex5_1 anyway)
	{
		return (this.s==anyway.s&&this.e==anyway.e&&this.f==anyway.f);
	}
	
	public double getS(){
		return s;
	}
	public double getF() {
		return f;
	}
	public double getE() {
		return e;
	}
}
