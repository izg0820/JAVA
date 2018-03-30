import java.util.Scanner;
public class Ex6_1bDemo {

	public static void main(String[] args) {
		int rN1,rN2;
		int piR1,piR2;
		int choice;
		int term1,term2;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Insert the room number:");
		rN1=keyboard.nextInt();
		System.out.print("Insert the number of people in room:");
		piR1=keyboard.nextInt();
		Ex6_1b test1 = new Ex6_1b(rN1,piR1);
		System.out.print("Insert the room number:");
		rN2=keyboard.nextInt();
		System.out.print("Insert the number of people in room:");
		piR2=keyboard.nextInt();
		Ex6_1b test2 = new Ex6_1b(rN2,piR2);
		while(true){
			System.out.println("1.Add 2.Remove 3.Exit");
			choice = keyboard.nextInt();
			if(choice==1){
				System.out.println("What is room number?");
				term1= keyboard.nextInt();
				System.out.println("How many people enter the room?");
				term2=keyboard.nextInt();
				test1.addOneToRoom(term1, term2);
				test2.addOneToRoom(term1, term2);
			}
			else if(choice==2)
			{
				System.out.print("What is room number? ");
				term1= keyboard.nextInt();
				System.out.print("How many people exit the room? ");
				term2=keyboard.nextInt();
				test1.addOneToRoom(term1, term2);
				test2.addOneToRoom(term1, term2);
			}
			else if(choice==3)
			{
				System.exit(0);
			}


		}


		
	}

}
