import java.util.Scanner;
public class Ex5_12Demo {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Ex5_12 test1 = new Ex5_12();
		Ex5_12 test2 = new Ex5_12();
		test1.readInput();
		test2.readInput();
		test1.printOut();
		test2.printOut();
		if(test1.doequal(test2)){
			System.out.println("TRUE!!");
		}
		else {
			System.out.println("FALSE!!");
		}
	}
}
