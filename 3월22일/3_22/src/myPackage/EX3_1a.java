package myPackage;
import java.util.Scanner;

public class EX3_1a {

	public static void main(String[] args) {
		int check;
		double charge;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How much is the check of your?");
		check=keyboard.nextInt();
		
		if(check<10)
		{
			charge=1;
		}
		else if((check>=10)&&(check<100))
		{
			charge=check*0.1;
		}
		else if((check>=100)&&(check<1000))
		{
			charge=check*0.05+5;
		}
		else
		{
			charge = check*0.01+40;
		}
		
		System.out.println("$"+charge);
	}
}
