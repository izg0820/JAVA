import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.print("Input the number : ");
		n = keyboard.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Fibo.Fibonacci(i);
			if (i == 0)
				System.out.println("Fibonacci #" + (i + 1) + " = " + arr[i]);
			else if (i == 1)
				System.out.println("Fibonacci #" + (i + 1) + " = " + arr[i]);
			else
				System.out.println("Fibonacci #" + (i + 1) + " = " + arr[i] + "; " + arr[i] + "/" + arr[i - 1] + " = "
						+ (double) arr[i] / arr[i - 1]);
		}
	}
	

	}


