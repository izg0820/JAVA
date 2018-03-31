import java.util.Scanner;
public class Demo {

	public static void main(String[] args) throws TimeFormatException{
		Scanner kb =new Scanner(System.in);
		char choice='y';
		String time="";
		Notation test = new Notation();
		while(true){
			try
			{
				System.out.println("Enter time in 24-hour notation: ");
				test.setTime(kb.nextLine());
				time=test.getTime();
				if(TimeFormatException.checkTime(time)==true){
					System.out.println("That is the same as");
					System.out.println(test.change(time));
				}
				else 
					throw new TimeFormatException();

			}

			catch(TimeFormatException e){
				System.out.println(e.getMessage()+test.getTime());
			}

			System.out.println("Again? (y/n)");
			choice= kb.nextLine().charAt(0);
			if (choice == 'n' ) {
				System.out.println("End of program");
				System.exit(0);
			}
		}
	}
}
