package myPackage;
import java.util.Scanner;

public class EX3_1c {

	public static void main(String[] args) {
		
		char grade;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the grade");
		grade=keyboard.next().charAt(0);
		
		switch(grade){
		case 'A':
			System.out.println("4.0");
			break;
		case 'B':
			System.out.println("3.0");
			break;
		case 'C':
			System.out.println("2.0");
			break;
		case 'D':
			System.out.println("1.0");
			break;
		default:
			System.out.println("0.0");
			break;
		}

	}

}
