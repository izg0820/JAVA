package myPackage;
import java.util.Scanner;

public class Ex3_2a {

	public static void main(String[] args) {
		int max=0,min=0,num=0,count=0,sum=0;
		double aver=0;
		Scanner keyboard = new Scanner(System.in);
		while(true)
		{
				System.out.println("Enter the integer");
				num=keyboard.nextInt();
					if(num<0)
					{
						break;
					}
					else 
					{
						if(count==0)
						{
							max=num;
							min=max;
						}
						sum=sum+num;
						count++;
						if(num>=max)
						{
							max=num;
						}
						else if(num<=min)
						{
							min=num;
						}							
					}
		}					
		aver=(double)sum/count;	
		System.out.println(max);
		System.out.println(min);
		System.out.println(aver);
		
	}

}
