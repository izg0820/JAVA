import java.util.Scanner;

public class Ex6_7Demo {

	public static void main(String[] args) {
		String character1;
		String character2;
		String term;
		int rate1, rate2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Insert the Character1: ");
		character1 = keyboard.nextLine();
		System.out.print("Insert the rate of Character1: ");
		rate1= keyboard.nextInt();
		Ex6_7 test = new Ex6_7(character1);
		test.setRating(rate1);
		term = keyboard.nextLine();
		System.out.print("Insert the Character2: ");
		character2 = keyboard.nextLine();
		System.out.print("Insert the rate of Character2: ");
		rate2=keyboard.nextInt();	
		Ex6_7 test2 = new Ex6_7(character2);
		test2.setRating(rate2);
		System.out.println(character1+"and "+character2+"'s degree of match is "+test.getCompatability(character2, rate2));

	}

}
