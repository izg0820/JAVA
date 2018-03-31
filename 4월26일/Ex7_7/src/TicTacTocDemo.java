import java.util.Scanner;
public class TicTacTocDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice;
		TicTacToc test = new TicTacToc();


		while(true){
			System.out.println("1.Start 2.reStart 3.Exit");
			choice=keyboard.nextInt();
			switch(choice){
			case 1:
				test.Initialize();
				test.Insertpoint();
			case 2:
				test.Initialize();
				test.printOut();
				break;
			case 3:
				System.exit(0);
			}

		}
	}
}


