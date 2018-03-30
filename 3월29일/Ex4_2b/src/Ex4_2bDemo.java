import java.util.Scanner;
public class Ex4_2bDemo {

	public static void main(String[] args) {
		int choice;
		
		Scanner keyboard = new Scanner(System.in);
		Ex4_2b test = new Ex4_2b();

		while(true)
		{
			System.out.println("1.Increase 2.Decrease 3.Reset 4.Print 5.Exit");
			choice = keyboard.nextInt();
			if(choice==1)
			{
				test.setCount(choice);
				test.getIncrease();
			}
			else if(choice==2)
			{
				test.setCount(choice);
				test.getDecrease();
			}
			else if(choice==3)
			{
				test.setCount(choice);
				test.getCount();
			}
			else if(choice==4){
				test.setCount(choice);
				test.getPrint();
			}
			else
				break;
		}

	}

}
