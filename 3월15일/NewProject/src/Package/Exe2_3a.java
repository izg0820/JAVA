package Package;
import java.util.Scanner;

public class Exe2_3a {

	public static void main(String[] args) {
		
		int price,change,quar,dim,nick;
		System.out.print("Enter the price :");
		Scanner keyboard = new Scanner(System.in);
		price = keyboard.nextInt();
		
		change = 100 -price;
		quar = change/25;
		change = change-(25*quar);	
		dim = change/10;
		change = change- (10*dim);
		nick = change/5;
		System.out.println("quarters = "+ quar);
		System.out.println("dimes = "+ dim);
		System.out.println("nickels = "+ nick);

	}

}
