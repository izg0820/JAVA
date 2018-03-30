import java.util.Scanner;

public class Ex4_2aDemo {
	public static void main(String[] args) {

		Scanner keyboard  = new Scanner(System.in);

		Ex4_2a test = new Ex4_2a();

		int t=0;
		System.out.print("Insert the time: ");
		t=keyboard.nextInt();
		test.readInput();
		System.out.println("Travel distance: "+ test.getfuelM(t));
		System.out.println("Amount of fuel used(max): "+ test.getfuelC(t));
		System.out.println("Amount of fule used(curret): "+ test.getDis1(t));
		System.out.println("Travel distance: "+ test.getDis2());
	}

}
