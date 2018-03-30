import java.util.Scanner;

public class Ex4_5Demo {

	public static void main(String[] args) {
		int a,b,c,d,f;
		Scanner keyboard = new Scanner(System.in);
		Ex4_5 test = new Ex4_5();
		System.out.print("How many student get 'A' grade?");
		a=keyboard.nextInt();
		System.out.print("How many student get 'B' grade?");
		b=keyboard.nextInt();
		System.out.print("How many student get 'C' grade?");
		c=keyboard.nextInt();
		System.out.print("How many student get 'D' grade?");
		d=keyboard.nextInt();
		System.out.print("How many student get 'F' grade?");
		f=keyboard.nextInt();

		test.setGrade(a, b, c, d, f);
		test.graph();
	}

}
