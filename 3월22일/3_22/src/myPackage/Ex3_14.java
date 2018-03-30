package myPackage;
import java.util.Scanner;


public class Ex3_14 {

	public static void main(String[] args) {
		int height=0,velocity,count=0,time=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter initial velocity of the ball : ");
		velocity=keyboard.nextInt();
		while(count<5)
		{
			if(time==1)
			{
				height=100;
			}
			System.out.println("Time: "+time + "  Height: "+ height);
			height+=velocity;
			
			if(height<0) 
			{
				System.out.println("Bounce!!");
				height*=-0.5;
				velocity*=-0.5;
				count++;
			}
			time++;
			velocity-=32;

		}
	}
}







