package PHW;

import java.util.Scanner;

public class Exe1_2b {

	public static void main(String[] args) {


		System.out.println("Enter two numbers:");
		
		int n1,n2,n3;
		
		Scanner keyboard = new Scanner(System.in);
		n1= keyboard.nextInt();
		n2= keyboard.nextInt();
		
		n3=n2-n1+1;
		
		System.out.println(n3);
		
	}

}
