package Package;
import java.util.Scanner;


public class Exe2_1a {

	public static void main(String[] args) {

		int a,b;
		
		System.out.println("Enter 4-digit integer");
		Scanner keyboard = new Scanner(System.in);
		
		a= keyboard.nextInt();
		System.out.println(a/1000);
		b=a%1000;
		System.out.println(b/100);
		a=b%100;
		System.out.println(a/10);
		b=a%10;
		System.out.println(b);
	}

}
