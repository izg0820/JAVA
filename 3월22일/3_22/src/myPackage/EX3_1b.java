package myPackage;
import java.util.Scanner;

public class EX3_1b {

	public static void main(String[] args) {
		
		int cost,quarter,dime,nickel,input,charge;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the cost");
		cost=keyboard.nextInt();
		System.out.println("Enter the input($)");
		input=keyboard.nextInt();
		
		if(cost<25)
		{
			System.out.println("Error!");
		}
		else 
		{
			charge=(input*100)-cost;
			quarter=charge/25;
			charge=charge-(quarter*25);
			dime=charge/10;
			charge=charge-(dime*10);
			nickel=charge;
			System.out.println("quarter: "+quarter);
			System.out.println("dime: "+dime);
			System.out.println("nickel:"+nickel);
		}
			
	}

}
