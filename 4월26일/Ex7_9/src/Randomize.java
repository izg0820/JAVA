import java.util.Scanner;
public class Randomize {
	
	Scanner keyboard = new Scanner(System.in);
	private int[] random = new int[10];
	private int[] arr1 = new int[5];
	private int[] arr2 = new int[5];
	private int pinNum;
	private int div=10000;
	private int check=0;
	
	public void readInput(){
		System.out.print("Insert the your password : ");
		pinNum = keyboard.nextInt();
		setPinNum(pinNum);
		setRandomNum();
		System.out.println("PIN : 0 1 2 3 4 5 6 7 8 9");
		System.out.print("NUM : ");
		for (int i = 0; i < 10; i++)
			System.out.print( random[i]+" " );
		System.out.println(" ");

		System.out.print("Insert the pin number : ");
		pinNum = keyboard.nextInt();
		setPinNum2(pinNum);

	}
	
	public void readOutput(){
		if (checkPinNum(arr2, arr1) == true)
			System.out.println("correct password!");
		else
			System.out.println("wrong password!");
	}
	
	public void setPinNum(int num) {
		pinNum = num;
		for (int i = 0; i < 5; i++) {
			arr1[i] = num / div;
			num %= div;
			div /= 10;
		}
		div = 10000;
	}

	public void setPinNum2(int num) {
		pinNum = num;
		for (int i = 0; i < 5; i++) {
			arr2[i] = num / div;
			num %= div;
			div /= 10;
		}
	}

	public void setRandomNum() {
		for (int i = 0; i < 10; i++)
			random[i] = (int) (3 * Math.random() + 1);
	}

	public boolean checkPinNum(int[] arr1, int arr2[]) {
		for (int i = 0; i < 5; i++) {
			if (random[arr2[i]] == arr1[i])
				check++;
		}

		if (check == 5)
			return true;
		else
			return false;
	}

}
