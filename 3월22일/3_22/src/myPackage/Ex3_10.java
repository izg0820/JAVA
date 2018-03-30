package myPackage;
import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		double rate,year,month,day,account;
		int a;
		Scanner keyboard = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.cacaulate 2.exit");
			a=keyboard.nextInt();
			if(a==1)
			{
				System.out.print("Insert the account:");
				account=keyboard.nextInt();
				System.out.print("Insert the rate(%):");
				rate=keyboard.nextInt();
				rate=rate*0.01;
				year=month=day=account;
				for(int i=0;i<10;i++)
				{
					year = year*(1+rate);

				}

				for(int i=0;i<120;i++)
				{
					month=month*(1+(rate/12));

				}

				for(int i=0;i<3650;i++)
				{
					day=day*(1+(rate/365));

				}

				System.out.println("anuual = "+year);
				System.out.println("monthly = "+ month);
				System.out.println("daily = "+day);
				System.out.println("");

			}
			else if(a==2)
				break;
			else
			{
				System.out.println("Invaild choice!! Please choice again");
				continue;
			}
		}

	}
}
