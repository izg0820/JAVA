package myPackage;
import java.util.Scanner;

public class Ex3_13 {

	public static void main(String[] args) {
		int num,i,k;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Insert the number:");
		num=keyboard.nextInt();
		
		for(i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");			
		}
		
		for(i=num-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}