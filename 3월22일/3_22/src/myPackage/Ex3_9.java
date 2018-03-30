package myPackage;
import java.util.Scanner;


public class Ex3_9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String str1,str2="",term2="";

		System.out.print("Insert the word:");
		str1=keyboard.nextLine();
		while(!(str1.equals("quit")))
		{
		str1=str1.toLowerCase();
		str2=str1.substring(1,str1.length())+str1.charAt(0);
		
		for(int i=str1.length()-1;i>=0;i--)
			{
			term2=term2+str2.charAt(i);
			}
		
		if(term2.equals(str1))
			{
			System.out.println("TRUE!!");
			
			}
		else
		{
			System.out.println("FALSE!!");
			
		}
		term2="";
		System.out.print("Insert the word:");
		str1=keyboard.nextLine();	
		}
	}
}
