import java.util.Scanner;
public class Ex6_2bDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Ex6_2b test = new Ex6_2b();
		int h;
		int m;
		System.out.print("What time is now?:  ");
		h=keyboard.nextInt();
		m=keyboard.nextInt();
		test.setTime(h, m);
		test.setTime2(h, m, null);
		System.out.println(test.getTime12());
		System.out.println(test.getTime24());
		
		
		

	}

}
