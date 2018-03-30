package Package;
import java.util.Scanner;

public class Exe2_3b {

	public static void main(String[] args) {
		
		double depth,radius,V;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the radius:");
		radius = keyboard.nextDouble();
		System.out.print("Enter the depth:");
		depth = keyboard.nextDouble();
		
		V = (radius/12)*(radius/12)*depth*Math.PI*7.48;
		System.out.println(V+ " gallons");
		


	}

}
