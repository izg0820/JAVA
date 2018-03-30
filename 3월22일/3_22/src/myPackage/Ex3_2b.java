package myPackage;
import java.util.Scanner;

public class Ex3_2b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int per,counta=0,countb=0,countc=0,countd=0,countf=0;
		
		while(true)
		{
			System.out.println("Enter the percentage");
		    per=keyboard.nextInt();
			if(per<0)
			{
				break;
			}
		    if(per>100)
			{
				continue;
			}
		    else if((per>=90)&&(per<=100))
			{
				counta++;
			}
			else if((per>=80)&&(per<90))
			{	
				countb++;
			}
			else if((per>=70)&&(per<80))
			{	
				countc++;
			}
			else if((per>=60)&&(per<70))
			{	
				countd++;
			}
			else if((per>=0)&&(per<60))
			{	
				countf++;
			}
			
			
			
		}
		System.out.println("A count: "+ counta);
		System.out.println("B count: "+ countb);
		System.out.println("C count: "+ countc);
		System.out.println("D count: "+ countd);
		System.out.println("F count: "+ countf);
		

	}

}
