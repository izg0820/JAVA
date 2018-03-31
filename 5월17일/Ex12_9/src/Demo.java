import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		long squares;
		long grains;
		long sum = 0;

		System.out.print("Input the number of k squares : ");
		squares = keyboard.nextInt();
		while (squares > 64) {
			System.out.println("Invalid data!!");
			System.out.print("Input the number of k squares : ");
			squares = keyboard.nextInt();
		}
		System.out.print("Input the nunmber of grains : ");
		grains = keyboard.nextInt();
		for (int i = 1; i <= squares; i++)
			sum += Kingdom.getTotalGrains(i, grains);
		System.out.println("total : " + sum);
	}

	

}
